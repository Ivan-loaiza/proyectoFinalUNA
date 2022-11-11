/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Juan
 */

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
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Puesto implements Global, Serializable {
    private int id;
    private String nombre;
    private int salario;
    private int idDepartamento;

    public Puesto() {
    }
    
    public Puesto(int id, String nombre, int salario, int idDepartamento){
        
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.idDepartamento = idDepartamento;
        
        puestos.add(this);   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }


    public static ArrayList<Puesto> getPuestos() {
        return puestos;
    }
    
    //######################################################
    
     public static String ruta = System.getProperty("user.dir") + "\\src\\Data\\Puestos.dat";
     DefaultTableModel modeloTablaPuestos = new DefaultTableModel();
     DefaultComboBoxModel modeloComboBoxDepartamentos = new  DefaultComboBoxModel();
    
    public void removerPuesto(Puesto P1){
        
        for(int index=0 ; index < puestos.size(); index++){
            if(puestos.get(index) == P1)
            puestos.remove(P1);
        }
    }
    
    public void editarPuesto(String nuevoNombre, int nuevoSalario, int nuevoIdDepartamento, int index){
        Puesto P1 = new Puesto(puestos.get(index).getId() , nuevoNombre, nuevoSalario, nuevoIdDepartamento);
        puestos.set(index, P1);
        puestos.remove(puestos.size()-1);
    }
    
     public DefaultTableModel generarModeloTabla(){
         Object [] filas = new Object[4];
         
         modeloTablaPuestos = new DefaultTableModel();
         modeloTablaPuestos.addColumn("ID Puesto"); 
         modeloTablaPuestos.addColumn("Nombre Puesto");
         modeloTablaPuestos.addColumn("Salario hora");
         modeloTablaPuestos.addColumn("ID Departamento");
         
         for(Puesto puesto : puestos){
            filas[0] = "" + puesto.getId();
            filas[1] = puesto.getNombre();
            filas[2] = puesto.getSalario();
            filas[3] = puesto.getIdDepartamento();
             
            modeloTablaPuestos.addRow(filas);
         }
         
         //Se limpian las filas con información basura
         for(int i = 0 ; i < modeloTablaPuestos.getRowCount() ; i++){
             if(modeloTablaPuestos.getValueAt(i, 0).toString().equals("0") == true ){
                 modeloTablaPuestos.removeRow(i);
             }
         }
         
         return modeloTablaPuestos;
     }
     
    public DefaultComboBoxModel generarModeloComboBox(){
        modeloComboBoxDepartamentos = new DefaultComboBoxModel();
        modeloComboBoxDepartamentos.addElement("--Seleccione una opcion--");
        for(Departamento departamento : departamentos){
            modeloComboBoxDepartamentos.addElement(departamento.getId());
        }
        
        return modeloComboBoxDepartamentos;
    }
    
    public void guardarEnArchivo() {
        String archivo = "Puestos.dat";
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(ruta)));
                ficheroSalida.writeObject(puestos);
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
                ArrayList<Puesto> temporal = (ArrayList<Puesto>) ficheroEntrada.readObject();
                puestos.clear();
                puestos.addAll(temporal);
                ficheroEntrada.close();
                
                
                
                for(Puesto puesto : puestos){
                    System.out.print(puesto.salario + " / ");
                }
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
     }
    
    public static boolean existePuesto(int id) {
        
        for (int i = 0; i < puestos.size(); i++) {
            if (puestos.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Puesto.existePuesto(id);
    }
    
    //###################################################################
    
    
    public static Puesto GetPuesto(int id) {
        int len = puestos.size();
        
        for (int i = 0; i < len; i++) {
            if (puestos.get(i).getId() == id) {
                return puestos.get(i);
            }
        }
    
        return null;
    }
   
    public void Eliminar() {
        
    }
    
    public static Vector<Puesto> PuestosDeDepartamento(int idDepartamento) {
        Vector<Puesto> resultado = new Vector<>();
        
        for (Puesto puesto: puestos) {
            if (puesto.idDepartamento == idDepartamento) {
                resultado.add(puesto);
            }
        }
        
        return resultado;
    }
    
}
