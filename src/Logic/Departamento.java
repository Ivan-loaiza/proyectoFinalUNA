/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Departamento implements Serializable, Global{
    
    
    private int id;
    private String nombre;

    public Departamento() {
    }
    
    
    public Departamento(int id, String nombre) {
            
        this.id = id;
        this.nombre = nombre;
        
        departamentos.add(this);
    }
    
    //#######################################################################
    
    public static String ruta = System.getProperty("user.dir") + "\\src\\Data\\Departamentos.dat";
    DefaultTableModel modeloTablaDepartamentos = new DefaultTableModel();
    
    public void removerDepartamento(Departamento D1){
        
        for(int index=0 ; index <departamentos.size(); index++){
            if(departamentos.get(index) == D1)
            departamentos.remove(D1);
        }
        
    }
    
    public void editarDepartamento(String nuevoNombre , int index){
        Departamento D1 = new Departamento(departamentos.get(index).getId(), nuevoNombre);
        departamentos.set (index, D1);
        departamentos.remove(departamentos.size()-1);
    }
    
      public DefaultTableModel generarModeloTabla(){
         Object [] filas = new Object[2];
         
         
         modeloTablaDepartamentos = new DefaultTableModel();
         
         modeloTablaDepartamentos.addColumn("ID Departamento"); 
         modeloTablaDepartamentos.addColumn("Nombre");
         
         for(Departamento departamento : departamentos){
             
            filas[0] = "" + departamento.getId();
            filas[1] = departamento.getNombre();
             
            modeloTablaDepartamentos.addRow(filas);
            
         }
         
         //Se limpian las filas con información basura
         for(int i = 0 ; i < modeloTablaDepartamentos.getRowCount() ; i++){
             if(modeloTablaDepartamentos.getValueAt(i, 0).toString().equals("0") == true ){
                 modeloTablaDepartamentos.removeRow(i);
             }
         }
         
         return modeloTablaDepartamentos;
     }
    
    public void guardarEnArchivo() {
        String archivo = "Departamentos.dat";
            try {
                
                ObjectOutputStream ficheroSalida = new ObjectOutputStream( new FileOutputStream(new File(ruta)));
                ficheroSalida.writeObject(departamentos);
                ficheroSalida.flush();
                ficheroSalida.close();
                
                
                System.out.println("Datos de guardados correctamente en " + archivo + ".");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error: El fichero " + archivo + " no existe. ");
            } catch (IOException ioe) {
                System.out.println("Error: Fallo la escritura en el fichero" + archivo + ". ");
            }
    }
    
     public void recuperarDeArchivo() {
        try {
            File fichero = new File(ruta);
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Departamento> temporal = (ArrayList<Departamento>) ficheroEntrada.readObject();
                departamentos.clear();
                departamentos.addAll(temporal);
                ficheroEntrada.close();
                
                for(Departamento departamento : departamentos){
                    System.out.print(departamento.id + " / ");
                }
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
     }
    
    public static boolean existeDepartamento(int id) {
        
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Departamento.existeDepartamento(id);
    }
    
    //######################################################################
    
    public int getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Departamento getDepartamento(int index){
        return departamentos.get(index);
    }
    
    
    
    public void Eliminar() {
        Vector<Puesto> puestos = Puesto.PuestosDeDepartamento(this.id);
        
        for (Puesto puesto: puestos) {
            puesto.Eliminar();
        }
        
        Departamento.departamentos.remove(this);
    }
    
}
