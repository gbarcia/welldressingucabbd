/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaEditarProducto.java
 *
 * Created on Jan 13, 2009, 2:28:34 AM
 */

package com.wd.gui;

import com.wd.dominio.Departamento;
import com.wd.dominio.Producto;
import com.wd.gui.controlparticular.ControlGuiDepartamento;
import com.wd.gui.controlparticular.ControlGuiProducto;
import com.wd.gui.controlparticular.ControlGuiProductoDepartamento;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Johnny
 */
public class VentanaEditarProducto extends javax.swing.JFrame {

    private ControlGui control_gui;
    private ControlGuiProducto control_gui_producto;
    private ControlGuiProductoDepartamento control_gui_producto_departamento;
    private ControlGuiDepartamento contro_gui_departamento;

    private Vector<Departamento> departamentos;
    private Vector<Departamento> clases;
    private Vector<Departamento> subclases;

    /** las sublcases del un producto*/
    private Vector<Departamento> seleccion;
    /** las nuevas sublcases seleccionadas de un producto*/
    private Vector<Departamento> nuevaSeleccion;
    /** todos los productos*/
    private Vector<Producto> productos;
    /** todos los productos-departamentos*/
    private Vector<Producto> producto_departamento;

    /** producto seleccionado*/
    private Producto producto;

    /** Creates new form VentanaEditarProducto */
    public VentanaEditarProducto() {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);
        this.initControles();
        this.initVectores();
        this.llenarProductos();
        this.llenarLista();
        if (this.jComboBox_productos.getSelectedIndex() != -1)
            this.jComboBox_productos.setSelectedIndex(0);
    }

   private void initControles(){
        this.control_gui = new ControlGui();
        this.contro_gui_departamento = new ControlGuiDepartamento();
        this.control_gui_producto = new ControlGuiProducto();
        this.control_gui_producto_departamento = new ControlGuiProductoDepartamento();
    }

    private void initVectores(){
        this.departamentos = this.contro_gui_departamento.traerTodosLosDepartamentos();
        this.clases = new Vector<Departamento>();
        this.subclases = new Vector(this.control_gui_producto_departamento.traerTodasLasSubclases());
        this.seleccion = new Vector<Departamento>();
        this.productos = this.control_gui_producto.traerTodosLosProductos();
        this.producto_departamento = new Vector(
                this.control_gui_producto_departamento.traerTodosLosProductoDepartamento());
        this.nuevaSeleccion = new Vector<Departamento>();
    }

    private void llenarProductos(){
        Vector<String> modeloComboBox = new Vector<String>();
        for (Producto p : productos){
            modeloComboBox.add(p.getNombre());
        }
        this.jComboBox_productos.setModel(
                new DefaultComboBoxModel(modeloComboBox.toArray()));
    }

    private void llenarInformacion(){
        this.jTextField_nombre.setText(this.producto.getNombre());
        this.jTextPane_descripcion.setText(this.producto.getDescripcion());
        this.seleccionarSubclasesPertenece();
        
    }

    private void seleccionarSubclasesPertenece(){
        Vector<Departamento> result = new Vector<Departamento>();
        for (Producto pd : this.producto_departamento) {
            if (pd.getId() == this.producto.getId()){
                for (Departamento subclase : this.subclases) {
                    if (subclase.getCodigo() == pd.getDepartamentoId()){
                        result.add(subclase);
                    }
                }
            }
        }
        this.seleccion = result;
    }

    private void seleccionarSubclasesSeleccionadas(){
        this.nuevaSeleccion = new Vector<Departamento>();
        int[] indices = this.jList1.getSelectedIndices();
        for (int i : indices) {
            this.nuevaSeleccion.add(this.subclases.get(i));
        }
    }

    private void llenarLista(){
        this.subclases = new Vector<Departamento>(this.control_gui_producto_departamento.traerTodasLasSubclases());
        DefaultListModel modelo = new DefaultListModel();
        for (Departamento subclase : subclases) {
            modelo.addElement(subclase.getNombre());
        }
        this.jList1.setModel(modelo);
    }

    private boolean valido(){
        if (this.jTextField_nombre.getText().isEmpty()){
            this.control_gui.mostrarMensaje("Introduzca un nombre", 1);
            return false;
        }
        if (this.nuevaSeleccion.isEmpty()){
            this.control_gui.mostrarMensaje("Debe seleccionar una o mas categorias", 1);
            return false;
        }
        return true;
    }

    private void agregarProductoDepartamneto(){
        for (Departamento departamento : nuevaSeleccion) {
            this.control_gui_producto_departamento.agregarProductoDepartamento(
                    new Producto(this.producto.getId(), departamento.getCodigo()));
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
        jPanel2 = new javax.swing.JPanel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_descripcion = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel25 = new javax.swing.JPanel();
        jComboBox_productos = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Producto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Producto"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Producto"));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 263));

        jTextField_nombre.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel1.setText("Nombre");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 66));
        jScrollPane1.setViewportView(jTextPane_descripcion);

        jLabel9.setText("Descripción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación del Producto"));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 263));

        jLabel11.setText("Subclases");

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione un Producto"));

        jComboBox_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productossActionPerformed(evt);
            }
        });

        jLabel12.setText("Productos");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jComboBox_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_registrar.setText("Editar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_registrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_registrar)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_productossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productossActionPerformed
        this.producto = this.productos.get(this.jComboBox_productos.getSelectedIndex());
        this.llenarInformacion();
}//GEN-LAST:event_jComboBox_productossActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        this.seleccionarSubclasesSeleccionadas();
        if (this.valido()){
            boolean resultado = this.control_gui_producto.modificarProducto(
                    new Producto(this.producto.getId(), this.jTextField_nombre.getText(), this.jTextPane_descripcion.getText()));
            if (resultado){
                this.productos = this.control_gui_producto.traerTodosLosProductos();
                this.control_gui_producto_departamento.eliminarProductoDepartamento(producto.getId());
                this.agregarProductoDepartamneto();
                System.out.println("");
            }
        }
}//GEN-LAST:event_jButton_registrarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEditarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox jComboBox_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextPane jTextPane_descripcion;
    // End of variables declaration//GEN-END:variables

}
