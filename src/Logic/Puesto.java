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

public class Puesto {
    private int id;
    private String nombre;
    private int salario;
    private int idDepartamento;
    
    public Puesto(int id, String nombre, int salario, int idDepartamento)
     throws IllegalArgumentException {
        if (Puesto.idDisponible(id) == false) {
            throw new IllegalArgumentException("ID de puesto ya está en uso");
        }
        if (Departamento.existeDepartamento(idDepartamento) == false) {
            throw new IllegalArgumentException("La ID del departamento no se refiere a ningún departamento existente");
        }
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.idDepartamento = idDepartamento;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getSalario() {
        return this.salario;
    }
    
    public int getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
    public static Vector<Puesto> puestos = new Vector<>();
    
    public static boolean existePuesto(int id) {
        int len = puestos.size();
        
        for (int i = 0; i < len; i++) {
            if (puestos.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Puesto.existePuesto(id);
    }
    
    public static Puesto GetPuesto(int id) {
        int len = puestos.size();
        
        for (int i = 0; i < len; i++) {
            if (puestos.get(i).getId() == id) {
                return puestos.get(i);
            }
        }
    
        return null;
    }
   
}
