/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaAgregarClase.java
 *
 * Created on 18/12/2008, 11:30:35 AM
 */

package com.wd.gui;

import com.wd.dominio.Departamento;
import com.wd.gui.controlparticular.ControlGuiDepartamento;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class VentanaAgregarClase extends javax.swing.JFrame {

    private ControlGuiDepartamento controlDepartamento;

    private ControlGui controlGeneral;

    private Vector<Departamento> vecDepartamentos;

    /** Creates new form VentanaAgregarClase */
    public VentanaAgregarClase(Vector<Departamento> result) {
        initComponents();
        vecDepartamentos = new Vector();
        vecDepartamentos = result;
        Vector info = new Vector();
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
        campoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        labelDepartamento = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        buttonAgregar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Clase", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboDepartamentoFocusGained(evt);
            }
        });

        campoDescripcion.setColumns(20);
        campoDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoDescripcion);

        labelDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelDepartamento.setText("Departamento");

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombre.setText("Nombre de la Clase");

        labelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelDescripcion.setText("Descripción");

        buttonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11));
        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelDepartamento)
                            .addComponent(labelDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboDepartamento, 0, 210, Short.MAX_VALUE)
                                .addComponent(campoNombre))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buttonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDepartamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonAgregar))
                .addContainerGap())
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

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
       int resultado = -1;
       String nombre = "";
       String descripcion = "";
       int codigoDepartamento = -1;
       int select = -1;
       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
               "que desea realizar esta operación?");
       if (resultado == 0) {
           nombre = this.campoNombre.getText().toUpperCase();
           descripcion   = this.campoDescripcion.getText().toUpperCase();
           select = this.comboDepartamento.getSelectedIndex();
           codigoDepartamento = vecDepartamentos.elementAt(select).getCodigo();
           this.controlDepartamento = new ControlGuiDepartamento();
           controlDepartamento.agregarClasealSistema(nombre, descripcion,codigoDepartamento);
       }
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void comboDepartamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboDepartamentoFocusGained
        int select = -1;
        select = this.comboDepartamento.getSelectedIndex();
        this.comboDepartamento.setToolTipText(vecDepartamentos.elementAt(select).getDescripcion());
        //comboDepartamento.s
    }//GEN-LAST:event_comboDepartamentoFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run(Vector<Departamento> result) {
                new VentanaConsultarDepartamentos(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JTextArea campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox comboDepartamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDepartamento;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables

}
