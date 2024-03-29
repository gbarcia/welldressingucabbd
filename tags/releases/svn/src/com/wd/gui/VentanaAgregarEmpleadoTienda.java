/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaAgregarEmpleadoTienda.java
 *
 * Created on 04/01/2009, 04:00:46 PM
 */

package com.wd.gui;

import com.wd.dominio.Lugar;
import com.wd.dominio.Tienda;
import com.wd.gui.controlparticular.ControlGuiEmpleadoTienda;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Date;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author gerardo
 */
public class VentanaAgregarEmpleadoTienda extends javax.swing.JFrame {

    private ControlGuiEmpleadoTienda controlGui;
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();
    private Collection<Lugar> Cciudades;
    private Collection<Tienda> Ctienda;

    /** Creates new form VentanaAgregarEmpleadoTienda */
    public VentanaAgregarEmpleadoTienda() {
        initComponents();

        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        Collection<Lugar> ciudades = controlG.traerTodosLosLuagres(2);
        Collection<Tienda> tiendas = controlG.traerTodasLasTienda();

        for (Tienda tienda : tiendas) {
            this.jcCentro.addItem(tienda.getNombre());
        }

        for (Lugar ciudad : ciudades) {
            this.jcUbicacion.addItem(ciudad.getNombrePropio());
        }

        this.controlGui = new ControlGuiEmpleadoTienda();
        
         Date fecha = new Date();
         java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
        this.jfFechaNac.setDate(fechaSQL);

        this.Cciudades = ciudades;
        this.Ctienda = tiendas;
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
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jfFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jcEdoCivil = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jcNivelEstudios = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jcUbicacion = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDireccion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jcCentro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Agregar Empleado a TIenda");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos nuevo Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N
        jPanel1.setAutoscrolls(true);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Cedula de Identidad:");

        jLabel4.setText("Fecha Nacimiento:");

        jfFechaNac.setDateFormatString("yyyy/MM/dd");

        jLabel5.setText("Sexo:");

        jrMasculino.setText("Masculino");
        jrMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMasculinoActionPerformed(evt);
            }
        });

        jrFemenino.setText("Feminino");
        jrFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFemeninoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado civil:");

        jcEdoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "soltero", "casado", "divorciado", "viudo" }));

        jLabel7.setText("Nivel de estudios:");

        jcNivelEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ninguno", "educacion primaria", "educacion secuandaria", "educacion superior" }));

        jLabel8.setText("Ubicación:");

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Dirección:");

        jtDireccion.setColumns(20);
        jtDireccion.setRows(5);
        jScrollPane1.setViewportView(jtDireccion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jfFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrFemenino))
                    .addComponent(jLabel6)
                    .addComponent(jcEdoCivil, 0, 237, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jcNivelEstudios, 0, 237, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jcUbicacion, 0, 237, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMasculino)
                    .addComponent(jrFemenino))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcEdoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcNivelEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo a Desempeñar y TIenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), null)); // NOI18N

        jLabel11.setText("Cargo:");

        jcCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gerente", "empleado regular" }));

        jLabel12.setText("Tienda donde trabajará:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcCargo, 0, 218, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jcCentro, 0, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jcCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton3)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFemeninoActionPerformed
        if (jrFemenino.isSelected()) {
            this.jrMasculino.setSelected(false);
        }
}//GEN-LAST:event_jrFemeninoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreEmpleado        = this.jtNombre.getText();
        String apellidoEmpleado      = this.jtApellido.getText();
        String cedulaEmpleado        = this.jtCedula.getText();
        String direccionEmpleado     = this.jtDireccion.getText();
        String telefonoEmpleado      = this.jtTelefono.getText();
        Date fechaNac                = this.jfFechaNac.getDate();
        String sexo                  ="";
        java.sql.Date fechaEmpleado = new java.sql.Date(fechaNac.getTime()); // Conviertiendo de java.util.Date a java.sql.date
        //Para determinar el sexo
        if (this.jrFemenino.isSelected()) sexo = "F";
        else sexo = "M";
        int cargo = this.jcCargo.getSelectedIndex();
        int nivelEstudios = this.jcNivelEstudios.getSelectedIndex();
        int estadoCivil = this.jcEdoCivil.getSelectedIndex();

        int indiceCiudad = this.jcUbicacion.getSelectedIndex();
        int indiceTienda = this.jcCentro.getSelectedIndex();

        Vector<Lugar> ciudades = new Vector(this.Cciudades);
        Lugar ciudadSeleccionada = ciudades.get(indiceCiudad);
        int ciudadEmpleado = ciudadSeleccionada.getId();

        Vector<Tienda> tiendas = new Vector (this.Ctienda);
        Tienda tiendaSeleccionada = tiendas.get(indiceTienda);
        int tiendaDondeTrabajara = tiendaSeleccionada.getCodigo();

        this.controlGui.registrarNuevoEmpleado(cedulaEmpleado, nombreEmpleado,
                apellidoEmpleado, fechaEmpleado,telefonoEmpleado, estadoCivil,
                sexo, nivelEstudios, direccionEmpleado, cargo, ciudadEmpleado,
                "", tiendaDondeTrabajara, "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jrMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMasculinoActionPerformed
        if (jrMasculino.isSelected()) {
            this.jrFemenino.setSelected(false);
        }
    }//GEN-LAST:event_jrMasculinoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.jtApellido.setText("");
        this.jtCedula.setText("");
        this.jtDireccion.setText("");
        this.jtNombre.setText("");
        this.jtTelefono.setText("");
        this.jcCargo.setSelectedIndex(0);
        this.jcEdoCivil.setSelectedIndex(0);
        this.jcNivelEstudios.setSelectedIndex(0);
        this.jcCentro.setSelectedIndex(0);
        this.jcUbicacion.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarEmpleadoTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcCargo;
    private javax.swing.JComboBox jcCentro;
    private javax.swing.JComboBox jcEdoCivil;
    private javax.swing.JComboBox jcNivelEstudios;
    private javax.swing.JComboBox jcUbicacion;
    private com.toedter.calendar.JDateChooser jfFechaNac;
    private javax.swing.JRadioButton jrFemenino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCedula;
    private javax.swing.JTextArea jtDireccion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

}
