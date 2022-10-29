/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Logic.*;
import javax.swing.JInternalFrame;

/**
 *
 * @author PC
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/company.png"));
        this.setIconImage(icon.getImage());
        
        D1.recuperarDeArchivo();
        P1.recuperarDeArchivo();
        
    }

    Departamento D1 = new Departamento();
    Puesto P1 = new Puesto();
    Empleado E1;
    Jornada J1;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraHerramientas = new javax.swing.JToolBar();
        btnDepartamento = new javax.swing.JButton();
        btnPuesto = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnJornada = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuDepartamentos = new javax.swing.JMenuItem();
        mnuPuestos = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenuItem();
        mnuJornadas = new javax.swing.JMenuItem();
        mnuPlanillas = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuVentanaMain = new javax.swing.JMenu();
        mnuCascada = new javax.swing.JMenuItem();
        mnuParalelo = new javax.swing.JMenuItem();
        mnuCerrar = new javax.swing.JMenu();
        mnuActual = new javax.swing.JMenuItem();
        mnuTodas = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();
        mnuContenido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa XYZ. SA");

        btnDepartamento.setText("Departamento");
        btnDepartamento.setFocusable(false);
        btnDepartamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepartamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnDepartamento);

        btnPuesto.setText("Puesto");
        btnPuesto.setFocusable(false);
        btnPuesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPuesto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnPuesto);

        btnEmpleado.setText("Empleado");
        btnEmpleado.setFocusable(false);
        btnEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnEmpleado);

        btnJornada.setText("Jornada");
        btnJornada.setFocusable(false);
        btnJornada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJornada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJornadaActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnJornada);

        btnExit.setText("Salir");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnExit);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        mnuDepartamentos.setText("Departamentos");
        mnuDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDepartamentosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuDepartamentos);

        mnuPuestos.setText("Puestos de trabajo");
        mnuPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPuestosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuPuestos);

        mnuEmpleados.setText("Empleados");
        mnuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpleadosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuEmpleados);

        mnuJornadas.setText("Jornadas Laborales");
        mnuJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJornadasActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuJornadas);

        mnuPlanillas.setText("Planillas");
        mnuArchivo.add(mnuPlanillas);

        mnuUsuario.setText("Usuario");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuUsuario);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalir);

        jMenuBar1.add(mnuArchivo);

        mnuVentanaMain.setText("Ventana");

        mnuCascada.setText("Cascada");
        mnuCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCascadaActionPerformed(evt);
            }
        });
        mnuVentanaMain.add(mnuCascada);

        mnuParalelo.setText("Paralelo");
        mnuParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuParaleloActionPerformed(evt);
            }
        });
        mnuVentanaMain.add(mnuParalelo);

        mnuCerrar.setText("Cerrar");

        mnuActual.setText("Actual");
        mnuActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActualActionPerformed(evt);
            }
        });
        mnuCerrar.add(mnuActual);

        mnuTodas.setText("Todas");
        mnuTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTodasActionPerformed(evt);
            }
        });
        mnuCerrar.add(mnuTodas);

        mnuVentanaMain.add(mnuCerrar);

        jMenuBar1.add(mnuVentanaMain);

        mnuAyuda.setText("Ayuda");

        mnuAcercaDe.setText("Acerca de...");
        mnuAyuda.add(mnuAcercaDe);

        mnuContenido.setText("Contenido");
        mnuAyuda.add(mnuContenido);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoActionPerformed
    MostrarDepartamento verDepartamentos = new MostrarDepartamento();
    escritorio.add(verDepartamentos);
    verDepartamentos.show();
    }//GEN-LAST:event_btnDepartamentoActionPerformed

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
    MostrarPuestoTrabajo verPuestoTrabajo = new MostrarPuestoTrabajo();
    escritorio.add(verPuestoTrabajo);
    verPuestoTrabajo.show();
    }//GEN-LAST:event_btnPuestoActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
    MostrarEmpleado verEmpleados = new MostrarEmpleado();
    escritorio.add(verEmpleados);
    verEmpleados.show();
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int opcion;
        opcion= JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJornadaActionPerformed
    MostrarJornadaLaboral verJornadaLaboral = new MostrarJornadaLaboral();
    escritorio.add(verJornadaLaboral);
    verJornadaLaboral.setVisible(true);
    
    
    }//GEN-LAST:event_btnJornadaActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        int opcion;
        opcion= JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        // TODO add your handling code here:
        UserForm mostrarUsuario = new UserForm();
        mostrarUsuario.setVisible(true);
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void mnuCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCascadaActionPerformed
        // TODO add your handling code here: 
        JInternalFrame [] frames = escritorio.getAllFrames();
        GridLayout layout = new GridLayout(frames.length , 1);
        
        if(escritorio.getLayout() != layout){
            escritorio.setLayout(layout);
        }
        else{
            escritorio.setLayout(null);
        }
        
    }//GEN-LAST:event_mnuCascadaActionPerformed

    private void mnuDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDepartamentosActionPerformed
        // TODO add your handling code here:
    MostrarDepartamento verDepartamentos = new MostrarDepartamento();
    escritorio.add(verDepartamentos);
    verDepartamentos.show();
    }//GEN-LAST:event_mnuDepartamentosActionPerformed

    private void mnuPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPuestosActionPerformed
        // TODO add your handling code here:
    MostrarPuestoTrabajo verPuestoTrabajo = new MostrarPuestoTrabajo();
    escritorio.add(verPuestoTrabajo);
    verPuestoTrabajo.show();
    }//GEN-LAST:event_mnuPuestosActionPerformed

    private void mnuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpleadosActionPerformed
        // TODO add your handling code here:
    MostrarEmpleado verEmpleados = new MostrarEmpleado();
    escritorio.add(verEmpleados);
    verEmpleados.show();
    }//GEN-LAST:event_mnuEmpleadosActionPerformed

    private void mnuJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJornadasActionPerformed
        // TODO add your handling code here:
    MostrarJornadaLaboral verJornadaLaboral = new MostrarJornadaLaboral();
    escritorio.add(verJornadaLaboral);
    verJornadaLaboral.setVisible(true);
    }//GEN-LAST:event_mnuJornadasActionPerformed

    private void mnuActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActualActionPerformed
        // TODO add your handling code here:
        JInternalFrame [] frames = escritorio.getAllFrames();
        int ventanaSeleccionada=-1;
        
        for(int i = 0; i < frames.length; i++){
            if(frames[i].isSelected()){
                ventanaSeleccionada = i;
            }
        }
        try {
           frames [ventanaSeleccionada].dispose(); 
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "No hay ninguna ventana abierta");
        }
        
        
    }//GEN-LAST:event_mnuActualActionPerformed

    private void mnuTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTodasActionPerformed
        // TODO add your handling code here:
        JInternalFrame [] frames = escritorio.getAllFrames();
        
        for(int i = 0; i < frames.length; i++){
            if(frames[i].isSelected()){
                frames [i].dispose();
            }
        }
    }//GEN-LAST:event_mnuTodasActionPerformed

    private void mnuParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuParaleloActionPerformed
        // TODO add your handling code here:
        JInternalFrame [] frames = escritorio.getAllFrames();
        GridLayout layout = new GridLayout(1 , frames.length);
        
        if(escritorio.getLayout() != layout){
            escritorio.setLayout(layout);
        }
        else{
            escritorio.setLayout(null);
        }
    }//GEN-LAST:event_mnuParaleloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.put("control", new Color(255,255,255));
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnDepartamento;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnJornada;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenuItem mnuActual;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuCascada;
    private javax.swing.JMenu mnuCerrar;
    private javax.swing.JMenuItem mnuContenido;
    private javax.swing.JMenuItem mnuDepartamentos;
    private javax.swing.JMenuItem mnuEmpleados;
    private javax.swing.JMenuItem mnuJornadas;
    private javax.swing.JMenuItem mnuParalelo;
    private javax.swing.JMenuItem mnuPlanillas;
    private javax.swing.JMenuItem mnuPuestos;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuTodas;
    private javax.swing.JMenuItem mnuUsuario;
    private javax.swing.JMenu mnuVentanaMain;
    // End of variables declaration//GEN-END:variables
}
