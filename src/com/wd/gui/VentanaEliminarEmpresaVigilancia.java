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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabylis
 */
public class VentanaEliminarEmpresaVigilancia extends javax.swing.JFrame {

    private JFrame Oh;

    private VentanaReasignarEmpresaVigilancia ventanaReasignarEmpresaVigilancia;

    private Vector<Lugar> estados;

    private Vector<Lugar> ciudades;

    private ControlGui controlGeneral;

    private Vector<Lugar> ciudadesAux;

    private Vector<CentroDistribucion> vecCentros;

    private Vector<CentroDistribucion> vecCentrosAux;

    private Vector <EmpresaVigilancia> vecEmps;

    private Vector <EmpresaVigilancia> vecEmpsAux;

    private EmpresaVigilancia empOnDelete;

    private Vector <Tienda> vecTiendas;

    private Vector <Tienda> vecTiendasAux;

    private ControlGuiLugar controlLugar;

    private ControlGuiCentroDistribucion controlCentro;

    private ControlGuiTienda controlTienda;

    private ControlGuiEmpresaVigilancia controlEmpresa;

    /** Creates new form VentanaEliminarEmpresaVigilancia */
    public VentanaEliminarEmpresaVigilancia(Vector<Lugar> result) {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);

        vecTiendas = new Vector();
        vecTiendasAux = new Vector();
        vecCentros = new Vector();
        vecCentrosAux = new Vector();
        vecEmps = new Vector();
        vecEmpsAux = new Vector();
        ciudadesAux = new Vector();
        ciudades = new Vector();
        estados = new Vector();
        empOnDelete = new EmpresaVigilancia();

        controlCentro = new ControlGuiCentroDistribucion();
        vecCentros = controlCentro.traerTodosLosCentros();

        controlEmpresa = new ControlGuiEmpresaVigilancia();
        vecEmps = controlEmpresa.traerTodasLasEmpresas();

        controlTienda = new ControlGuiTienda();
        vecTiendas = controlTienda.consultarTiendas();

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
        comboNombre = new javax.swing.JComboBox();
        campoRif = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoNombrePer = new javax.swing.JTextField();
        campoApellidoPer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDireccion = new javax.swing.JTextArea();
        comboTiendas = new javax.swing.JComboBox();
        comboCentros = new javax.swing.JComboBox();
        labelEstado = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelNombreEmp = new javax.swing.JLabel();
        labelRif = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelNombrePer = new javax.swing.JLabel();
        labelApellidoPer = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTiendas = new javax.swing.JLabel();
        labelCentros = new javax.swing.JLabel();
        buttonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Empresa de Vigilancia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

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

        comboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreActionPerformed(evt);
            }
        });

        campoRif.setEditable(false);

        campoTelefono.setEditable(false);

        campoNombrePer.setEditable(false);

        campoApellidoPer.setEditable(false);

        campoDireccion.setColumns(20);
        campoDireccion.setEditable(false);
        campoDireccion.setRows(5);
        jScrollPane1.setViewportView(campoDireccion);

        labelEstado.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelEstado.setText("Estado");

        labelCiudad.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelCiudad.setText("Ciudad");

        labelNombreEmp.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombreEmp.setText("Nombre Empresa");

        labelRif.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelRif.setText("RIF");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelTelefono.setText("Teléfono");

        labelNombrePer.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelNombrePer.setText("Nombre Persona Contacto");

        labelApellidoPer.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelApellidoPer.setText("Apellido Persona Contacto");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelDireccion.setText("Dirección");

        labelTiendas.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelTiendas.setText("Tiendas");

        labelCentros.setFont(new java.awt.Font("Tahoma", 1, 11));
        labelCentros.setText("Centros de Distribución");

        buttonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11));
        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCentros)
                                .addGap(104, 104, 104)
                                .addComponent(comboCentros, 0, 280, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTiendas)
                                .addGap(191, 191, 191)
                                .addComponent(comboTiendas, 0, 280, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefono)
                                    .addComponent(labelNombrePer)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelApellidoPer)
                                    .addComponent(labelEstado)
                                    .addComponent(labelCiudad)
                                    .addComponent(labelNombreEmp)
                                    .addComponent(labelRif))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(campoRif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(comboNombre, 0, 280, Short.MAX_VALUE)
                                    .addComponent(comboCiudad, 0, 280, Short.MAX_VALUE)
                                    .addComponent(comboEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 280, Short.MAX_VALUE)
                                    .addComponent(campoNombrePer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(campoApellidoPer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEstado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCiudad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreEmp))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoRif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRif))
                        .addGap(18, 18, 18)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoNombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoApellidoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellidoPer))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(labelTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(labelNombrePer)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTiendas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCentros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCentros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(buttonEliminar)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        int idCiudad = -1;
        if (this.comboCiudad.getItemCount()>0){
            select = this.comboCiudad.getSelectedIndex();
            idCiudad = this.ciudadesAux.elementAt(select).getId();
            this.cargarComboEmpresa(idCiudad);
        }
    }//GEN-LAST:event_comboCiudadActionPerformed

    private void comboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreActionPerformed
        int select = -1;
        String rif = "";
        String telefono = "";
        String nombrePer = "";
        String apellidoPer = "";
        String direccion = "";

        if (this.comboNombre.getItemCount()>0){
            select = this.comboNombre.getSelectedIndex();
            EmpresaVigilancia auxEmp = new EmpresaVigilancia();
            auxEmp = this.vecEmpsAux.elementAt(select);
            this.empOnDelete = auxEmp;
            rif = auxEmp.getRif();
            telefono = auxEmp.getTelefono();
            nombrePer = auxEmp.getNombreContacto();
            apellidoPer = auxEmp.getApellidoContacto();
            direccion = auxEmp.getDireccion();

            this.campoRif.setText(rif);
            this.campoTelefono.setText(telefono);
            this.campoNombrePer.setText(nombrePer);
            this.campoApellidoPer.setText(apellidoPer);
            this.campoDireccion.setText(direccion);

            this.cargarComboTiendas(rif);
            this.cargarComboCentros(rif);
        }
    }//GEN-LAST:event_comboNombreActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
       int select = -1;
       int selectTabla = -1;
       int resultado = -1;

       this.controlGeneral =  new ControlGui ();
       resultado = this.controlGeneral.dialogoConfirmacion("¿Está seguro " +
       "que desea realizar esta operación?");
       if (resultado == 0){
           JOptionPane.showMessageDialog(Oh, "Para Poder eliminar la Empresa: "+
           empOnDelete.getNombre()+" Debe Reasignarle empresas de " +
           "Vigilancia a sus Tiendas y Centros de Distribución Asociados", "Info",1);
           this.iniciarVentanaReasignarEmpresaVigilancia(true);
           this.controlEmpresa.eliminarEmpresadelSistema(empOnDelete.getRif());
        }
    }//GEN-LAST:event_buttonEliminarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Vector<Lugar> result) {
                new VentanaEliminarEmpresaVigilancia(result).setVisible(true);
            }
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JTextField campoApellidoPer;
    private javax.swing.JTextArea campoDireccion;
    private javax.swing.JTextField campoNombrePer;
    private javax.swing.JTextField campoRif;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox comboCentros;
    private javax.swing.JComboBox comboCiudad;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JComboBox comboNombre;
    private javax.swing.JComboBox comboTiendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellidoPer;
    private javax.swing.JLabel labelCentros;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelNombreEmp;
    private javax.swing.JLabel labelNombrePer;
    private javax.swing.JLabel labelRif;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTiendas;
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

    public void cargarComboEmpresa(int idCiudad){
        this.comboNombre.removeAllItems();
        this.vecEmpsAux.removeAllElements();

        for (EmpresaVigilancia emp : vecEmps){
            if (emp.getLugarId() == idCiudad){
                this.vecEmpsAux.addElement(emp);
                this.comboNombre.addItem(emp.getNombre());
            }
        }
        if (this.comboNombre.getItemCount() == 0){
            this.comboCentros.removeAllItems();
            this.comboTiendas.removeAllItems();
            this.campoRif.setText("");
            this.campoTelefono.setText("");
            this.campoNombrePer.setText("");
            this.campoApellidoPer.setText("");
            this.campoDireccion.setText("");
        }
    }

    public void cargarComboTiendas(String rif){
        this.comboTiendas.removeAllItems();
        this.vecTiendasAux.removeAllElements();

        for (Tienda tienda : vecTiendas){
            if (tienda.getEMPRESA_SERVICIO_rif().equals(rif)){
                this.comboTiendas.addItem(tienda.getNombre());
                this.vecTiendasAux.addElement(tienda);
            }
        }
        if (this.comboTiendas.getItemCount() == 0){
            this.comboTiendas.addItem("0 tiendas asociadas");
        }
    }

    public void cargarComboCentros(String rif){
        this.comboCentros.removeAllItems();
        this.vecCentrosAux.removeAllElements();
        int idCentro = -1;
        Vector<Servicio> servicios = new Vector();

        servicios = this.controlEmpresa.traerTodosLosServicios(rif);

        for (Servicio servicio : servicios) {
            idCentro = servicio.getCentroDistribucionCodigo();
            for (CentroDistribucion centro : vecCentros){
                if (centro.getCodigo() == idCentro){
                    this.comboCentros.addItem(centro.getNombre());
                    this.vecCentrosAux.addElement(centro);
                }
            }
        }
        if (this.comboCentros.getItemCount() == 0 ){
            this.comboCentros.addItem("0 Centros Asociados a la empresa");
        }
    }

    public void iniciarVentanaReasignarEmpresaVigilancia(boolean var){
        ventanaReasignarEmpresaVigilancia  = new VentanaReasignarEmpresaVigilancia(empOnDelete,vecEmpsAux,vecTiendasAux,vecCentrosAux);
        this.ventanaReasignarEmpresaVigilancia.setVisible(var);
    }
}