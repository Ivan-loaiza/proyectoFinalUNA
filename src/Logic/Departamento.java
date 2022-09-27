/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Juan
 */

import java.util.Vector;

public class Departamento {
    private int id;
    private String nombre;
    
    public Departamento(int id, String nombre) throws IllegalArgumentException {
        if (Departamento.idDisponible(id) == false) {
            throw new IllegalArgumentException("La ID del departamento ya está en uso");
        }
        this.id = id;
        this.nombre = nombre;
    }
    
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
    
    public static Vector<Departamento> departamentos = new Vector<>();
    
    public static boolean existeDepartamento(int id) {
        int len = departamentos.size();
        
        for (int i = 0; i < len; i++) {
            if (departamentos.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Departamento.existeDepartamento(id);
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
