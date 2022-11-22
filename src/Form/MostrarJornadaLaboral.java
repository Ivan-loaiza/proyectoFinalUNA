/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import javax.swing.JOptionPane;
import Logic.Jornada;
import Logic.Global;
import java.awt.print.PrinterException;
import java.time.Instant;
import java.util.Date;

public class MostrarJornadaLaboral extends javax.swing.JInternalFrame implements Global{

    /**
     * Creates new form MostrarJornadaLaboral
     */
   
    public MostrarJornadaLaboral() {
        initComponents();
        tblJornadas.setModel(util.generarModeloTabla());
        cboIdEmpleado.setModel(util.generarModeloComboBox());
        cboIdEmpleadoEdit.setModel(util.generarModeloComboBox());
        fechaInicio.setDateFormatString("dd-MM-YYYY");
        fechaInicioEdit.setDateFormatString("dd-MM-YYYY");
        fechaFin.setDateFormatString("dd-MM-YYYY");
        fechaFinEdit.setDateFormatString("dd-MM-YYYY");
    }
    
    
    Object[] filas = new Object[7];
    
    Jornada util = new Jornada();
    
    int fila;
    
    
    
    
    private void LimpiarCampos() {
        txtID.setText("");
        txtHorasEx.setText("");
        txtHoras.setText("");
        fechaInicio.setDate(Date.from(Instant.now()));
        fechaFin.setDate(Date.from(Instant.now()));
        cboIdEmpleado.setSelectedIndex(0);
        
        for(int index=0; index < filas.length ; index++){
            filas [index]  = null;
            }
        
    }
    
     private void SeleccionarRegistro() {
        txtIDEdit.setText(String.valueOf(tblJornadas.getValueAt(fila, 0)));
        txtHorasEdit.setText(String.valueOf(tblJornadas.getValueAt(fila, 1)));
        txtHorasExEdit.setText(String.valueOf(tblJornadas.getValueAt(fila, 2)));
        fechaInicioEdit.setDate(jornadas.get(fila).getFechaInicio());
        fechaFinEdit.setDate(jornadas.get(fila).getFechaFinal());
        
        int idEmpleado = Integer.parseInt(tblJornadas.getValueAt(fila, 6).toString());
        int posicionCombo=0;
          for(int i = 1; i < util.generarModeloComboBox().getSize() ; i++){
              if(Integer.parseInt(util.generarModeloComboBox().getElementAt(i).toString()) == idEmpleado){
              posicionCombo = i;
               }
          }
          
           if(posicionCombo == 0){
              JOptionPane.showMessageDialog(rootPane, "Empleado no encontrado, por favor seleccione otro empleado o elimine la jornada", "Error: Empleado no encontrado", JOptionPane.INFORMATION_MESSAGE);
          }
          cboIdEmpleadoEdit.setModel(util.generarModeloComboBox());
          cboIdEmpleadoEdit.setSelectedIndex(posicionCombo);
    }
    
    
    //Funciones de llenado y comprobación de valores 
     //LLenado 
      private void AgregarPuesto() {
        try {
            if(Jornada.idDisponible(Integer.parseInt(txtID.getText().trim())) == true){
                
            Jornada jornada = new Jornada(Integer.parseInt(txtID.getText().trim()), 
                    Integer.parseInt(txtHoras.getText().trim()),Integer.parseInt(txtHorasEx.getText().trim()), 
                    Integer.parseInt(cboIdEmpleado.getSelectedItem().toString()), 
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
        cboIdEmpleado = new javax.swing.JComboBox<>();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFin = new com.toedter.calendar.JDateChooser();
        btnGuardarDialog = new javax.swing.JButton();
        btnCancelarDialog = new javax.swing.JButton();
        EditForm = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtHorasEdit = new javax.swing.JTextField();
        txtHorasExEdit = new javax.swing.JTextField();
        txtIDEdit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboIdEmpleadoEdit = new javax.swing.JComboBox<>();
        fechaInicioEdit = new com.toedter.calendar.JDateChooser();
        fechaFinEdit = new com.toedter.calendar.JDateChooser();
        btnModificar = new javax.swing.JButton();
        btnCancelarEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJornadas = new javax.swing.JTable();

        SaveForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SaveForm.setTitle("Guardar");

        jLabel1.setText("Horas normales:");

        jLabel2.setText("Horas extras:");

        jLabel3.setText("ID Jornada:");

        jLabel4.setText("Fecha inicio:");

        jLabel5.setText("Fecha fin:");

        jLabel6.setText("ID empleado:");

        cboIdEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una opcion--" }));

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
                    .addComponent(cboIdEmpleado, 0, 281, Short.MAX_VALUE)
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
                    .addComponent(cboIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        EditForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        EditForm.setTitle("Editar");

        jLabel7.setText("Horas normales:");

        jLabel8.setText("Horas extras:");

        jLabel9.setText("ID Jornada:");

        jLabel10.setText("Fecha inicio:");

        jLabel11.setText("Fecha fin:");

        jLabel12.setText("ID empleado:");

        cboIdEmpleadoEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una opcion--" }));

        btnModificar.setText("Modificar..");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelarEdit.setText("Cancelar");
        btnCancelarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHorasExEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHorasEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDEdit)
                    .addComponent(cboIdEmpleadoEdit, 0, 281, Short.MAX_VALUE)
                    .addComponent(fechaInicioEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaFinEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(37, 37, 37)
                .addComponent(btnCancelarEdit)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDEdit)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHorasEdit)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorasExEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(fechaInicioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fechaFinEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboIdEmpleadoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelarEdit))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout EditFormLayout = new javax.swing.GroupLayout(EditForm.getContentPane());
        EditForm.getContentPane().setLayout(EditFormLayout);
        EditFormLayout.setHorizontalGroup(
            EditFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditFormLayout.setVerticalGroup(
            EditFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/printer.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimir);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit_32x32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

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
        if(ExistenDatosValidos() == true && cboIdEmpleado.getSelectedIndex() > 0){
            AgregarPuesto();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", "Error: Datos de tipo incorrecto en los espacios de llenado", JOptionPane.ERROR_MESSAGE);
            if(EsUnNumero() == false){JOptionPane.showMessageDialog(rootPane, "El ID, las horas o las horas extras no son un numero entero, por favor ingrese un numero entero", "Error: Datos no númericos encontrados", JOptionPane.ERROR_MESSAGE);}
            if(cboIdEmpleado.getSelectedIndex() <= 0){JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un ID de Empleado", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }
            LimpiarCampos();
            util.guardarEnArchivo();
            tblJornadas.setModel(util.generarModeloTabla());
    
    }//GEN-LAST:event_btnGuardarDialogActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tblJornadas.setModel(util.generarModeloTabla());
        cboIdEmpleado.setModel(util.generarModeloComboBox());
        cboIdEmpleadoEdit.setModel(util.generarModeloComboBox());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
         if((cboIdEmpleadoEdit.getSelectedIndex() > 0) && (ExistenDatosValidosEdit() == true)){
            util.editarJornada(Integer.parseInt(txtHorasEdit.getText().trim()),Integer.parseInt(txtHorasExEdit.getText().trim()), Integer.parseInt(cboIdEmpleadoEdit.getSelectedItem().toString()), fechaInicioEdit.getDate(), fechaFinEdit.getDate() , fila);
            tblJornadas.setModel(util.generarModeloTabla());
            util.guardarEnArchivo();
        }
        else{
            if(!ExistenDatosValidosEdit()){JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", "Error: Datos de tipo incorrecto en los espacios de llenado", JOptionPane.ERROR_MESSAGE);}
            if(EsUnNumeroEdit()== false){JOptionPane.showMessageDialog(rootPane, "Las horas o las horas extras no son un numero entero, por favor ingrese un numero entero", "Error: Datos no númericos encontrados", JOptionPane.ERROR_MESSAGE);}
            if(cboIdEmpleadoEdit.getSelectedIndex() <= 0){JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un ID de Empleado", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditActionPerformed
        // TODO add your handling code here:
        this.EditForm.dispose();
    }//GEN-LAST:event_btnCancelarEditActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            fila = tblJornadas.getSelectedRow();
            txtIDEdit.setEnabled(false);
            SeleccionarRegistro();

            EditForm.pack();
            EditForm.setResizable(false);
            EditForm.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
           if (tblJornadas.getSelectedRow() >= 0) {
            fila = tblJornadas.getSelectedRow();
            int resp = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea eliminar la fila " + (fila + 1) + " ?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                Jornada jornada = jornadas.get(fila);
                util.removerJornada(jornada);
                tblJornadas.setModel(util.generarModeloTabla());
                util.guardarEnArchivo();
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a editar", "Error: Fila no seleccionada", JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        try {
            tblJornadas.print();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(rootPane, ("No se pudo imprimir. Error: " + e ), "Error al imprimir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog EditForm;
    private javax.swing.JDialog SaveForm;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarDialog;
    private javax.swing.JButton btnCancelarEdit;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarDialog;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboIdEmpleado;
    private javax.swing.JComboBox<String> cboIdEmpleadoEdit;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaFinEdit;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private com.toedter.calendar.JDateChooser fechaInicioEdit;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblJornadas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtHorasEdit;
    private javax.swing.JTextField txtHorasEx;
    private javax.swing.JTextField txtHorasExEdit;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEdit;
    // End of variables declaration//GEN-END:variables
}
