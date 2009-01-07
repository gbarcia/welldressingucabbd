package com.wd.gui;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Lugar;
import com.wd.dominio.Servicio;
import com.wd.dominio.Tienda;
import com.wd.gui.controlparticular.ControlGuiCentroDistribucion;
import com.wd.gui.controlparticular.ControlGuiEmpresaVigilancia;
import com.wd.gui.controlparticular.ControlGuiLugar;
import com.wd.gui.controlparticular.ControlGuiTienda;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class VentanaAgregarEmpresaVigilancia extends javax.swing.JFrame {

    private Vector<Lugar> estados;

    private Vector<Lugar> ciudades;

    private ControlGui controlGeneral;

    private Vector<Lugar> ciudadesAux;

    private Vector<CentroDistribucion> vecCentros;

    private Vector <Tienda> vecTiendas;

    private ControlGuiLugar controlLugar;

    private ControlGuiCentroDistribucion controlCentro;
    
    private ControlGuiTienda controlTienda;

    private ControlGuiEmpresaVigilancia controlEmpresa;

    private int radioSelected = -1;

    /** Creates new form VentanaAgregarEmpresaVigilancia */
    public VentanaAgregarEmpresaVigilancia(Vector<Lugar> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        vecTiendas = new Vector();
        vecCentros = new Vector();
        ciudadesAux = new Vector();
        ciudades = new Vector();
        estados = new Vector();

        controlCentro = new ControlGuiCentroDistribucion();
        vecCentros = controlCentro.traerTodosLosCentros();

        controlTienda = new ControlGuiTienda();
        vecTiendas = controlTienda.consultarTiendas();

        estados = result;

        for (Lugar lugar : result){
            this.comboEstado.addItem(lugar.getNombrePropio());
        }

        this.labelTiendaCentro.setText("Centros De Distribución");
        for (CentroDistribucion centro : vecCentros) {
            this.comboTiendaCentro.addItem(centro.getNombre());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comboEstado = new javax.swing.JComboBox();
        comboCiudad = new javax.swing.JComboBox();
        campoRif = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNombrePer = new javax.swing.JTextField();
        campoApellidoPer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDireccion = new javax.swing.JTextArea();
        radioTienda = new javax.swing.JRadioButton();
        radioCentro = new javax.swing.JRadioButton();
        comboTiendaCentro = new javax.swing.JComboBox();
        labelTiendaCentro = new javax.swing.JLabel();
        buttonAgregar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelEstado = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelRif = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelNombrePer = new javax.swing.JLabel();
        labelApellidoPer = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();

        setTitle("Agregar Empresa de Vigilancia");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Empresa de Vigilancia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        campoDireccion.setColumns(20);
        campoDireccion.setRows(5);
        jScrollPane1.setViewportView(campoDireccion);

        buttonGroup1.add(radioTienda);
        radioTienda.setFont(new java.awt.Font("Tahoma", 1, 11));
        radioTienda.setText("Tienda");
        radioTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTiendaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioCentro);
        radioCentro.setFont(new java.awt.Font("Tahoma", 1, 11));
        radioCentro.setSelected(true);
        radioCentro.setText("Centro Distribución");
        radioCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCentroActionPerformed(evt);
            }
        });

        labelTiendaCentro.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelTiendaCentro.setText("jLabel1");

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

        labelEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelEstado.setText("Estado");

        labelCiudad.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelCiudad.setText("Ciudad");

        labelRif.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelRif.setText("RIF");

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombre.setText("Nombre");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelTelefono.setText("Teléfono");

        labelNombrePer.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombrePer.setText("Nombre Persona de Contacto");

        labelApellidoPer.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelApellidoPer.setText("Apellido Persona de Contacto");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelDireccion.setText("Dirección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(buttonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelApellidoPer)
                                    .addComponent(labelNombrePer)
                                    .addComponent(labelTelefono)
                                    .addComponent(labelNombre)
                                    .addComponent(labelRif)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEstado)
                                    .addComponent(labelCiudad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTiendaCentro)
                                    .addComponent(radioCentro))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombrePer)
                                    .addComponent(campoTelefono)
                                    .addComponent(campoNombre)
                                    .addComponent(campoRif)
                                    .addComponent(comboCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoApellidoPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(comboEstado, 0, 203, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(radioTienda))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(comboTiendaCentro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCiudad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRif))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombrePer))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidoPer))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(labelDireccion)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTienda)
                    .addComponent(radioCentro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTiendaCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTiendaCentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonAgregar))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void radioCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCentroActionPerformed
        if (this.radioCentro.isSelected()){
            this.comboTiendaCentro.removeAllItems();
            this.labelTiendaCentro.setText("Centros de Distribución");
            for (CentroDistribucion centro : vecCentros) {
                this.comboTiendaCentro.addItem(centro.getNombre());
            }
            radioSelected = 0;
        }
    }//GEN-LAST:event_radioCentroActionPerformed

    private void radioTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTiendaActionPerformed
        if (this.radioTienda.isSelected()){
            this.comboTiendaCentro.removeAllItems();
            this.labelTiendaCentro.setText("Tiendas");
            for (Tienda tienda : vecTiendas) {
                this.comboTiendaCentro.addItem(tienda.getNombre());
            }
            radioSelected = 1;
        }
    }//GEN-LAST:event_radioTiendaActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
       int resultado = -1;
       int selectCity = -1;
       int selectCentTien = -1;
       int lugarId = 0;
       int centroCodigo = -1;
       int tiendaCodigo = -1;
       String rif = "";
       String nombre = "";
       String telefono = "";
       String direccion = "";
       String nombrePer = "";
       String apellidoPer = "";

       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
       "que desea realizar esta operación?");
       if (resultado == 0) {
           selectCity = this.comboCiudad.getSelectedIndex();
           lugarId = this.ciudadesAux.elementAt(selectCity).getId();
           rif = this.campoRif.getText().toUpperCase();
           nombre = this.campoNombre.getText().toUpperCase();
           nombrePer = this.campoNombrePer.getText().toUpperCase();
           apellidoPer = this.campoApellidoPer.getText().toUpperCase();
           telefono   = this.campoTelefono.getText().toUpperCase();
           direccion  = this.campoDireccion.getText().toUpperCase();
           this.controlEmpresa = new ControlGuiEmpresaVigilancia();
           EmpresaVigilancia newEmp = new EmpresaVigilancia(rif,nombre,telefono,
           direccion,lugarId,nombrePer,apellidoPer);
           controlEmpresa.agregarEmpresaVigilancia(newEmp);

           selectCentTien = this.comboTiendaCentro.getSelectedIndex();
           Servicio newServ = new Servicio();
           
           if (this.radioSelected == 0){
               centroCodigo = this.vecCentros.elementAt(selectCentTien).getCodigo();
               newServ.setCentroDistribucionCodigo(centroCodigo);
               newServ.setEmpresaServicioRif(rif);
               controlEmpresa.agregarServicio(newServ);
           }else if (this.radioSelected == 1){
               String nombreTienda = "";
               int tamaño = -1;
               int horarioId = -1;
               int ciudadId = -1;
               String direccionTienda = "";
               String telefonoTienda = "";
               String correo = "";
               
               tiendaCodigo = this.vecTiendas.elementAt(selectCentTien).getCodigo();
               nombreTienda = this.vecTiendas.elementAt(selectCentTien).getNombre();
               tamaño = this.vecTiendas.elementAt(selectCentTien).getTamano();
               horarioId = this.vecTiendas.elementAt(selectCentTien).getHORARIO_id();
               telefonoTienda = this.vecTiendas.elementAt(selectCentTien).getTelefono();
               correo = this.vecTiendas.elementAt(selectCentTien).getCorreo();
               ciudadId = this.vecTiendas.elementAt(selectCentTien).getLUGAR_id();
               direccionTienda = this.vecTiendas.elementAt(selectCentTien).getDireccion();
                              
               controlTienda.modificarTienda(tiendaCodigo,nombreTienda,tamaño,
               horarioId,telefonoTienda,correo,ciudadId,direccionTienda,rif);               
           }
       }
       this.reiniciarFields();
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<Lugar> result) {
                new VentanaAgregarEmpresaVigilancia(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoApellidoPer;
    private javax.swing.JTextArea campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombrePer;
    private javax.swing.JTextField campoRif;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox comboCiudad;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JComboBox comboTiendaCentro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellidoPer;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombrePer;
    private javax.swing.JLabel labelRif;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTiendaCentro;
    private javax.swing.JRadioButton radioCentro;
    private javax.swing.JRadioButton radioTienda;
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

    public void reiniciarFields(){
        this.campoRif.setText("");
        this.campoNombre.setText("");
        this.campoNombre.setText("");
        this.campoNombrePer.setText("");
        this.campoApellidoPer.setText("");
        this.campoDireccion.setText("");
        this.campoTelefono.setText("");
    }
}
