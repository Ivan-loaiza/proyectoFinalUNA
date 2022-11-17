/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import javax.swing.JOptionPane;
import Logic.Jornada;
import Logic.Global;
import java.time.Instant;
import java.util.Date;

public class MostrarJornadaLaboral extends javax.swing.JInternalFrame implements Global{

    /**
     * Creates new form MostrarJornadaLaboral
     */
    
    public MostrarJornadaLaboral() {
        initComponents();
        
    }
    
    Object[] filas = new Object[7];
    
    Jornada util = new Jornada();
    
    int fila;
    
    //########################################################
   
    //########################################################
    
    
    
    
    
    private void LimpiarCampos() {
        txtID.setText("");
        txtHorasEx.setText("");
        txtHoras.setText("");
        fechaInicio.setDate(Date.from(Instant.now()));
        fechaFin.setDate(Date.from(Instant.now()));
        cbkEmpleado.setSelectedIndex(0);
        
        for(int index=0; index < filas.length ; index++){
            filas [index]  = null;
            }
        
    }
    
   /* private void SeleccionarRegistro() {
        txtID.setText(String.valueOf(tblJornadas.getValueAt(fila, 0)));
        txtHoras.setText(String.valueOf(tblJornadas.getValueAt(fila, 1)));
        txtHorasEx.setText(String.valueOf(tblJornadas.getValueAt(fila, 2)));
        cbkEmpleado.setModel(String.valueOf(tblJornadas.getValueAt(fila, 3)));
    }*/
    
    
    //Funciones de llenado y comprobación de valores 
     //LLenado 
      private void AgregarPuesto() {
        try {
            if(Jornada.idDisponible(Integer.parseInt(txtID.getText().trim())) == true){
                
            Jornada jornada = new Jornada(Integer.parseInt(txtID.getText().trim()), 
                    Integer.parseInt(txtHoras.getText().trim()),Integer.parseInt(txtHorasEx.getText().trim()), 
                    Integer.parseInt(cbkEmpleado.getSelectedItem().toString()), 
                    fechaInicio.getDate(), fechaFin.getDate());
            
            }
            else{
               JOptionPane.showMessageDialog(rootPane, "Por digite otro ID. ID ocupado por otra Jornada"); 
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());   
        } 
    }
    
      
      private boolean ExistenDatosValidos(){
         if(txtID.getText().isBlank() == false 
                 && txtHoras.getText().isBlank() == false 
                 && txtHorasEx.getText().isBlank() == false){
             if(EsUnNumero()==true){
             return true;}
         }
         return false;
     }
     
     private boolean ExistenDatosValidosEdit(){
         if(txtHoras.getText().isBlank() == false 
                 && txtHorasEx.getText().isBlank() == false){
             if(EsUnNumeroEdit()==true){
             return true;}
         }
         return false;
     }
     
     private boolean EsUnNumero(){
             try {
                 int unNumero = Integer.parseInt(txtID.getText().trim());
                 unNumero = Integer.parseInt(txtHoras.getText().trim());
                 unNumero = Integer.parseInt(txtHorasEx.getText().trim());
                 return true;
                 } catch (NumberFormatException e) {
                 return false;
                 }
     }
     
     private boolean EsUnNumeroEdit(){
             try {
                 int unNumero =  Integer.parseInt(txtHoras.getText().trim());
                 unNumero = Integer.parseInt(txtHorasEx.getText().trim());
                 return true;
                 } catch (NumberFormatException e) {
                 return false;
                 }
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaveForm = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtHoras = new javax.swing.JTextField();
        txtHorasEx = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbkEmpleado = new javax.swing.JComboBox<>();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFin = new com.toedter.calendar.JDateChooser();
        btnGuardarDialog = new javax.swing.JButton();
        btnCancelarDialog = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJornadas = new javax.swing.JTable();

        SaveForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SaveForm.setAlwaysOnTop(true);

        jLabel1.setText("Horas normales:");

        jLabel2.setText("Horas extras:");

        jLabel3.setText("ID Jornada:");

        jLabel4.setText("Fecha inicio:");

        jLabel5.setText("Fecha fin:");

        jLabel6.setText("ID empleado:");

        cbkEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una opcion--" }));

        btnGuardarDialog.setText("Guardar");
        btnGuardarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDialogActionPerformed(evt);
            }
        });

        btnCancelarDialog.setText("Cancelar");
        btnCancelarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHorasEx, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHoras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID)
                    .addComponent(cbkEmpleado, 0, 281, Short.MAX_VALUE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarDialog)
                .addGap(37, 37, 37)
                .addComponent(btnCancelarDialog)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoras)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorasEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbkEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDialog)
                    .addComponent(btnCancelarDialog))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout SaveFormLayout = new javax.swing.GroupLayout(SaveForm.getContentPane());
        SaveForm.getContentPane().setLayout(SaveFormLayout);
        SaveFormLayout.setHorizontalGroup(
            SaveFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SaveFormLayout.setVerticalGroup(
            SaveFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Jornada Laboral");

        jToolBar1.setRollover(true);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEditar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/printer.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnImprimir);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit_32x32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSalir);

        tblJornadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblJornadas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        SaveForm.setResizable(false);
        SaveForm.pack();
        SaveForm.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDialogActionPerformed
        // TODO add your handling code here:
        this.SaveForm.dispose();
    }//GEN-LAST:event_btnCancelarDialogActionPerformed

    private void btnGuardarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDialogActionPerformed
        // TODO add your handling code here:
        if(ExistenDatosValidos() == true && cbkEmpleado.getSelectedIndex() > 0){
            AgregarPuesto();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", null, JOptionPane.WARNING_MESSAGE);
            if(EsUnNumero() == false){JOptionPane.showMessageDialog(rootPane, "El ID o el salario no son un numero entero, por favor ingrese un numero entero", null, JOptionPane.WARNING_MESSAGE);}
            if(cbkEmpleado.getSelectedIndex() <= 0){JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un ID de departamento", null, JOptionPane.WARNING_MESSAGE);}
        }
            LimpiarCampos();
            util.guardarEnArchivo();
            tblJornadas.setModel(util.generarModeloTabla());
    
    }//GEN-LAST:event_btnGuardarDialogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SaveForm;
    private javax.swing.JButton btnCancelarDialog;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarDialog;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbkEmpleado;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblJornadas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtHorasEx;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
