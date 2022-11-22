

package Form;

import Logic.Puesto;
import Logic.Global;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanl
 */
public class MostrarPuestoTrabajo extends javax.swing.JInternalFrame implements Global{

    public MostrarPuestoTrabajo() {
        initComponents();
        tblPuestos.setModel(util.generarModeloTabla());
        cboIdDepartamento.setModel(util.generarModeloComboBox());
        cboIdDepartamentoEditar.setModel(util.generarModeloComboBox());
        
    }

    Puesto util = new Puesto();
    int fila;
     
     //Se resetean los campos
     private void LimpiarCampos() {
        txtID.setText("");
        txtNombrePuesto.setText("");
        txtSalario.setText("");
        cboIdDepartamento.setSelectedIndex(0);
    }
     
     //Funciones de llenado y comprobación de valores 
     //LLenado 
      private void AgregarPuesto() {
        try {
            if(Puesto.idDisponible(Integer.parseInt(txtID.getText().trim())) == true){
                
            Puesto puesto = new Puesto(Integer.parseInt(txtID.getText().trim()), 
                    txtNombrePuesto.getText().trim() , 
                    Integer.parseInt(txtSalario.getText().trim()), 
                    Integer.parseInt(cboIdDepartamento.getSelectedItem().toString()));
            
            }
            else{
               JOptionPane.showMessageDialog(rootPane, "Por digite otro ID. ID ocupado por otro puesto"); 
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());   
        } 
    }
      
     private void seleccionarDatos(){
          txtIdPuestoEditar.setText(tblPuestos.getValueAt(fila, 0).toString());
          txtNombreEditar.setText(tblPuestos.getValueAt(fila, 1).toString());
          txtSalarioEditar.setText(tblPuestos.getValueAt(fila, 2).toString());
          
          int IdDepartamentoTabla = Integer.parseInt(tblPuestos.getValueAt(fila, 3).toString());
          int posicionCombo=0;
          for(int i = 1; i < util.generarModeloComboBox().getSize() ; i++){
              if(Integer.parseInt(util.generarModeloComboBox().getElementAt(i).toString()) == IdDepartamentoTabla){
              posicionCombo = i;
               }
          }
          if(posicionCombo == 0){
              JOptionPane.showMessageDialog(rootPane, "Departamento no encontrado, por favor seleccione otro departamento o elimine el puesto", "Error: Departamento no encontrado", JOptionPane.INFORMATION_MESSAGE);
          }
          cboIdDepartamentoEditar.setModel(util.generarModeloComboBox());
          cboIdDepartamentoEditar.setSelectedIndex(posicionCombo);
      
     }
    
      //Comprueba que los datos en los campos sean validos
     private boolean ExistenDatosValidos(){
         if(txtID.getText().isBlank() == false 
                 && txtNombrePuesto.getText().isBlank() == false 
                 && txtSalario.getText().isBlank() == false){
             if(EsUnNumero()==true){
             return true;}
         }
         return false;
     }
     
     private boolean ExistenDatosValidosEdit(){
         if( txtNombreEditar.getText().isBlank() == false 
                 && txtSalarioEditar.getText().isBlank() == false){
             if(EsUnNumeroEdit()==true){
             return true;}
         }
         return false;
     }
     
     //Se asegura que el string ingresa en el TXTID es un numero
     private boolean EsUnNumero(){
             try {
                 int unNumero = Integer.parseInt(txtID.getText().trim());
                 unNumero = Integer.parseInt(txtSalario.getText().trim());
                 return true;
                 } catch (NumberFormatException e) {
                 return false;
                 }
     }
     
     private boolean EsUnNumeroEdit(){
             try {
                 int unNumero =  Integer.parseInt(txtSalarioEditar.getText().trim());
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
        txtNombrePuesto = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardarSaveForm = new javax.swing.JButton();
        btnCancelarSaveForm = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboIdDepartamento = new javax.swing.JComboBox<>();
        EditForm = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtNombreEditar = new javax.swing.JTextField();
        txtIdPuestoEditar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModificarEditForm = new javax.swing.JButton();
        btnCancelarEditForm = new javax.swing.JButton();
        txtSalarioEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboIdDepartamentoEditar = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPuestos = new javax.swing.JTable();

        SaveForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SaveForm.setTitle("Guardar");
        SaveForm.setResizable(false);

        jLabel1.setText("Nombre de Puesto:");

        jLabel3.setText("ID Puesto");

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

        jLabel5.setText("Salario hora:");

        jLabel6.setText("ID Departamento:");

        cboIdDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrePuesto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtID)
                    .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboIdDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtNombrePuesto)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSalario)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIdDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txtIdPuestoEditar.setEditable(false);

        jLabel2.setText("Nombre Puesto");

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

        jLabel7.setText("Salario hora:");

        jLabel8.setText("ID Departamento:");

        cboIdDepartamentoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdPuestoEditar)
                    .addComponent(txtSalarioEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboIdDepartamentoEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtIdPuestoEditar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreEditar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSalarioEditar)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIdDepartamentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
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
        setTitle("Puesto de trabajo");

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPuestos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            fila = tblPuestos.getSelectedRow();
            txtIdPuestoEditar.setEnabled(false);
            seleccionarDatos();

            EditForm.pack();
            EditForm.setResizable(false);
            EditForm.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(tblPuestos.getSelectedRow() >= 0){
            fila = tblPuestos.getSelectedRow();
            int resp = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea eliminar la fila " + (fila+1) + " ?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           
            if(resp == JOptionPane.YES_OPTION){
                Puesto puesto = puestos.get(fila);
                util.removerPuesto(puesto);
                tblPuestos.setModel(util.generarModeloTabla());
                util.guardarEnArchivo();
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una fila a eliminar","Error: Fila no seleccionada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btnGuardarSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSaveFormActionPerformed
        // TODO add your handling code here:
        if(ExistenDatosValidos() == true && cboIdDepartamento.getSelectedIndex() > 0){
            AgregarPuesto();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", "Error: Datos de tipo incorrecto en los espacios de llenado", JOptionPane.ERROR_MESSAGE);
            if(EsUnNumero() == false){JOptionPane.showMessageDialog(rootPane, "El ID o el salario no son un numero entero, por favor ingrese un numero entero", "Error: Datos no númericos encontrados", JOptionPane.ERROR_MESSAGE);}
            if(cboIdDepartamento.getSelectedIndex() <= 0){JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un ID de departamento", "Advertencia", JOptionPane.WARNING_MESSAGE);}
        }
            LimpiarCampos();
            util.guardarEnArchivo();
            tblPuestos.setModel(util.generarModeloTabla());
    }//GEN-LAST:event_btnGuardarSaveFormActionPerformed

    private void btnCancelarSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSaveFormActionPerformed
        // TODO add your handling code here:
        this.SaveForm.dispose();
    }//GEN-LAST:event_btnCancelarSaveFormActionPerformed

    private void btnModificarEditFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEditFormActionPerformed
        // TODO add your handling code here:
        if((cboIdDepartamentoEditar.getSelectedIndex() > 0) && (ExistenDatosValidosEdit() == true)){
            util.editarPuesto(txtNombreEditar.getText(), Integer.parseInt(txtSalarioEditar.getText().trim()), Integer.parseInt(cboIdDepartamentoEditar.getSelectedItem().toString().trim()) , fila);
            tblPuestos.setModel(util.generarModeloTabla());
            util.guardarEnArchivo();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese datos validos", "Error: Datos de tipo incorrecto en los espacios de llenado", JOptionPane.ERROR_MESSAGE);
            if(EsUnNumeroEdit()== false){JOptionPane.showMessageDialog(rootPane, "El ID o el salario no son un numero entero, por favor ingrese un numero entero", "Error: Datos no númericos encontrados", JOptionPane.ERROR_MESSAGE);}
            if(cboIdDepartamentoEditar.getSelectedIndex() <= 0){JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un ID de departamento", "Advertencia", JOptionPane.WARNING_MESSAGE);}
       
        }
      
    }//GEN-LAST:event_btnModificarEditFormActionPerformed

    private void btnCancelarEditFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditFormActionPerformed
        // TODO add your handling code here:
        this.EditForm.dispose();
    }//GEN-LAST:event_btnCancelarEditFormActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tblPuestos.setModel(util.generarModeloTabla());
        cboIdDepartamento.setModel(util.generarModeloComboBox());
        cboIdDepartamentoEditar.setModel(util.generarModeloComboBox());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        try {
            tblPuestos.print();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(rootPane, ("No se pudo imprimir. Error: " + e ), "Error al imprimir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed


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
    private javax.swing.JComboBox<String> cboIdDepartamento;
    private javax.swing.JComboBox<String> cboIdDepartamentoEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblPuestos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdPuestoEditar;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombrePuesto;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalarioEditar;
    // End of variables declaration//GEN-END:variables
}
