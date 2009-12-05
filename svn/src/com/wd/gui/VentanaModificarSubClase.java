/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaModificarSubClase.java
 *
 * Created on 22/12/2008, 04:16:26 PM
 */

package com.wd.gui;

import com.wd.dominio.Departamento;
import com.wd.gui.controlparticular.ControlGuiDepartamento;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class VentanaModificarSubClase extends javax.swing.JFrame {

    private ControlGuiDepartamento controlDepartamento;

    private ControlGui controlGeneral;

    private Vector<Departamento> vecDepartamentos;

    private Vector<Departamento> vecClases;

    private Vector<Departamento> vecSubClases;

    /** Creates new form VentanaModificarSubClase */
    public VentanaModificarSubClase(Vector<Departamento> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);
        
        vecDepartamentos = new Vector();
        vecClases = new Vector();
        vecSubClases = new Vector();

        vecDepartamentos = result;
        for (Departamento dpto : result){
            this.comboDepartamento.addItem(dpto.getNombre());
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
        comboDepartamento = new javax.swing.JComboBox();
        comboClase = new javax.swing.JComboBox();
        comboSubClase = new javax.swing.JComboBox();
        campoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        buttonModificar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelDepartamento = new javax.swing.JLabel();
        labelClase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelNombreSub = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();

        setTitle("Modificar SubClase");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar SubClase", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentoActionPerformed(evt);
            }
        });

        comboClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClaseActionPerformed(evt);
            }
        });

        comboSubClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubClaseActionPerformed(evt);
            }
        });

        campoDescripcion.setColumns(20);
        campoDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoDescripcion);

        buttonModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        labelDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDepartamento.setText("Departamento");

        labelClase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelClase.setText("Clase");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SubClase");

        labelNombreSub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNombreSub.setText("Nombre SubClase");

        labelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDescripcion.setText("Desccripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelDepartamento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelClase))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNombreSub))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelDescripcion)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboSubClase, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboClase, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDepartamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClase))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSubClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreSub))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModificar)
                    .addComponent(buttonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void comboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentoActionPerformed
        int select = -1;
        select = this.comboDepartamento.getSelectedIndex();
        this.recargarComboClase(select);
    }//GEN-LAST:event_comboDepartamentoActionPerformed

    private void comboClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClaseActionPerformed
        int select = -1;
        if(this.comboClase.getItemCount()>0){
            select = this.comboClase.getSelectedIndex();
            this.recargarComboSubClase(select);
        }
    }//GEN-LAST:event_comboClaseActionPerformed

    private void comboSubClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubClaseActionPerformed
        String nombre = "";
        String descripcion = "";
        int select = -1;
        if(this.comboSubClase.getItemCount()>0){
            select = this.comboSubClase.getSelectedIndex();
            nombre = vecSubClases.elementAt(select).getNombre();
            descripcion = vecSubClases.elementAt(select).getDescripcion();
            this.campoNombre.setText(nombre);
            this.campoDescripcion.setText(descripcion);
        }
    }//GEN-LAST:event_comboSubClaseActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
       int resultado = -1;
       String nombre = "";
       String descripcion = "";
       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
               "que desea realizar esta operación?");
       if (resultado == 0) {
           int codigoClase = -1;
           int codigoSub = -1;
           int selectClase = -1;
           int selectSubClase = -1;

           selectClase = this.comboClase.getSelectedIndex();
           selectSubClase = this.comboSubClase.getSelectedIndex();

           codigoSub = vecSubClases.elementAt(selectSubClase).getCodigo();
           codigoClase = vecClases.elementAt(selectClase).getCodigo();

           nombre = this.campoNombre.getText().toUpperCase();
           descripcion   = this.campoDescripcion.getText().toUpperCase();

           Departamento subClaseMod = new Departamento(codigoSub,nombre,
           descripcion,0,codigoClase);

           this.controlDepartamento = new ControlGuiDepartamento();
           controlDepartamento.modificarSubClasedelSistema(subClaseMod);
           this.recargarComboSubClase(selectClase);
       }
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<Departamento> result) {
                new VentanaModificarSubClase(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JTextArea campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox comboClase;
    private javax.swing.JComboBox comboDepartamento;
    private javax.swing.JComboBox comboSubClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClase;
    private javax.swing.JLabel labelDepartamento;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombreSub;
    // End of variables declaration//GEN-END:variables

    public void recargarComboClase(int select){

        this.comboClase.removeAllItems();
        Departamento aux = new Departamento();
        aux = vecDepartamentos.elementAt(select);

        controlDepartamento = new ControlGuiDepartamento();
        vecClases = controlDepartamento.traerTodasLasClases(aux);

        for (Departamento dpto : vecClases){
            this.comboClase.addItem(dpto.getNombre());
        }
    }

    public void recargarComboSubClase(int select){

        this.comboSubClase.removeAllItems();
        Departamento aux = new Departamento();
        aux = vecClases.elementAt(select);

        controlDepartamento = new ControlGuiDepartamento();
        vecSubClases = controlDepartamento.traerTodasLasSubClases(aux);

        for (Departamento dpto : vecSubClases){
            this.comboSubClase.addItem(dpto.getNombre());
        }
    }
}
