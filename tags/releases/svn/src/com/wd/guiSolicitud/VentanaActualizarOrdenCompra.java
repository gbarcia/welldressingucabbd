/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaProcesarOrdenCompra.java
 *
 * Created on 18-ene-2009, 12:34:28
 */
package com.wd.guiSolicitud;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Item;
import com.wd.dominio.OrdenCompra;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.gui.VentanaConsultaEdicionProveedor2;
import com.wd.guiSolicitud.particular.ControlGuiOrdenCompra;
import com.wd.servicios.ControlGeneral;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class VentanaActualizarOrdenCompra extends javax.swing.JFrame {

    private Proveedor proveedorActual;
    private CentroDistribucion centroActual;
    private ControlGuiOrdenCompra control = new ControlGuiOrdenCompra();
    private Collection<Producto> productosProveedor;
    private ArrayList<Producto> carritoCompra = new ArrayList();
    private DefaultTableModel ModeloOrden = new DefaultTableModel();
    private ControlGeneral controlG = ControlGeneral.getInstance();
    private int contador = 0;
    private double costoNeto;
    private double costoTotal;
    private double iva = 1.09;
    private Integer numOr = 0;
    private OrdenCompra ordenActual;

    /** Creates new form VentanaProcesarOrdenCompra */
    public VentanaActualizarOrdenCompra(OrdenCompra oc) {
        initComponents();
        this.ordenActual = oc;

        if (oc.getStatus() != 0) {
            this.jButton7.setEnabled(false);
        }
        this.panelAgregar.setVisible(false);
        String RIFprove = oc.getProveedorRif();
        this.proveedorActual = this.controlG.consultarProveedor(RIFprove);
        this.centroActual = new CentroDistribucion();
        this.centroActual.setCodigo(oc.getCentroCodigo());
        this.centroActual.setNombre(oc.getNombreCentro());

        this.carritoCompra = this.control.itemToProducto(oc.getColeccionProductos(), this.proveedorActual.getRif());
        this.llenarTabla();
        Integer Totalneto = this.obtenerTotalNeto();

        this.jlCostoNeto.setText(Totalneto.toString());
        Double Total = this.obtenerTotal();
        this.jlCostoTotal.setText(Total.toString());

        Double diferencia = Total - Totalneto;
        this.jliva.setText(diferencia.toString());

        this.fechaEst.setText(oc.getFechaEstimada().toString());
        this.fechaGen.setText(oc.getFechaGenerada().toString());

        this.JcEstado.setSelectedIndex(oc.getStatus());

        this.productosProveedor = this.control.traerProductosParaProveedor(proveedorActual.getRif());

        numOr = oc.getId();
        this.jlorden.setText(numOr.toString());

        this.jlCentroNombre.setText(centroActual.getNombre());
        this.jlProveedorNombre.setText(proveedorActual.getNombre());
        Integer centroCodigo = centroActual.getCodigo();
        this.jtCentroCodigo.setText(centroCodigo.toString());
        this.jtProvedorCodigo.setText(proveedorActual.getRif());
    }

    private Integer obtenerCostoProducto(Integer idProducto) {
        Integer costo = 0;
        for (Producto producto : productosProveedor) {
            if (producto.getId() == idProducto) {
                costo = producto.getPrecio();
            }
        }
        return costo;
    }

    private Integer obtenerSubtotal(int costo, int cantidad) {
        return costo * cantidad;
    }

    private void llenarTabla() {
        ModeloOrden = new DefaultTableModel();
        ModeloOrden.addColumn("Id");
        ModeloOrden.addColumn("Nombre");
        ModeloOrden.addColumn("Cantidad");
        ModeloOrden.addColumn("Costo");
        ModeloOrden.addColumn("SubTotal");
        this.tablaProductos.setModel(ModeloOrden);
        for (Producto p : carritoCompra) {
            Vector info = new Vector();
            info.addElement(p.getId());
            info.addElement(p.getNombre());
            info.addElement(p.getDepartamentoId());
            info.addElement(p.getPrecio() + " Bs");
            info.addElement(this.obtenerSubtotal(p.getPrecio(), p.getDepartamentoId()));
            this.ModeloOrden.addRow(info);
        }
    }

    private Producto obtenerElementoRepetido(int idProducto) {
        Producto resultado = null;
        for (Producto producto : carritoCompra) {
            if (idProducto == producto.getId()) {
                resultado = producto;
            }
        }
        return resultado;
    }

    private boolean existeElementoEnCarrito(int idProducto) {
        boolean resultado = false;
        for (Producto producto : carritoCompra) {
            if (idProducto == producto.getId()) {
                resultado = true;
            }
        }
        return resultado;
    }

    private int obtenerCantidadRepetida(int idProducto) {
        int resultado = 0;
        for (Producto producto : carritoCompra) {
            if (idProducto == producto.getId()) {
                resultado = producto.getDepartamentoId();
            }
        }
        return resultado;
    }

    private int obtenerindiceProblematico(int idProducto) {
        int resultado = 0;
        for (Producto producto : carritoCompra) {
            if (idProducto == producto.getId()) {
                resultado = carritoCompra.indexOf(producto);
            }
        }
        return resultado;
    }

    private void agregarElementoCarrito(int idProdcuto, int cantidad) {
        for (Producto producto : productosProveedor) {
            if (producto.getId() == idProdcuto) {
                if (this.existeElementoEnCarrito(idProdcuto)) {
                    Producto productoRepe = this.obtenerElementoRepetido(idProdcuto);
                    int cantidaActual = this.obtenerCantidadRepetida(idProdcuto);
                    int cantidadTotal = cantidad;
                    producto.setDepartamentoId(cantidadTotal);
                    this.carritoCompra.add(producto);
                    int indiceP = this.obtenerindiceProblematico(idProdcuto);
                    this.carritoCompra.remove(productoRepe);
                } else {
                    producto.setDepartamentoId(cantidad);
                    this.carritoCompra.add(producto);
                }
            }
        }
    }

    private Integer obtenerTotalNeto() {
        Integer subtotal = 0;
        for (Producto producto : carritoCompra) {
            subtotal += (producto.getDepartamentoId() * producto.getPrecio());
        }
        return subtotal;
    }

    private Double obtenerTotal() {
        return (this.obtenerTotalNeto() * this.iva);
    }

    private void eliminarElementoCarrito(int productoId) {
        int indiceP = this.obtenerindiceProblematico(productoId);
        this.carritoCompra.remove(indiceP);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCentroCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtProvedorCodigo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jlorden = new javax.swing.JLabel();
        jlCentroNombre = new javax.swing.JLabel();
        jlProveedorNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fechaGen = new javax.swing.JLabel();
        fechaEst = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panelAgregar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JcEstado = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jliva = new javax.swing.JLabel();
        jlCostoNeto = new javax.swing.JLabel();
        jlCostoTotal = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setTitle("Procesar Orden de Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Nº ORDEN:");

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("FECHA GENERADA:");

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("FECHA ESTIMADA:");

        jLabel4.setText("Centro de Distribucion:");

        jtCentroCodigo.setEditable(false);

        jLabel5.setText("Proveedor seleccionado:");

        jtProvedorCodigo.setEditable(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/search.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jlorden.setText("jLabel12");

        jlCentroNombre.setText("jLabel12");

        jlProveedorNombre.setText("jLabel12");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Imagenes/logo.png"))); // NOI18N

        fechaGen.setText("jLabel14");

        fechaEst.setText("jLabel15");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlorden))
                                    .addComponent(fechaGen))
                                .addGap(164, 164, 164)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtProvedorCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtCentroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jlProveedorNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6))
                                    .addComponent(jlCentroNombre))
                                .addGap(211, 211, 211))
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fechaEst)
                        .addContainerGap(847, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jlorden)
                            .addComponent(jlCentroNombre)
                            .addComponent(jtCentroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaGen)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jlProveedorNombre)
                                .addComponent(jtProvedorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton6))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaEst)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos y Costos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/add.png"))); // NOI18N
        jButton1.setText("Agregar Producto");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/quit.png"))); // NOI18N
        jButton2.setText("Eliminar Producto");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/agt_action_success.png"))); // NOI18N
        jButton3.setText("Actualizar Orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/edit.png"))); // NOI18N
        jButton7.setText("Editar Producto");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton7)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Producto"));

        jLabel11.setText("Id producto:");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/edit.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setText("Cantidad:");

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtcantidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Estado de la Orden:");

        JcEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APROBADA", "DESPACHADA", "RECIBIDA", "CANCELADA" }));

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JcEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(panelAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Totales Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Costo Neto:");

        jLabel8.setText("I.V.A :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setForeground(new java.awt.Color(51, 102, 0));
        jLabel9.setText("TOTAL:");

        jliva.setText("+ 9 %");

        jlCostoNeto.setText("0.00 BS");

        jlCostoTotal.setText("0.00 BS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jlCostoNeto))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jliva))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCostoTotal)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlCostoNeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jliva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jlCostoTotal)))
        );

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        VentanaConsultaEdicionProveedor2 ven = new VentanaConsultaEdicionProveedor2(proveedorActual);
        ven.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String idProductoColocado = this.jTextField3.getText();
        String cantidad = this.jtcantidad.getText();
        if ((!idProductoColocado.equals("")) && (!cantidad.equals(""))) {
            Integer idProduSel = Integer.parseInt(idProductoColocado);
            Integer cantidadidProd = Integer.parseInt(cantidad);
            this.agregarElementoCarrito(idProduSel, cantidadidProd);
            this.tablaProductos.removeAll();
            this.llenarTabla();
            Integer Totalneto = this.obtenerTotalNeto();

            this.jlCostoNeto.setText(Totalneto.toString());
            Double Total = this.obtenerTotal();
            this.jlCostoTotal.setText(Total.toString());

            Double diferencia = Total - Totalneto;
            this.jliva.setText(diferencia.toString());

            this.jtcantidad.setText("");
            this.jTextField3.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int seleccion = -1;
        seleccion = this.tablaProductos.getSelectedRow();
        if (seleccion >= 0) {
            this.eliminarElementoCarrito(seleccion);
            this.llenarTabla();
            Integer Totalneto = this.obtenerTotalNeto();

            this.jlCostoNeto.setText(Totalneto.toString());
            Double Total = this.obtenerTotal();
            this.jlCostoTotal.setText(Total.toString());

            Double diferencia = Total - Totalneto;
            this.jliva.setText(diferencia.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int Status = this.JcEstado.getSelectedIndex();
        this.ordenActual.setStatus(Status);
        Collection<Item> coleccionItems = this.control.productoToItem(carritoCompra, ordenActual.getId());
        this.ordenActual.setColeccionProductos(coleccionItems);
        this.control.actualizarOrdenCompra(ordenActual);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int seleccion = -1;
        seleccion = this.tablaProductos.getSelectedRow();
        if (seleccion >= 0) {
            Producto pr = this.carritoCompra.get(seleccion);
            this.jTextField3.setText(String.valueOf(pr.getId()));
            this.jtcantidad.setText(String.valueOf(pr.getDepartamentoId()));
            this.panelAgregar.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run(Proveedor prove, CentroDistribucion centro) {
                new VentanaProcesarOrdenCompra(prove, centro).setVisible(true);
            }

            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JcEstado;
    private javax.swing.JLabel fechaEst;
    private javax.swing.JLabel fechaGen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jlCentroNombre;
    private javax.swing.JLabel jlCostoNeto;
    private javax.swing.JLabel jlCostoTotal;
    private javax.swing.JLabel jlProveedorNombre;
    private javax.swing.JLabel jliva;
    private javax.swing.JLabel jlorden;
    private javax.swing.JTextField jtCentroCodigo;
    private javax.swing.JTextField jtProvedorCodigo;
    private javax.swing.JTextField jtcantidad;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
