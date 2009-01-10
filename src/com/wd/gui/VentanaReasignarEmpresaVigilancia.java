package com.wd.gui;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Servicio;
import com.wd.dominio.Tienda;
import com.wd.gui.controlparticular.ControlGuiEmpresaVigilancia;
import com.wd.gui.controlparticular.ControlGuiTienda;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabylis
 */
public class VentanaReasignarEmpresaVigilancia extends javax.swing.JFrame {

    private Vector<CentroDistribucion> vecCentros;

    private Vector<Tienda> vecTiendas;

    private Vector<EmpresaVigilancia> vecEmps;

    private DefaultTableModel dm1;

    private DefaultTableModel dm2;

    String empName = "";

    private ControlGuiTienda controlTienda;

    private ControlGuiEmpresaVigilancia controlEmpresa;

    private EmpresaVigilancia empOnDelete;

    /** Creates new form VentanaReasignarEmpresaVigilancia */
    public VentanaReasignarEmpresaVigilancia(EmpresaVigilancia oldEmp,Vector<EmpresaVigilancia> emps,Vector<Tienda> tiendas,Vector<CentroDistribucion> centros) {
        initComponents();
        
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        vecCentros = new Vector();
        vecTiendas = new Vector();
        vecEmps = new Vector();

        vecCentros = centros;
        vecTiendas = tiendas;
        vecEmps = emps;
        empOnDelete = oldEmp;

        dm2 = new DefaultTableModel();
        dm2.addColumn("Codigo");
        dm2.addColumn("Nombre");
        dm2.addColumn("Telefono");
        dm2.addColumn("Correo Electrónico");
        dm2.addColumn("Actual Empresa de Vigilancia");

        dm1 = new DefaultTableModel();
        dm1.addColumn("Codigo");
        dm1.addColumn("Nombre");
        dm1.addColumn("Telefono");
        dm1.addColumn("Dirección");

        for (EmpresaVigilancia emp : vecEmps){
            this.comboEmpresas.addItem(emp.getNombre());
        }

        this.llenarTablaTienda();
        this.llenarTablaCentro();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboEmpresas = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTiendas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCentros = new javax.swing.JTable();
        labelEmps = new javax.swing.JLabel();
        buttonReasignarTiendas = new javax.swing.JButton();
        buttonReasignarCentros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)), "Reasignación de Empresa de Vigilancia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboEmpresas.setToolTipText("Empresas de Vigilancia Disponibles");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiendas a Reasignar"));

        tablaTiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTiendas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Centros a Reasignar"));

        tablaCentros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaCentros);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelEmps.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelEmps.setText("Empresas de Vigilancia Disponibles");

        buttonReasignarTiendas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonReasignarTiendas.setText("Reasignar Empresa");
        buttonReasignarTiendas.setToolTipText("Reasignar Empresa de Vigilancia de una Tienda");
        buttonReasignarTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReasignarTiendasActionPerformed(evt);
            }
        });

        buttonReasignarCentros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonReasignarCentros.setText("Reasignar Empresa");
        buttonReasignarCentros.setToolTipText("Reasignar Empresa De Vigilancia de un Centro de Distribución");
        buttonReasignarCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReasignarCentrosActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEmps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(buttonReasignarCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(buttonReasignarTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmps))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonReasignarTiendas)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonReasignarCentros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReasignarTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReasignarTiendasActionPerformed
        int selectEmp = -1;
        int selectTienda = -1;
        String nombreTienda = "";
        int tamaño = -1;
        int horarioId = -1;
        int ciudadId = -1;
        String direccionTienda = "";
        String telefonoTienda = "";
        String correo = "";
        int tiendaCodigo = -1;
        int lugarId = -1;
        String empRif = "";

        selectEmp = this.comboEmpresas.getSelectedIndex();
        empRif = this.vecEmps.elementAt(selectEmp).getRif();

        selectTienda = this.tablaTiendas.getSelectedRow();
        Tienda auxTienda = new Tienda();
        auxTienda = this.vecTiendas.elementAt(selectTienda);

        tiendaCodigo = auxTienda.getCodigo();
        nombreTienda = auxTienda.getNombre();
        tamaño = auxTienda.getTamano();
        horarioId = auxTienda.getHORARIO_id();
        telefonoTienda = auxTienda.getTelefono();
        correo = auxTienda.getCorreo();
        ciudadId = auxTienda.getLUGAR_id();
        direccionTienda = auxTienda.getDireccion();

        this.controlTienda = new ControlGuiTienda();
        controlTienda.modificarTienda(tiendaCodigo,nombreTienda,tamaño,
        horarioId,telefonoTienda,correo,ciudadId,direccionTienda,empRif);

        this.vecTiendas.remove(auxTienda);
        this.tablaTiendas.remove(selectTienda);
    }//GEN-LAST:event_buttonReasignarTiendasActionPerformed

    private void buttonReasignarCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReasignarCentrosActionPerformed

        int selectCentro = -1;
        int selectEmp = -1;
        int centroDistribucionCodigo = -1;
        String empresaServicioRif = "";
        String newEmpRif = "";

        selectEmp = this.comboEmpresas.getSelectedIndex();
        selectCentro = this.tablaCentros.getSelectedRow();

        CentroDistribucion centroAux = new CentroDistribucion();
        centroAux = this.vecCentros.elementAt(selectCentro);
        centroDistribucionCodigo = centroAux.getCodigo();
        empresaServicioRif = this.empOnDelete.getRif();
        newEmpRif = this.vecEmps.elementAt(selectEmp).getRif();

        Servicio oldServ = new Servicio(centroDistribucionCodigo,empresaServicioRif);
        Servicio newServ = new Servicio(centroDistribucionCodigo,newEmpRif);

        this.controlEmpresa = new ControlGuiEmpresaVigilancia();
        controlEmpresa.eliminarServicio(oldServ);
        controlEmpresa.agregarServicio(newServ);

        this.vecCentros.remove(centroAux);
        this.tablaCentros.remove(selectCentro);
    }//GEN-LAST:event_buttonReasignarCentrosActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(EmpresaVigilancia oldEmp,Vector<EmpresaVigilancia> emps,Vector<Tienda> tiendas,Vector<CentroDistribucion> centros) {
                new VentanaReasignarEmpresaVigilancia(oldEmp,emps,tiendas,centros).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonReasignarCentros;
    private javax.swing.JButton buttonReasignarTiendas;
    private javax.swing.JComboBox comboEmpresas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEmps;
    private javax.swing.JTable tablaCentros;
    private javax.swing.JTable tablaTiendas;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaCentro(){

        for (int i = 0; i < dm1.getRowCount(); i++) {
            this.dm1.removeRow(i);
        }

        for (CentroDistribucion centro : vecCentros) {
            Vector info = new Vector();
            info.addElement(centro.getCodigo());
            info.addElement(centro.getNombre());
            info.addElement(centro.getTelefono());
            info.addElement(centro.getDireccion());
            dm1.addRow(info);
            this.tablaCentros.setModel(dm1);
        }
    }

    public void llenarTablaTienda(){
        for (int i = 0; i < dm2.getRowCount(); i++) {
            this.dm2.removeRow(i);
        }

        for (Tienda tienda : vecTiendas) {
            Vector info = new Vector();
            info.addElement(tienda.getCodigo());
            info.addElement(tienda.getNombre());
            info.addElement(tienda.getTelefono());
            info.addElement(tienda.getCorreo());
            info.addElement(empOnDelete.getNombre());
            dm2.addRow(info);
            this.tablaTiendas.setModel(dm2);
        }
    }
}