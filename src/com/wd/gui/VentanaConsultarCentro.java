package com.wd.gui;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Lugar;
import com.wd.gui.controlparticular.ControlGuiCentroDistribucion;
import com.wd.gui.controlparticular.ControlGuiLugar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabylis
 */
public class VentanaConsultarCentro extends javax.swing.JFrame {

    private DefaultTableModel dm;

    private Vector<Lugar> estados;

    private Vector<Lugar> ciudades;

    private Vector<Lugar> ciudadesAux;
    
    private Vector<CentroDistribucion> vecCentros;

    private ControlGuiLugar controlLugar;

    private ControlGuiCentroDistribucion controlCentro;

    /** Creates new form VentanaConsultarCentro */
    public VentanaConsultarCentro(Vector<Lugar> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        dm = new DefaultTableModel();
        dm.addColumn("Id");
        dm.addColumn("Nombre Centro");
        dm.addColumn("Telefono");
        dm.addColumn("Dirección");

        vecCentros = new Vector();
        ciudadesAux = new Vector();
        ciudades = new Vector();
        estados = new Vector();

        controlCentro = new ControlGuiCentroDistribucion();
        vecCentros = controlCentro.traerTodosLosCentros();
        
        estados = result;

        for (Lugar lugar : result){
            this.comboEstado.addItem(lugar.getNombrePropio());
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

        jPanel1 = new javax.swing.JPanel();
        comboEstado = new javax.swing.JComboBox();
        comboCiudad = new javax.swing.JComboBox();
        labelEstado = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonCerrar = new javax.swing.JButton();

        setTitle("Consultar Centros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Centros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        comboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadActionPerformed(evt);
            }
        });

        labelEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelEstado.setText("Estado");

        labelCiudad.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelCiudad.setText("Ciudad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEstado)
                    .addComponent(labelCiudad))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCiudad))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centros de Distribución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonCerrar.setFont(new java.awt.Font("Tahoma", 1, 11));
        buttonCerrar.setText("Cerrar");
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(buttonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        int select = -1;
        select = this.comboEstado.getSelectedIndex();
        Lugar estadoDueño = new Lugar();
        estadoDueño = estados.elementAt(select);
        cargarCiudades(estadoDueño);
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void comboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadActionPerformed
       int select = -1;
       //select = this.comboCiudad.getSelectedIndex();
        if (this.comboCiudad.getItemCount()>0){
            select = this.comboCiudad.getSelectedIndex();
            this.llenarTabla(select);
        }
    }//GEN-LAST:event_comboCiudadActionPerformed

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCerrarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<Lugar> result) {
                new VentanaConsultarCentro(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JComboBox comboCiudad;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelEstado;
    // End of variables declaration//GEN-END:variables

    public void cargarCiudades(Lugar Estado){
        this.comboCiudad.removeAllItems();
        this.ciudadesAux.removeAllElements();

        int codigoEstado = -1;
        codigoEstado = Estado.getId();

        controlLugar = new ControlGuiLugar();
        ciudades = controlLugar.traerTodosLosLugares(2);

        for (Lugar lugar : ciudades) {
            if (lugar.getLugarID() == codigoEstado){
                ciudadesAux.addElement(lugar);
                this.comboCiudad.addItem(lugar.getNombrePropio());
            }
        }
    }

    public void llenarTabla(int select){

        for (int i = 0; i < dm.getRowCount(); i++) {
            this.dm.removeRow(i);
        }

        for (CentroDistribucion centro : vecCentros){
            if(centro.getLugarId() == ciudadesAux.elementAt(select).getId()){                
                Vector info = new Vector();
                info.addElement(centro.getCodigo());
                info.addElement(centro.getNombre());
                info.addElement(centro.getTelefono());
                info.addElement(centro.getDireccion());
                dm.addRow(info);
                this.jTable1.setModel(dm);
            }
        }
    }

    public void prueba(){

        this.listaPrueba.addi
    }
}
