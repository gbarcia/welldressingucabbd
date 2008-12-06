package com.wd.gui;

import com.wd.gui.controlparticular.ControlGuiDepartamento;

/**
 *
 * @author Gabylis
 */
public class VentanaAgregarDepartamento extends javax.swing.JFrame {

    private ControlGuiDepartamento controlDepartamento;

    private ControlGui controlGeneral;

    /** Creates new form VentanaAgregarDepartamento */
    public VentanaAgregarDepartamento() {
        initComponents();
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
        labelNombre = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        campoDepartamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        buttonAgregar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Departamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Departamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNombre.setText("Nombre Departamento");

        labelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDescripcion.setText("Descripción");

        campoDepartamento.setToolTipText("Nombre del departamento Aquí");
        campoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDepartamentoActionPerformed(evt);
            }
        });

        campoDescripcion.setColumns(20);
        campoDescripcion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        campoDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoDescripcion);

        buttonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonAgregar.setText("Agregar");
        buttonAgregar.setToolTipText("Presione para agregar el nuevo departamento");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setToolTipText("Presione para cancelar la operación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelDescripcion))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(campoDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(campoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAgregar)
                    .addComponent(buttonCancelar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDepartamentoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_campoDepartamentoActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
       int resultado = -1;
       String nombre = "";
       String descripcion = "";
       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
               "que desea realizar esta operación?");
       if (resultado == 0) {
           nombre = this.campoDepartamento.getText().toUpperCase();
           descripcion   = this.campoDescripcion.getText().toUpperCase();
           this.controlDepartamento = new ControlGuiDepartamento();
           controlDepartamento.agregarDepartamentoalSistema(nombre, descripcion);
       }
    }//GEN-LAST:event_buttonAgregarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JTextField campoDepartamento;
    private javax.swing.JTextArea campoDescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables

}
