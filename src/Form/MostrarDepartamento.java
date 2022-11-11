/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


package Form;

import javax.swing.JOptionPane;
import Logic.Departamento;
import Logic.Global;


public class MostrarDepartamento extends javax.swing.JInternalFrame implements Global {

    public MostrarDepartamento() {
        initComponents();
        util.recuperarDeArchivo();
        tblDepartamentos.setModel(util.generarModeloTabla());
    }
    
    //Se declaran las variables a utilizar
    Object[] filas = new Object[2];
    
    Departamento util = new Departamento();
    
    int fila;
    
    //Funcion de carga de tabla
     
     //Se resetean los campos
     private void LimpiarCampos() {
        txtID.setText("");
        txtNombreDepartamento.setText("");
        
        for(int index=0; index < filas.length ; index++){
            filas [index]  = null;
            }
    }
     
     //Funciones de llenado y comprobación de valores 
     //LLenado 
      private void AgregarDepartamento() {
            if(Departamento.idDisponible(Integer.parseInt(txtID.getText().trim())) == true){
            Departamento departamento = new Departamento(Integer.parseInt(txtID.getText().trim()), txtNombreDepartamento.getText().trim());
            
            }
            else{
               JOptionPane.showMessageDialog(rootPane, "Por digite otro ID. ID ocupado por otro puesto"); 
            }
    }
      
     private void seleccionarDatos(){
          txtIdDepartamento.setText(tblDepartamentos.getValueAt(fila, 0).toString());
          txtNombreEditar.setText(tblDepartamentos.getValueAt(fila, 1).toString());
     }
    
      //Comprueba que los datos en los campos sean validos
     private boolean ExistenDatosValidos(){
         if(txtID.getText().isBlank() == false && txtNombreDepartamento.getText().isBlank() == false){
             if(EsUnNumero()==true){
             return true;}
         }
         return false;
     }
     
     //Comprueba que los datos en los campos sean validos
     private boolean ExistenDatosValidosEdit(){
         if(txtNombreEditar.getText().isBlank() == false){
             return true;
         }
         return false;
     }
     
     //Se asegura que el string ingresa en el TXTID es un numero
     private boolean EsUnNumero(){
             try {
                 int unNumero = Integer.parseInt(txtID.getText().trim());
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
        txtNombreDepartamento = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardarSaveForm = new javax.swing.JButton();
        btnCancelarSaveForm = new javax.swing.JButton();
        EditForm = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtNombreEditar = new javax.swing.JTextField();
        txtIdDepartamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModificarEditForm = new javax.swing.JButton();
        btnCancelarEditForm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();

        SaveForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SaveForm.setTitle("Guardar");
        SaveForm.setResizable(false);

        jLabel1.setText("Nombre departamento:");

        jLabel3.setText("ID Departamento:");

        btnGuardarSaveForm.setText("Guardar");
        btnGuardarSaveForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSaveFormActionPerformed(evt);
            }
        });

        btnCancelarSaveForm.setText("Cancelar");
        btnCancelarSaveForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSaveFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreDepartamento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(btnGuardarSaveForm)
                .addGap(37, 37, 37)
                .addComponent(btnCancelarSaveForm)
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
                    .addComponent(txtNombreDepartamento)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSaveForm)
                    .addComponent(btnCancelarSaveForm))
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

        txtIdDepartamento.setEditable(false);

        jLabel2.setText("Nombre departamento:");

        jLabel4.setText("ID Departamento:");

        btnModificarEditForm.setText("Modificar...");
        btnModificarEditForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEditFormActionPerformed(evt);
            }
        });

        btnCancelarEditForm.setText("Cancelar");
        btnCancelarEditForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdDepartamento))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(btnModificarEditForm)
                .addGap(37, 37, 37)
                .addComponent(btnCancelarEditForm)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdDepartamento)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreEditar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarEditForm)
                    .addComponent(btnCancelarEditForm))
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
        setTitle("Departamento");

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        SaveForm.pack();
        SaveForm.setVisible(true);
        SaveForm.setResizable(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSaveFormActionPerformed
        // TODO add your handling code here:
        if(ExistenDatosValidos() == true){
            AgregarDepartamento();        
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", null, JOptionPane.WARNING_MESSAGE);
            if(EsUnNumero() == false){JOptionPane.showMessageDialog(rootPane, "El ID no es un numero entero, por favor ingrese un numero entero", null, JOptionPane.WARNING_MESSAGE);}
        }
        LimpiarCampos();
        util.guardarEnArchivo();
        tblDepartamentos.setModel(util.generarModeloTabla());
    }//GEN-LAST:event_btnGuardarSaveFormActionPerformed

    private void btnCancelarSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSaveFormActionPerformed
        // TODO add your handling code here:
        this.SaveForm.dispose();
    }//GEN-LAST:event_btnCancelarSaveFormActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            fila = tblDepartamentos.getSelectedRow();
            int resp = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea eliminar la fila " + (fila+1) + " ?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           
            if(resp == JOptionPane.YES_OPTION){
                Departamento departamento = departamentos.get(fila);
                util.removerDepartamento(departamento);
                tblDepartamentos.setModel(util.generarModeloTabla());
                util.guardarEnArchivo();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a editar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarEditFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEditFormActionPerformed
        // TODO add your handling code here:
        if(ExistenDatosValidosEdit() == true){
            util.editarDepartamento(txtNombreEditar.getText(), fila);
            tblDepartamentos.setModel(util.generarModeloTabla());
            util.guardarEnArchivo();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", null, JOptionPane.WARNING_MESSAGE);   
        }
    }//GEN-LAST:event_btnModificarEditFormActionPerformed

    private void btnCancelarEditFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditFormActionPerformed
        // TODO add your handling code here:
        this.EditForm.dispose();
    }//GEN-LAST:event_btnCancelarEditFormActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            fila = tblDepartamentos.getSelectedRow();
            txtIdDepartamento.setEnabled(false);
            seleccionarDatos();
            
            EditForm.pack();
            EditForm.setResizable(false);
            EditForm.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tblDepartamentos.setModel(util.generarModeloTabla());
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog EditForm;
    private javax.swing.JDialog SaveForm;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarEditForm;
    private javax.swing.JButton btnCancelarSaveForm;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarSaveForm;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificarEditForm;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdDepartamento;
    private javax.swing.JTextField txtNombreDepartamento;
    private javax.swing.JTextField txtNombreEditar;
    // End of variables declaration//GEN-END:variables
}
