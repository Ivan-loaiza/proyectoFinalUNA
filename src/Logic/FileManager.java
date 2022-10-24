/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FileManager {

    public static String ruta = System.getProperty("user.dir") + "\\src\\Data";

    
        
    public void LeerTablaArchivo(int nColumnas, String nombreArchivo,
            DefaultTableModel tabla) {
        /*
      File proporciona información acerca de los archivos, de sus atributos,
      de los directorios, entre otros. Se utiliza para crear un archivo
      considerando la ruta donde se encuentra como también el nombre del 
      archivo
         */
        File archivo = null;
        FileReader fr = null;
         //para leer secuencialmente un archivo
        /*
      BufferedReader se utiliza para almacenar temporalmente flujos de
      caracteres en buffer de memoria. Cada invocación de read o readline
      se almacenan en un buffer para luego ser procesados
         */ 
        BufferedReader br = null;
        Object[] filas = new Object[nColumnas];
        
        try {
            
            archivo = new File(ruta + "\\" + nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            
            
            
                while ((linea = br.readLine()) != null) {
                    
                    filas[0] = linea;

                        for (int j = 1; j < nColumnas; j++) {
                            filas[j] = br.readLine();
                        }

                    tabla.addRow(filas);
                }
                
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void SobreEscribirArchivo(String nombreArchivo, DefaultTableModel tabla)
            throws IOException {
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try {
            
            File file = new File(ruta + "\\" + nombreArchivo);
            
                    if (!file.exists()) {
                        file.createNewFile();
                        JOptionPane.showMessageDialog(null,
                                "Se creó el archivo " + nombreArchivo);
                    }
                    
                    
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            
            
                    for (int filas = 0; filas < tabla.getRowCount(); filas++) {
                        
                            for (int columnas = 0; columnas < tabla.getColumnCount(); columnas++) {
                                
                                String registro = tabla.getValueAt(filas,columnas).toString() + "\n";
                                bw.write(registro);
                            }
                            
                    }
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    public void EscribirEnArchivo(String nombreArchivo,
            DefaultTableModel tabla) {
        
        FileWriter archivo = null;
        PrintWriter pw = null;
        
        try {
            
            archivo = new FileWriter(ruta + "\\" + nombreArchivo);
            pw = new PrintWriter(archivo);
            
            for (int filas = 0; filas < tabla.getRowCount(); filas++) {
                
                for (int columnas = 0; columnas < tabla.getColumnCount();
                        columnas++) {
                    pw.println(tabla.getValueAt(filas, columnas));
                    
                }
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        
        
    }
    
    
    public void EliminarDependencias(DefaultTableModel modeloTablaDefault){
        
       int columnas = modeloTablaDefault.getColumnCount();
       int filas = modeloTablaDefault.getRowCount();
       
        
        
    }
}
