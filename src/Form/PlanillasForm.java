/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Logic.Empleado;
import static Logic.Global.empleados;
import static Logic.Global.puestos;
import Logic.Jornada;
import Logic.Puesto;
import Logic.Global;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class PlanillasForm extends javax.swing.JFrame implements Global{

    /**
     * Creates new form PlanillasForm
     */
    public PlanillasForm() {
        initComponents();
        
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/dinero.png"));
        this.setIconImage(icon.getImage());
        
        
        contadorRefresh();
        generarModeloTabla(-1);
        tblJornadas.setModel(modeloTablaJornadas);
        
    }

     DefaultTableModel modeloTablaJornadas = new DefaultTableModel();
     double sumaSalario;
    
    
       private void contadorRefresh(){
        conteo.setText("Total: "+tblJornadas.getRowCount());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJornadas = new javax.swing.JTable();
        conteo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        moduloBusqueda = new javax.swing.JPanel();
        cboOpcion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarFecha = new javax.swing.JButton();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de planillas: por jornadas");

        tblJornadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblJornadas);

        conteo.setText("Total: ");

        cboOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMPLEADO", "PUESTO" }));
        cboOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOpcionActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout moduloBusquedaLayout = new javax.swing.GroupLayout(moduloBusqueda);
        moduloBusqueda.setLayout(moduloBusquedaLayout);
        moduloBusquedaLayout.setHorizontalGroup(
            moduloBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        moduloBusquedaLayout.setVerticalGroup(
            moduloBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moduloBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moduloBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(cboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Busqueda por  empleado y puesto", moduloBusqueda);

        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("hasta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Desde");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFecha))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Busqueda por fecha", jPanel2);

        lblTotal.setText("Total gastos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conteo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conteo)
                    .addComponent(lblTotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboOpcionActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        tblJornadas.setModel(generarModeloTabla(cboOpcion.getSelectedIndex()));
        contadorRefresh();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        // TODO add your handling code here:
        tblJornadas.setModel(generarModeloTablaFechas());
        contadorRefresh();
        for(int i=0; i< tblJornadas.getRowCount(); i++){
            sumaSalario += Double.parseDouble(tblJornadas.getValueAt(i, 3).toString());
        }
        lblTotal.setText("Total gastos: " + sumaSalario);
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanillasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanillasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanillasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanillasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanillasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JComboBox<String> cboOpcion;
    private javax.swing.JLabel conteo;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel moduloBusqueda;
    private javax.swing.JTable tblJornadas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

 public DefaultTableModel generarModeloTabla(int index){
         Object [] filas = new Object[3];
         
         modeloTablaJornadas = new DefaultTableModel();
         modeloTablaJornadas.addColumn("Identificacion"); 
         modeloTablaJornadas.addColumn("Nombre");
         modeloTablaJornadas.addColumn("Cargo");
         
        switch (index) {
            
            
          case 0:
              for (Empleado autoridad : empleados) {
                  String idString = String.valueOf(autoridad.getId());
                  if(idString.startsWith(txtBuscar.getText().trim())){
                  filas[0] = autoridad.getId();
                  filas[1] = autoridad.getNombre() ;
                  filas[2] = autoridad.getCorreo();

                  modeloTablaJornadas.addRow(filas);
                  }
              }

              //Se limpian las filas con información basura
              for (int i = 0; i < modeloTablaJornadas.getRowCount(); i++) {
                  if (modeloTablaJornadas.getValueAt(i, 0).toString().equals("0") == true) {
                      modeloTablaJornadas.removeRow(i);
                  }
              }

              return modeloTablaJornadas;
          case 1:
              for (Puesto autoridad : puestos) {
                  
                  if(autoridad.getNombre().startsWith(txtBuscar.getText().trim().toLowerCase())){
                  filas[0] = autoridad.getId();
                  filas[1] = autoridad.getNombre();
                  filas[2] = autoridad.getSalario();

                  modeloTablaJornadas.addRow(filas);
                  }
              }

              //Se limpian las filas con información basura
              for (int i = 0; i < modeloTablaJornadas.getRowCount(); i++) {
                  if (modeloTablaJornadas.getValueAt(i, 0).toString().equals("0") == true) {
                      modeloTablaJornadas.removeRow(i);
                  }
              }

              return modeloTablaJornadas;

      }

     return modeloTablaJornadas;    
}
 
 
public DefaultTableModel generarModeloTablaFechas(){
     Object [] filas = new Object[7];
    
    modeloTablaJornadas = new DefaultTableModel();
    modeloTablaJornadas.addColumn("ID Jornada");
    modeloTablaJornadas.addColumn("Horas normales");
    modeloTablaJornadas.addColumn("Horas extras");
    modeloTablaJornadas.addColumn("Salario bruto");
    modeloTablaJornadas.addColumn("Fecha inicio");
    modeloTablaJornadas.addColumn("Fecha fin");
    modeloTablaJornadas.addColumn("ID Empleado");
    
     double distanciaFechas = fecha2.getDate().getTime() -fecha1.getDate().getTime();
              
             for (Jornada jornada : jornadas) {
        if ((distanciaFechas - jornada.distanciaEntreFechas()) >= 0) {
            String fechaini = jornada.getFechaInicio().toLocaleString();
            String fechafin = jornada.getFechaFinal().toLocaleString();

            filas[0] = "" + jornada.getIdJornada();
            filas[1] = jornada.getHorasNormales();
            filas[2] = jornada.getHorasExtras();
            filas[3] = jornada.calcularSalarioBruto();
            filas[4] = fechaini;
            filas[5] = fechafin;
            filas[6] = jornada.getIdEmpleado();

            modeloTablaJornadas.addRow(filas);

        }
             }
         
         //Se limpian las filas con información basura
         for(int i = 0 ; i < modeloTablaJornadas.getRowCount() ; i++){
             if(modeloTablaJornadas.getValueAt(i, 0).toString().equals("0") == true ){
                 modeloTablaJornadas.removeRow(i);
             }
         }
    
    
    
    return modeloTablaJornadas;

}
}