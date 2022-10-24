/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Juan
 */

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Departamento {
    
    
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
    
    FileManager util = new FileManager();
    
    public static ArrayList<Departamento> departamentos = new ArrayList<>();
    
    public void cargarDepartamentos (DefaultTableModel ModeloTabla){
        
        util.LeerTablaArchivo(2, "Departamentos.dat", ModeloTabla);
        
        for(int index=0; index < ModeloTabla.getRowCount(); index++){
            
            Departamento D1= new Departamento(Integer.parseInt(ModeloTabla.getValueAt(index, 0).toString()), ModeloTabla.getValueAt(index, 1).toString());
            departamentos.add(D1);
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
    
    public static Departamento getDepartamento(int id) {
        int len = departamentos.size();
        
        for (int i = 0; i < len; i++) {
            if (departamentos.get(i).getId() == id) {
                return departamentos.get(i);
            }
        }
        
        return null;
    }
    
}
