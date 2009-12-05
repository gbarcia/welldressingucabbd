package com.wd.gui;

import com.wd.dominio.Departamento;
import com.wd.gui.controlparticular.ControlGuiDepartamento;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class VentanaModificarDepartamento extends javax.swing.JFrame {

    private Vector<Departamento> vecDepartamentos;

    private ControlGui controlGeneral;

    private ControlGuiDepartamento controlDepartamento;

    /** Creates new form VentanaModificarDepartamento */
    public VentanaModificarDepartamento(Vector<Departamento> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);
        
        vecDepartamentos = new Vector();
        vecDepartamentos = result;
        for (Departamento dpto : result){
            this.comboNombre.addItem(dpto.getNombre());
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
        comboNombre = new javax.swing.JComboBox();
        campoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        labelNombreCombo = new javax.swing.JLabel();
        labelNombreMod = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonModificar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setTitle("Modificar Departamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Departamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboNombre.setToolTipText("Escoge departamento a modificar");
        comboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreActionPerformed(evt);
            }
        });

        campoNombre.setToolTipText("Nombre modificable");

        campoDescripcion.setColumns(20);
        campoDescripcion.setRows(5);
        campoDescripcion.setToolTipText("Descripcion Modificable");
        jScrollPane1.setViewportView(campoDescripcion);

        labelNombreCombo.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombreCombo.setText("Nombre Departamento");

        labelNombreMod.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombreMod.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Descripción");

        buttonModificar.setFont(new java.awt.Font("Tahoma", 1, 11));
        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreCombo)
                            .addComponent(labelNombreMod)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelNombreMod))
                            .addComponent(labelNombreCombo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonModificar)
                    .addComponent(buttonCancelar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreActionPerformed
        int select = -1;
        String descripcion = "";
        String nombre = "";
        if(this.comboNombre.getItemCount() > 0){
            select = this.comboNombre.getSelectedIndex();
            nombre = vecDepartamentos.elementAt(select).getNombre();
            descripcion = vecDepartamentos.elementAt(select).getDescripcion();
            this.campoNombre.setText(nombre);
            this.campoDescripcion.setText(descripcion);
        }
    }//GEN-LAST:event_comboNombreActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
       int resultado = -1;
       String nombre = "";
       String descripcion = "";
       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
               "que desea realizar esta operación?");
       if (resultado == 0) {
           int codigo = -1;
           int select = -1;
           select = this.comboNombre.getSelectedIndex();
           codigo = vecDepartamentos.elementAt(select).getCodigo();
           nombre = this.campoNombre.getText().toUpperCase();
           descripcion   = this.campoDescripcion.getText().toUpperCase();
           Departamento newDpto = new Departamento(codigo,nombre,descripcion,2,0);
           this.controlDepartamento = new ControlGuiDepartamento();
           controlDepartamento.modificarDepartamentodelSistema(newDpto);
           this.recargarCombo();
       }
    }//GEN-LAST:event_buttonModificarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<Departamento> result) {
                new VentanaModificarDepartamento(result).setVisible(true);
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
    private javax.swing.JComboBox comboNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombreCombo;
    private javax.swing.JLabel labelNombreMod;
    // End of variables declaration//GEN-END:variables

    public void recargarCombo(){
        this.controlDepartamento = new ControlGuiDepartamento();
        vecDepartamentos = controlDepartamento.traerTodosLosDepartamentos();
        
        this.comboNombre.removeAllItems();

        for (Departamento dpto : vecDepartamentos){
            this.comboNombre.addItem(dpto.getNombre());
    }
        



        

    }
}
