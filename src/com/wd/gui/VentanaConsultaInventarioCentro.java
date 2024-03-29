package com.wd.gui;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.Lugar;
import com.wd.dominio.Producto;
import com.wd.gui.controlparticular.ControlGuiInventario;
import com.wd.gui.controlparticular.ControlGuiLugar;
import com.wd.gui.controlparticular.ControlGuiProducto;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabylis
 */
public class VentanaConsultaInventarioCentro extends javax.swing.JFrame {

    private Vector<CentroDistribucion> vecCentros;

    private Vector<Lugar> vecCiudades;

    private ControlGuiLugar controlLugar;

    private ControlGuiInventario controlInventario;

    private ControlGuiProducto controlProducto;

    private DefaultTableModel dmTeo;

    private DefaultTableModel dmCam;

    private Vector<Producto> vecProd;

    private Vector<Producto> vecProdAuxTeo;

    private Vector<Producto> vecProdAuxCam;

    private Vector<Inventario> vecTeo;

    private Vector<Item> vecItem;

    /** Creates new form VentanaConsultaInventarioCentro */
    public VentanaConsultaInventarioCentro(Vector<CentroDistribucion> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        vecCentros = new Vector();
        vecCiudades= new Vector();
        vecTeo = new Vector();
        vecProd = new Vector();
        vecProdAuxTeo = new Vector();
        vecProdAuxCam = new Vector();
        vecItem = new Vector();

        this.controlProducto = new ControlGuiProducto();
        vecProd = controlProducto.traerTodosLosProductos();

        vecCentros = result;
        controlLugar = new ControlGuiLugar();
        vecCiudades = controlLugar.traerTodosLosLugares(2);

        for (CentroDistribucion centrico : result) {
            this.comboCentro.addItem(centrico.getNombre());
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCentro = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTeorico = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCamino = new javax.swing.JTable();
        buttonCerrar = new javax.swing.JButton();
        comboCentro = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        labelIdNomb = new javax.swing.JLabel();
        labelTelefonoNomb = new javax.swing.JLabel();
        labelDirNomb = new javax.swing.JLabel();
        labelUbicacionNomb = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDir = new javax.swing.JLabel();
        labelUbicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Inventario de un Centro de Distribución");

        labelCentro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventario por Centro de Distribución", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true), "Inventarios Asociados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel4.setToolTipText("Inventario del Centro tanto teórico como en camino");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tablaTeorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTeorico);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Inventario Teórico", jPanel2);

        tablaCamino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaCamino);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inventario en Camino", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCerrar.setText("Cerrar");

        comboCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCentroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Centro de Distribución: ");

        labelIdNomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelIdNomb.setText("ID");

        labelTelefonoNomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefonoNomb.setText("Teléfono");

        labelDirNomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDirNomb.setText("Dirección");

        labelUbicacionNomb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelUbicacionNomb.setText("Ubicación");

        labelId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelId.setForeground(new java.awt.Color(0, 102, 204));
        labelId.setText("ID");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 102, 204));
        labelTelefono.setText("telefono");

        labelDir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDir.setForeground(new java.awt.Color(0, 102, 204));
        labelDir.setText("direccion");

        labelUbicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelUbicacion.setForeground(new java.awt.Color(0, 102, 204));
        labelUbicacion.setText("ciudad+estado");

        javax.swing.GroupLayout labelCentroLayout = new javax.swing.GroupLayout(labelCentro);
        labelCentro.setLayout(labelCentroLayout);
        labelCentroLayout.setHorizontalGroup(
            labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelCentroLayout.createSequentialGroup()
                .addGroup(labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelCentroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(labelCentroLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(buttonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(labelCentroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelIdNomb)
                    .addComponent(labelTelefonoNomb)
                    .addComponent(labelDirNomb)
                    .addComponent(labelUbicacionNomb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUbicacion)
                    .addComponent(labelDir)
                    .addComponent(labelTelefono)
                    .addComponent(labelId)
                    .addComponent(comboCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        labelCentroLayout.setVerticalGroup(
            labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelCentroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(labelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(labelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(labelIdNomb)
                        .addGap(18, 18, 18)
                        .addComponent(labelTelefonoNomb)
                        .addGap(18, 18, 18)
                        .addComponent(labelDirNomb)
                        .addGap(18, 18, 18)
                        .addComponent(labelUbicacionNomb))
                    .addGroup(labelCentroLayout.createSequentialGroup()
                        .addComponent(comboCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelId)
                        .addGap(18, 18, 18)
                        .addComponent(labelTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(labelDir)
                        .addGap(18, 18, 18)
                        .addComponent(labelUbicacion)))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCerrar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCentroActionPerformed
        int select = -1;
        int codigoCentro = -1;
        int cityId = -1;
        String telefono = "";
        String direccion = "";
        String ubicacion = "";

        select = this.comboCentro.getSelectedIndex();
        CentroDistribucion centrico = new CentroDistribucion();
        centrico = this.vecCentros.elementAt(select);

        cityId = centrico.getLugarId();
        codigoCentro = centrico.getCodigo();
        telefono = centrico.getTelefono();
        direccion = centrico.getDireccion();
        ubicacion = this.getUbicacion(cityId);

        this.labelId.setText(codigoCentro+"");
        this.labelTelefono.setText(telefono);
        this.labelDir.setText(direccion);
        this.labelUbicacion.setText(ubicacion);

        this.llenarTablaTeorico(codigoCentro);
        this.llenarTablaCamino(codigoCentro);
    }//GEN-LAST:event_comboCentroActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<CentroDistribucion> result) {
                new VentanaConsultaInventarioCentro(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JComboBox comboCentro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel labelCentro;
    private javax.swing.JLabel labelDir;
    private javax.swing.JLabel labelDirNomb;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIdNomb;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefonoNomb;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JLabel labelUbicacionNomb;
    private javax.swing.JTable tablaCamino;
    private javax.swing.JTable tablaTeorico;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaTeorico(int codigoCentro){
        dmTeo = new DefaultTableModel();
        dmTeo.addColumn("ID Poducto");
        dmTeo.addColumn("Nombre Producto");
        dmTeo.addColumn("Descripcion");
        dmTeo.addColumn("Cantidad");

        this.controlInventario = new ControlGuiInventario();
        this.vecTeo = controlInventario.traerInventarioTeoCentro(codigoCentro);

        this.llenarVecProdAuxTeo();

        Inventario inv = new Inventario();
        Producto prod = new Producto();
        for (int i = 0; i < vecTeo.size(); i++) {
            inv = vecTeo.elementAt(i);
            prod = this.vecProdAuxTeo.elementAt(i);

            Vector info = new Vector();
            info.addElement(prod.getId());
            info.addElement(prod.getNombre());
            info.addElement(prod.getDescripcion());
            info.addElement(inv.getCantidad());
            dmTeo.addRow(info);
        }
        this.tablaTeorico.setModel(dmTeo);
    }

    public void llenarTablaCamino(int codigoCentro){
        dmCam = new DefaultTableModel();
        dmCam.addColumn("ID Poducto");
        dmCam.addColumn("Nombre Producto");
        dmCam.addColumn("Descripcion");
        dmCam.addColumn("Cantidad");
        dmCam.addColumn("Id Solicitud");

        this.controlInventario = new ControlGuiInventario();
        this.vecItem = controlInventario.traerInventarioCaminoCentro(codigoCentro);

        this.llenarVecProdAuxCam();

        Item it = new Item();
        Producto prod = new Producto();

        for (int i = 0; i < vecItem.size(); i++) {
            it = vecItem.elementAt(i);
            prod = this.vecProdAuxCam.elementAt(i);

            Vector info = new Vector();
            info.addElement(prod.getId());
            info.addElement(prod.getNombre());
            info.addElement(prod.getDescripcion());
            info.addElement(it.getCantidad());
            info.addElement(it.getIdSolicitud());
            dmCam.addRow(info);
        }
        this.tablaCamino.setModel(dmCam);

    }

    public void llenarVecProdAuxTeo(){
        this.vecProdAuxTeo.removeAllElements();

        for (Inventario inv : vecTeo) {
            for (Producto prod : vecProd) {
                if(inv.getProductoId() == prod.getId()){
                this.vecProdAuxTeo.addElement(prod);
                }
            }

        }
    }

    public void llenarVecProdAuxCam(){
        this.vecProdAuxCam.removeAllElements();

        for (Item inv : vecItem) {
            for (Producto prod : vecProd) {
                if(inv.getIdProducto() == prod.getId()){
                    this.vecProdAuxCam.addElement(prod);
                }
            }
        }
    }

    public String getUbicacion(int cityId){
        String nombreCity= "";
        String estado = "";
        String ubicacion = "";

        for (Lugar ciudad : vecCiudades) {
            if (ciudad.getId() == cityId){
                nombreCity = ciudad.getNombrePropio();
                estado = ciudad.getNombrePertenece();
                ubicacion = nombreCity + ", " + estado;
            }
        }
        return ubicacion;
    }
}
