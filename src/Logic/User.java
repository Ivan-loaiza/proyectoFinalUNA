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


public class User implements Serializable, Global {
    private String usuario;
    private char [] contra = new char[10];
    

    public User() {
    }

    public User(String usuario, char[] contra) {
        this.usuario = usuario;
        this.contra = contra;
        
        usuarioAjuste.clear();
        usuarioAjuste.add(this);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public char[] getContra() {
        return contra;
    }

    public void setContra(char[] contra) {
        this.contra = contra;
    }
    
    public static String ruta = System.getProperty("user.dir") + "\\src\\Data\\Settings.dat";
    
    public void guardarEnArchivo() {
        String archivo = "Settings.dat";
            try {
                
                ObjectOutputStream ficheroSalida = new ObjectOutputStream( new FileOutputStream(new File(ruta)));
                ficheroSalida.writeObject(usuarioAjuste);
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
                ArrayList<User> temporal = (ArrayList<User>) ficheroEntrada.readObject();
                usuarioAjuste.clear();
                usuarioAjuste.addAll(temporal);
                ficheroEntrada.close();
               
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
     }
    
}
