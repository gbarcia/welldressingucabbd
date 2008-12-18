/*
 * VentanaInicio.java
 *
 * Created on November 18, 2008, 4:44 PM
 */

package com.wd.gui;

import com.wd.dominio.Departamento;
import com.wd.dominio.Horario;
import com.wd.dominio.Lugar;
import com.wd.gui.controlparticular.ControlGuiDepartamento;
import com.wd.gui.controlparticular.ControlGuiHorario;
import com.wd.gui.controlparticular.ControlGuiLugar;
import java.util.Vector;


/**
 *
 * @author  Johnny
 */
public class VentanaInicio extends javax.swing.JFrame {

    private ControlGui controlGeneralGui;
    private ControlGuiHorario controlGuiHorario;
    private ControlGuiDepartamento controlGuiDepartamento;
    private ControlGuiLugar controlGuiLugar;

    /** Creates new form VentanaInicio */
    public VentanaInicio() {
        initComponents();
        java.net.URL url = getClass().getResource("Iconos/icon_016.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage (imagen);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArcecaDe = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuTiendas = new javax.swing.JMenu();
        menuMantenimientoTienda = new javax.swing.JMenu();
        menuRegistrarTienda = new javax.swing.JMenuItem();
        menuEditarTienda = new javax.swing.JMenuItem();
        menuConsultarTienda = new javax.swing.JMenuItem();
        menuEliminarTienda = new javax.swing.JMenuItem();
        menuNominaTienda = new javax.swing.JMenu();
        menuAgregarEmpleadoTienda = new javax.swing.JMenuItem();
        menuEditarEmpleadoTienda = new javax.swing.JMenuItem();
        menuConsultarEmpleadoTienda = new javax.swing.JMenuItem();
        menuEliminarEmpleadoTienda = new javax.swing.JMenuItem();
        menuSeparadorTienda = new javax.swing.JSeparator();
        menuTransferirEmpleadoTienda = new javax.swing.JMenuItem();
        menuInventarioTienda = new javax.swing.JMenu();
        menuConsultaInventarioTienda = new javax.swing.JMenuItem();
        menuConsultaCentrosTienda = new javax.swing.JMenuItem();
        menuSolicitudesTienda = new javax.swing.JMenu();
        menuTransferenciasTienda = new javax.swing.JMenuItem();
        menuPedidosTienda = new javax.swing.JMenuItem();
        menuSeparadorDosTienda = new javax.swing.JSeparator();
        menuAsignarCentroTienda = new javax.swing.JMenuItem();
        menuTiendasSeparador = new javax.swing.JSeparator();
        menuEstadisticasTienda = new javax.swing.JMenuItem();
        menuCentros = new javax.swing.JMenu();
        menuCentroMantenimiento = new javax.swing.JMenu();
        menuCentroRegistro = new javax.swing.JMenuItem();
        menuCentroEditar = new javax.swing.JMenuItem();
        menuCentroConsultar = new javax.swing.JMenuItem();
        menuCentroEliminar = new javax.swing.JMenuItem();
        menuCentroNomina = new javax.swing.JMenu();
        menuCentroNominaAgregarEmpleado = new javax.swing.JMenuItem();
        menuCentroNominaEditarEmpleado = new javax.swing.JMenuItem();
        menuCentroNominaConsultarEmpleado = new javax.swing.JMenuItem();
        menuCentroNominaEliminarEmpleado = new javax.swing.JMenuItem();
        menuCentroNominaSeparador = new javax.swing.JSeparator();
        menuCentroNominaTrasnferirEmpelado = new javax.swing.JMenuItem();
        menuCentroSolicitudes = new javax.swing.JMenu();
        menuCentroSolicitudesOrdenCompra = new javax.swing.JMenuItem();
        menuCentroSolicitudesPedidosTiendas = new javax.swing.JMenuItem();
        menuCentroInventarios = new javax.swing.JMenu();
        menuCentroInventarioConsultar = new javax.swing.JMenuItem();
        menuCentroInventarioConsultarProvedores = new javax.swing.JMenuItem();
        menuCentroCamiones = new javax.swing.JMenu();
        menuCentroCamionRegistro = new javax.swing.JMenuItem();
        menuCentroCamionEditar = new javax.swing.JMenuItem();
        menuCentroCamionConsulta = new javax.swing.JMenuItem();
        menuCentroCamionEliminar = new javax.swing.JMenuItem();
        menuCentroCamionAgregarCamionSuelto = new javax.swing.JMenuItem();
        menuCentroAsignarProvedores = new javax.swing.JMenuItem();
        menuCentroSeparador = new javax.swing.JSeparator();
        menuCentroEstadisticas = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        menuProductosMantenimiento = new javax.swing.JMenu();
        MenuProductosAgregar = new javax.swing.JMenuItem();
        menuProductosEditar = new javax.swing.JMenuItem();
        menuProductosConsultar = new javax.swing.JMenuItem();
        menuProductosEliminar = new javax.swing.JMenuItem();
        menuProductosDepartamentos = new javax.swing.JMenu();
        menuProductosDepartamentosAgregar = new javax.swing.JMenuItem();
        menuProductosDepartamentosEditar = new javax.swing.JMenuItem();
        menuProductosDepartamentosConsultar = new javax.swing.JMenuItem();
        menuProductosDepartamentosEliminar = new javax.swing.JMenuItem();
        menuProductosClases = new javax.swing.JMenu();
        menuProductosClaseAgregar = new javax.swing.JMenuItem();
        menuProductosClaseEditar = new javax.swing.JMenuItem();
        menuProductosClaseConsultar = new javax.swing.JMenuItem();
        menuProductosClaseEliminar = new javax.swing.JMenuItem();
        menuProductosSubClases = new javax.swing.JMenu();
        menuProductosSubAgregar = new javax.swing.JMenuItem();
        menuProductosSubEditar = new javax.swing.JMenuItem();
        menuProductosSubConsultar = new javax.swing.JMenuItem();
        menuProductosSubEliminar = new javax.swing.JMenuItem();
        menuProductosSeparador = new javax.swing.JSeparator();
        menuProductosConsultarPrecios = new javax.swing.JMenuItem();
        menuProductosEstadisticas = new javax.swing.JMenuItem();
        menuServicios = new javax.swing.JMenu();
        menuServiciosVigilancia = new javax.swing.JMenu();
        menuServiciosVigilanciaAgregar = new javax.swing.JMenuItem();
        menuServiciosVigilanciaEditar = new javax.swing.JMenuItem();
        menuServiciosVigilanciaConsultar = new javax.swing.JMenuItem();
        menuServiciosVigilanciaEliminar = new javax.swing.JMenuItem();
        menuServiciosProvedores = new javax.swing.JMenu();
        menuServiciosProvedoresAgregar = new javax.swing.JMenuItem();
        menuServiciosProvedoresEditar = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        menuServiciosProvedoresConsultar = new javax.swing.JMenuItem();
        menuServiciosProvedoresEliminar = new javax.swing.JMenuItem();
        menuServiciosProvedorSeparador = new javax.swing.JSeparator();
        menuServiciosProvedorAgregarProductos = new javax.swing.JMenuItem();
        menusSeriviciosProvedoreEditarProductos = new javax.swing.JMenuItem();
        menuServiciosProvedorEliminarProductos = new javax.swing.JMenuItem();
        menuServiciosSeparador = new javax.swing.JSeparator();
        menuServiciosEstadisticas = new javax.swing.JMenuItem();
        menuUbicaciones = new javax.swing.JMenu();
        menuUbicacionesHorarios = new javax.swing.JMenu();
        menuUbicacionesHorarioAgregar = new javax.swing.JMenuItem();
        menuUbicacionesHorariosEliminar = new javax.swing.JMenuItem();
        menuUbicacionesLugares = new javax.swing.JMenu();
        menuUbicacionesLugarNuevo = new javax.swing.JMenuItem();
        menuUbicacionesLugarConsulta = new javax.swing.JMenuItem();
        menuHistorial = new javax.swing.JMenu();
        menuHistorialTiendas = new javax.swing.JMenuItem();
        menuHistorialCentros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Well Dressing");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Imagenes/entrada.png"))); // NOI18N
        jLabel1.setToolTipText("Bienvenidos al Sistema WellDressing");

        menuArchivo.setText("Archivo");

        menuArcecaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuArcecaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wd/gui/Iconos/icon_016.png"))); // NOI18N
        menuArcecaDe.setText("Acerca de...");
        menuArcecaDe.setToolTipText("Informacion sobre el Grupo de Desarrollo");
        menuArchivo.add(menuArcecaDe);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        menuBar.add(menuArchivo);

        menuTiendas.setText("Tiendas");

        menuMantenimientoTienda.setText("Mantenimiento");

        menuRegistrarTienda.setText("Registro de tienda");
        menuMantenimientoTienda.add(menuRegistrarTienda);

        menuEditarTienda.setText("Editar una tienda");
        menuMantenimientoTienda.add(menuEditarTienda);

        menuConsultarTienda.setText("Consultar una tienda");
        menuMantenimientoTienda.add(menuConsultarTienda);

        menuEliminarTienda.setText("Eliminar una tienda");
        menuMantenimientoTienda.add(menuEliminarTienda);

        menuTiendas.add(menuMantenimientoTienda);

        menuNominaTienda.setText("Nomina");

        menuAgregarEmpleadoTienda.setText("Agregar un empleado");
        menuNominaTienda.add(menuAgregarEmpleadoTienda);

        menuEditarEmpleadoTienda.setText("Editar un empleado");
        menuNominaTienda.add(menuEditarEmpleadoTienda);

        menuConsultarEmpleadoTienda.setText("Consultar un empleado");
        menuNominaTienda.add(menuConsultarEmpleadoTienda);

        menuEliminarEmpleadoTienda.setText("Eliminar un empleado");
        menuNominaTienda.add(menuEliminarEmpleadoTienda);
        menuNominaTienda.add(menuSeparadorTienda);

        menuTransferirEmpleadoTienda.setText("Transferir empleado");
        menuNominaTienda.add(menuTransferirEmpleadoTienda);

        menuTiendas.add(menuNominaTienda);

        menuInventarioTienda.setText("Inventario");

        menuConsultaInventarioTienda.setText("Consulta de inventario");
        menuInventarioTienda.add(menuConsultaInventarioTienda);

        menuConsultaCentrosTienda.setText("Consulta de centros");
        menuInventarioTienda.add(menuConsultaCentrosTienda);

        menuTiendas.add(menuInventarioTienda);

        menuSolicitudesTienda.setText("Solicitudes");

        menuTransferenciasTienda.setText("Transferencias");
        menuSolicitudesTienda.add(menuTransferenciasTienda);

        menuPedidosTienda.setText("Pedidos");
        menuSolicitudesTienda.add(menuPedidosTienda);
        menuSolicitudesTienda.add(menuSeparadorDosTienda);

        menuTiendas.add(menuSolicitudesTienda);

        menuAsignarCentroTienda.setText("Asignar Centro");
        menuTiendas.add(menuAsignarCentroTienda);
        menuTiendas.add(menuTiendasSeparador);

        menuEstadisticasTienda.setText("Estadisticas");
        menuTiendas.add(menuEstadisticasTienda);

        menuBar.add(menuTiendas);

        menuCentros.setText("Centros");

        menuCentroMantenimiento.setText("Mantenimiento");

        menuCentroRegistro.setText("Registro de centro");
        menuCentroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCentroRegistroActionPerformed(evt);
            }
        });
        menuCentroMantenimiento.add(menuCentroRegistro);

        menuCentroEditar.setText("Editar un centro");
        menuCentroMantenimiento.add(menuCentroEditar);

        menuCentroConsultar.setText("Consultar un centro");
        menuCentroMantenimiento.add(menuCentroConsultar);

        menuCentroEliminar.setText("Eliminar un centro");
        menuCentroMantenimiento.add(menuCentroEliminar);

        menuCentros.add(menuCentroMantenimiento);

        menuCentroNomina.setText("Nomina");

        menuCentroNominaAgregarEmpleado.setText("Agregar un empleado");
        menuCentroNomina.add(menuCentroNominaAgregarEmpleado);

        menuCentroNominaEditarEmpleado.setText("Editar un empleado");
        menuCentroNomina.add(menuCentroNominaEditarEmpleado);

        menuCentroNominaConsultarEmpleado.setText("Consultar un empleado");
        menuCentroNomina.add(menuCentroNominaConsultarEmpleado);

        menuCentroNominaEliminarEmpleado.setText("Eliminar un empleado");
        menuCentroNomina.add(menuCentroNominaEliminarEmpleado);
        menuCentroNomina.add(menuCentroNominaSeparador);

        menuCentroNominaTrasnferirEmpelado.setText("Transferir empleado");
        menuCentroNominaTrasnferirEmpelado.setEnabled(false);
        menuCentroNomina.add(menuCentroNominaTrasnferirEmpelado);

        menuCentros.add(menuCentroNomina);

        menuCentroSolicitudes.setText("Solicitudes");

        menuCentroSolicitudesOrdenCompra.setText("Ordenes de compra");
        menuCentroSolicitudes.add(menuCentroSolicitudesOrdenCompra);

        menuCentroSolicitudesPedidosTiendas.setText("Pedidos realizados de tiendas");
        menuCentroSolicitudes.add(menuCentroSolicitudesPedidosTiendas);

        menuCentros.add(menuCentroSolicitudes);

        menuCentroInventarios.setText("Inventario");

        menuCentroInventarioConsultar.setText("Consulta de inventario");
        menuCentroInventarios.add(menuCentroInventarioConsultar);

        menuCentroInventarioConsultarProvedores.setText("Consulta de proveedores");
        menuCentroInventarios.add(menuCentroInventarioConsultarProvedores);

        menuCentros.add(menuCentroInventarios);

        menuCentroCamiones.setText("Camiones");

        menuCentroCamionRegistro.setText("Registro de camion");
        menuCentroCamiones.add(menuCentroCamionRegistro);

        menuCentroCamionEditar.setText("Editar un camion");
        menuCentroCamiones.add(menuCentroCamionEditar);

        menuCentroCamionConsulta.setText("Consultar un camion");
        menuCentroCamiones.add(menuCentroCamionConsulta);

        menuCentroCamionEliminar.setText("Eliminar un camion");
        menuCentroCamiones.add(menuCentroCamionEliminar);

        menuCentroCamionAgregarCamionSuelto.setText("Agregar un camion a un centro");
        menuCentroCamiones.add(menuCentroCamionAgregarCamionSuelto);

        menuCentros.add(menuCentroCamiones);

        menuCentroAsignarProvedores.setText("Asignar Provedores");
        menuCentros.add(menuCentroAsignarProvedores);
        menuCentros.add(menuCentroSeparador);

        menuCentroEstadisticas.setText("Estadisticas");
        menuCentros.add(menuCentroEstadisticas);

        menuBar.add(menuCentros);

        menuProductos.setText("Productos");

        menuProductosMantenimiento.setText("Mantenimiento");

        MenuProductosAgregar.setText("Agregar producto");
        menuProductosMantenimiento.add(MenuProductosAgregar);

        menuProductosEditar.setText("Editar producto");
        menuProductosMantenimiento.add(menuProductosEditar);

        menuProductosConsultar.setText("Consultar producto");
        menuProductosMantenimiento.add(menuProductosConsultar);

        menuProductosEliminar.setText("Eliminar producto");
        menuProductosMantenimiento.add(menuProductosEliminar);

        menuProductos.add(menuProductosMantenimiento);

        menuProductosDepartamentos.setText("Departamentos");

        menuProductosDepartamentosAgregar.setText("Agregar departamento");
        menuProductosDepartamentosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosDepartamentosAgregarActionPerformed(evt);
            }
        });
        menuProductosDepartamentos.add(menuProductosDepartamentosAgregar);

        menuProductosDepartamentosEditar.setText("Editar departamento");
        menuProductosDepartamentosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosDepartamentosEditarActionPerformed(evt);
            }
        });
        menuProductosDepartamentos.add(menuProductosDepartamentosEditar);

        menuProductosDepartamentosConsultar.setText("Consultar departamento");
        menuProductosDepartamentosConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosDepartamentosConsultarActionPerformed(evt);
            }
        });
        menuProductosDepartamentos.add(menuProductosDepartamentosConsultar);

        menuProductosDepartamentosEliminar.setText("Eliminar departamento");
        menuProductosDepartamentosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosDepartamentosEliminarActionPerformed(evt);
            }
        });
        menuProductosDepartamentos.add(menuProductosDepartamentosEliminar);

        menuProductos.add(menuProductosDepartamentos);

        menuProductosClases.setText("Clases");

        menuProductosClaseAgregar.setText("Agregar clase");
        menuProductosClaseAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosClaseAgregarActionPerformed(evt);
            }
        });
        menuProductosClases.add(menuProductosClaseAgregar);

        menuProductosClaseEditar.setText("Editar clase");
        menuProductosClases.add(menuProductosClaseEditar);

        menuProductosClaseConsultar.setText("Consultar clase");
        menuProductosClaseConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosClaseConsultarActionPerformed(evt);
            }
        });
        menuProductosClases.add(menuProductosClaseConsultar);

        menuProductosClaseEliminar.setText("Eliminar clase");
        menuProductosClases.add(menuProductosClaseEliminar);

        menuProductos.add(menuProductosClases);

        menuProductosSubClases.setText("Sub Clases");

        menuProductosSubAgregar.setText("Agregar sub clase");
        menuProductosSubClases.add(menuProductosSubAgregar);

        menuProductosSubEditar.setText("Editar sub clase");
        menuProductosSubClases.add(menuProductosSubEditar);

        menuProductosSubConsultar.setText("Consultar sub clase");
        menuProductosSubClases.add(menuProductosSubConsultar);

        menuProductosSubEliminar.setText("Eliminar sub clase");
        menuProductosSubClases.add(menuProductosSubEliminar);

        menuProductos.add(menuProductosSubClases);
        menuProductos.add(menuProductosSeparador);

        menuProductosConsultarPrecios.setText("Consultar Precios");
        menuProductos.add(menuProductosConsultarPrecios);

        menuProductosEstadisticas.setText("Estadisticas");
        menuProductos.add(menuProductosEstadisticas);

        menuBar.add(menuProductos);

        menuServicios.setText("Servicios");

        menuServiciosVigilancia.setText("Servicio de vigilancia");

        menuServiciosVigilanciaAgregar.setText("Agregar servicio de vigilancia");
        menuServiciosVigilancia.add(menuServiciosVigilanciaAgregar);

        menuServiciosVigilanciaEditar.setText("Editar servicio de vigilancia");
        menuServiciosVigilancia.add(menuServiciosVigilanciaEditar);

        menuServiciosVigilanciaConsultar.setText("Consultar servicio de vigilancia");
        menuServiciosVigilancia.add(menuServiciosVigilanciaConsultar);

        menuServiciosVigilanciaEliminar.setText("Eliminar servicio de vigilancia");
        menuServiciosVigilancia.add(menuServiciosVigilanciaEliminar);

        menuServicios.add(menuServiciosVigilancia);

        menuServiciosProvedores.setText("Proveedores");

        menuServiciosProvedoresAgregar.setText("Agregar proveedor");
        menuServiciosProvedores.add(menuServiciosProvedoresAgregar);

        menuServiciosProvedoresEditar.setText("Editar proveedor");

        jMenuItem17.setText("Editar informacion");
        menuServiciosProvedoresEditar.add(jMenuItem17);
        menuServiciosProvedoresEditar.add(jSeparator2);

        jMenuItem20.setText("Agregar productos");
        menuServiciosProvedoresEditar.add(jMenuItem20);

        jMenuItem21.setText("Editar productos");
        menuServiciosProvedoresEditar.add(jMenuItem21);

        jMenuItem22.setText("Consultar productos");
        menuServiciosProvedoresEditar.add(jMenuItem22);

        jMenuItem23.setText("Eliminar productos");
        menuServiciosProvedoresEditar.add(jMenuItem23);

        menuServiciosProvedores.add(menuServiciosProvedoresEditar);

        menuServiciosProvedoresConsultar.setText("Consultar proveedor");
        menuServiciosProvedores.add(menuServiciosProvedoresConsultar);

        menuServiciosProvedoresEliminar.setText("Eliminar proveedor");
        menuServiciosProvedores.add(menuServiciosProvedoresEliminar);
        menuServiciosProvedores.add(menuServiciosProvedorSeparador);

        menuServiciosProvedorAgregarProductos.setText("Agregar Productos");
        menuServiciosProvedores.add(menuServiciosProvedorAgregarProductos);

        menusSeriviciosProvedoreEditarProductos.setText("Editar Productos");
        menuServiciosProvedores.add(menusSeriviciosProvedoreEditarProductos);

        menuServiciosProvedorEliminarProductos.setText("Eliminar Productos");
        menuServiciosProvedores.add(menuServiciosProvedorEliminarProductos);

        menuServicios.add(menuServiciosProvedores);
        menuServicios.add(menuServiciosSeparador);

        menuServiciosEstadisticas.setText("Estadisticas");
        menuServicios.add(menuServiciosEstadisticas);

        menuBar.add(menuServicios);

        menuUbicaciones.setText("Ubicaciones");

        menuUbicacionesHorarios.setText("Horarios");

        menuUbicacionesHorarioAgregar.setText("Agregar nuevo horario");
        menuUbicacionesHorarioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUbicacionesHorarioAgregarActionPerformed(evt);
            }
        });
        menuUbicacionesHorarios.add(menuUbicacionesHorarioAgregar);

        menuUbicacionesHorariosEliminar.setText("Ver todos los horarios");
        menuUbicacionesHorariosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUbicacionesHorariosEliminarActionPerformed(evt);
            }
        });
        menuUbicacionesHorarios.add(menuUbicacionesHorariosEliminar);

        menuUbicaciones.add(menuUbicacionesHorarios);

        menuUbicacionesLugares.setText("Lugares");

        menuUbicacionesLugarNuevo.setText("Nuevo lugar");
        menuUbicacionesLugares.add(menuUbicacionesLugarNuevo);

        menuUbicacionesLugarConsulta.setText("Consulta de lugares");
        menuUbicacionesLugarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUbicacionesLugarConsultaActionPerformed(evt);
            }
        });
        menuUbicacionesLugares.add(menuUbicacionesLugarConsulta);

        menuUbicaciones.add(menuUbicacionesLugares);

        menuBar.add(menuUbicaciones);

        menuHistorial.setText("Personal");

        menuHistorialTiendas.setText("Personal Tiendas");
        menuHistorial.add(menuHistorialTiendas);

        menuHistorialCentros.setText("Personal Centros");
        menuHistorial.add(menuHistorialCentros);

        menuBar.add(menuHistorial);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUbicacionesHorarioAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUbicacionesHorarioAgregarActionPerformed
            controlGeneralGui = new ControlGui ();
            controlGeneralGui.iniciarVentanaNuevoHorario(true);
    }//GEN-LAST:event_menuUbicacionesHorarioAgregarActionPerformed

    private void menuCentroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCentroRegistroActionPerformed
        controlGeneralGui = new ControlGui ();
        controlGeneralGui.iniciarVentanaAgregarCentro(true);
    }//GEN-LAST:event_menuCentroRegistroActionPerformed

    private void menuUbicacionesHorariosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUbicacionesHorariosEliminarActionPerformed
           Vector<Horario> result = null;
           this.controlGuiHorario = new ControlGuiHorario();
           result = this.controlGuiHorario.traerTodosLosHorarios();
           this.controlGeneralGui = new ControlGui();
           this.controlGeneralGui.iniciarVentanaConsultarHorario(true, result);
    }//GEN-LAST:event_menuUbicacionesHorariosEliminarActionPerformed

    private void menuProductosDepartamentosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosDepartamentosAgregarActionPerformed
        controlGeneralGui = new ControlGui ();
        controlGeneralGui.iniciarVentanaAgregarDepartamento(true);
    }//GEN-LAST:event_menuProductosDepartamentosAgregarActionPerformed

    private void menuProductosDepartamentosConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosDepartamentosConsultarActionPerformed

        Vector<Departamento> result = null;
        this.controlGuiDepartamento = new ControlGuiDepartamento();
        result = this.controlGuiDepartamento.traerTodosLosDepartamentos();
        controlGeneralGui = new ControlGui();
        controlGeneralGui.iniciarVentanaConsultarDepartamentos(true, result);
    }//GEN-LAST:event_menuProductosDepartamentosConsultarActionPerformed

    private void menuProductosDepartamentosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosDepartamentosEliminarActionPerformed
        Vector<Departamento> result = null;
        this.controlGuiDepartamento = new ControlGuiDepartamento();
        result = this.controlGuiDepartamento.traerTodosLosDepartamentos();
        controlGeneralGui = new ControlGui();
        controlGeneralGui.iniciarVentanaEliminarDepartamento(true, result);
    }//GEN-LAST:event_menuProductosDepartamentosEliminarActionPerformed

    private void menuProductosDepartamentosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosDepartamentosEditarActionPerformed
        Vector<Departamento> result = null;
        this.controlGuiDepartamento = new ControlGuiDepartamento();
        result = this.controlGuiDepartamento.traerTodosLosDepartamentos();
        controlGeneralGui = new ControlGui();
        controlGeneralGui.iniciarVentanaModificarDepartamento(true, result);
    }//GEN-LAST:event_menuProductosDepartamentosEditarActionPerformed

    private void menuUbicacionesLugarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUbicacionesLugarConsultaActionPerformed
        Vector<Lugar> resultadoEdo = null;
        Vector<Lugar> resultadoCiudad = null;
        this.controlGuiLugar = new ControlGuiLugar();
        resultadoEdo = this.controlGuiLugar.traerTodosLosLugares(1);
        resultadoCiudad = this.controlGuiLugar.traerTodosLosLugares(2);
        controlGeneralGui = new  ControlGui();
        controlGeneralGui.iniciarVentanaConsultaLugares(true, resultadoEdo,
                                                        resultadoCiudad);
    }//GEN-LAST:event_menuUbicacionesLugarConsultaActionPerformed

    private void menuProductosClaseAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosClaseAgregarActionPerformed
        Vector<Departamento> result = null;
        this.controlGuiDepartamento = new ControlGuiDepartamento();
        result = this.controlGuiDepartamento.traerTodosLosDepartamentos();
        controlGeneralGui = new ControlGui();
        controlGeneralGui.iniciarVentanaAgregarClase(true, result);
    }//GEN-LAST:event_menuProductosClaseAgregarActionPerformed

    private void menuProductosClaseConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosClaseConsultarActionPerformed
        Vector<Departamento> dptos = null;
        Vector<Departamento> clases = null;
        Vector<Departamento> subclases = null;


        this.controlGuiDepartamento = new ControlGuiDepartamento();
        dptos = this.controlGuiDepartamento.traerTodosLosDepartamentos();
        clases = this.controlGuiDepartamento.traerTodasLasClases();
        subclases = this.controlGuiDepartamento.traerTodasLasSubClases();
        controlGeneralGui = new ControlGui();
        controlGeneralGui.iniciarVentanaConsultarClase(true, dptos,clases,subclases);
    }//GEN-LAST:event_menuProductosClaseConsultarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuProductosAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem menuAgregarEmpleadoTienda;
    private javax.swing.JMenuItem menuArcecaDe;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuAsignarCentroTienda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCentroAsignarProvedores;
    private javax.swing.JMenuItem menuCentroCamionAgregarCamionSuelto;
    private javax.swing.JMenuItem menuCentroCamionConsulta;
    private javax.swing.JMenuItem menuCentroCamionEditar;
    private javax.swing.JMenuItem menuCentroCamionEliminar;
    private javax.swing.JMenuItem menuCentroCamionRegistro;
    private javax.swing.JMenu menuCentroCamiones;
    private javax.swing.JMenuItem menuCentroConsultar;
    private javax.swing.JMenuItem menuCentroEditar;
    private javax.swing.JMenuItem menuCentroEliminar;
    private javax.swing.JMenuItem menuCentroEstadisticas;
    private javax.swing.JMenuItem menuCentroInventarioConsultar;
    private javax.swing.JMenuItem menuCentroInventarioConsultarProvedores;
    private javax.swing.JMenu menuCentroInventarios;
    private javax.swing.JMenu menuCentroMantenimiento;
    private javax.swing.JMenu menuCentroNomina;
    private javax.swing.JMenuItem menuCentroNominaAgregarEmpleado;
    private javax.swing.JMenuItem menuCentroNominaConsultarEmpleado;
    private javax.swing.JMenuItem menuCentroNominaEditarEmpleado;
    private javax.swing.JMenuItem menuCentroNominaEliminarEmpleado;
    private javax.swing.JSeparator menuCentroNominaSeparador;
    private javax.swing.JMenuItem menuCentroNominaTrasnferirEmpelado;
    private javax.swing.JMenuItem menuCentroRegistro;
    private javax.swing.JSeparator menuCentroSeparador;
    private javax.swing.JMenu menuCentroSolicitudes;
    private javax.swing.JMenuItem menuCentroSolicitudesOrdenCompra;
    private javax.swing.JMenuItem menuCentroSolicitudesPedidosTiendas;
    private javax.swing.JMenu menuCentros;
    private javax.swing.JMenuItem menuConsultaCentrosTienda;
    private javax.swing.JMenuItem menuConsultaInventarioTienda;
    private javax.swing.JMenuItem menuConsultarEmpleadoTienda;
    private javax.swing.JMenuItem menuConsultarTienda;
    private javax.swing.JMenuItem menuEditarEmpleadoTienda;
    private javax.swing.JMenuItem menuEditarTienda;
    private javax.swing.JMenuItem menuEliminarEmpleadoTienda;
    private javax.swing.JMenuItem menuEliminarTienda;
    private javax.swing.JMenuItem menuEstadisticasTienda;
    private javax.swing.JMenu menuHistorial;
    private javax.swing.JMenuItem menuHistorialCentros;
    private javax.swing.JMenuItem menuHistorialTiendas;
    private javax.swing.JMenu menuInventarioTienda;
    private javax.swing.JMenu menuMantenimientoTienda;
    private javax.swing.JMenu menuNominaTienda;
    private javax.swing.JMenuItem menuPedidosTienda;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenuItem menuProductosClaseAgregar;
    private javax.swing.JMenuItem menuProductosClaseConsultar;
    private javax.swing.JMenuItem menuProductosClaseEditar;
    private javax.swing.JMenuItem menuProductosClaseEliminar;
    private javax.swing.JMenu menuProductosClases;
    private javax.swing.JMenuItem menuProductosConsultar;
    private javax.swing.JMenuItem menuProductosConsultarPrecios;
    private javax.swing.JMenu menuProductosDepartamentos;
    private javax.swing.JMenuItem menuProductosDepartamentosAgregar;
    private javax.swing.JMenuItem menuProductosDepartamentosConsultar;
    private javax.swing.JMenuItem menuProductosDepartamentosEditar;
    private javax.swing.JMenuItem menuProductosDepartamentosEliminar;
    private javax.swing.JMenuItem menuProductosEditar;
    private javax.swing.JMenuItem menuProductosEliminar;
    private javax.swing.JMenuItem menuProductosEstadisticas;
    private javax.swing.JMenu menuProductosMantenimiento;
    private javax.swing.JSeparator menuProductosSeparador;
    private javax.swing.JMenuItem menuProductosSubAgregar;
    private javax.swing.JMenu menuProductosSubClases;
    private javax.swing.JMenuItem menuProductosSubConsultar;
    private javax.swing.JMenuItem menuProductosSubEditar;
    private javax.swing.JMenuItem menuProductosSubEliminar;
    private javax.swing.JMenuItem menuRegistrarTienda;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JSeparator menuSeparadorDosTienda;
    private javax.swing.JSeparator menuSeparadorTienda;
    private javax.swing.JMenu menuServicios;
    private javax.swing.JMenuItem menuServiciosEstadisticas;
    private javax.swing.JMenuItem menuServiciosProvedorAgregarProductos;
    private javax.swing.JMenuItem menuServiciosProvedorEliminarProductos;
    private javax.swing.JSeparator menuServiciosProvedorSeparador;
    private javax.swing.JMenu menuServiciosProvedores;
    private javax.swing.JMenuItem menuServiciosProvedoresAgregar;
    private javax.swing.JMenuItem menuServiciosProvedoresConsultar;
    private javax.swing.JMenu menuServiciosProvedoresEditar;
    private javax.swing.JMenuItem menuServiciosProvedoresEliminar;
    private javax.swing.JSeparator menuServiciosSeparador;
    private javax.swing.JMenu menuServiciosVigilancia;
    private javax.swing.JMenuItem menuServiciosVigilanciaAgregar;
    private javax.swing.JMenuItem menuServiciosVigilanciaConsultar;
    private javax.swing.JMenuItem menuServiciosVigilanciaEditar;
    private javax.swing.JMenuItem menuServiciosVigilanciaEliminar;
    private javax.swing.JMenu menuSolicitudesTienda;
    private javax.swing.JMenu menuTiendas;
    private javax.swing.JSeparator menuTiendasSeparador;
    private javax.swing.JMenuItem menuTransferenciasTienda;
    private javax.swing.JMenuItem menuTransferirEmpleadoTienda;
    private javax.swing.JMenu menuUbicaciones;
    private javax.swing.JMenuItem menuUbicacionesHorarioAgregar;
    private javax.swing.JMenu menuUbicacionesHorarios;
    private javax.swing.JMenuItem menuUbicacionesHorariosEliminar;
    private javax.swing.JMenuItem menuUbicacionesLugarConsulta;
    private javax.swing.JMenuItem menuUbicacionesLugarNuevo;
    private javax.swing.JMenu menuUbicacionesLugares;
    private javax.swing.JMenuItem menusSeriviciosProvedoreEditarProductos;
    // End of variables declaration//GEN-END:variables

}
