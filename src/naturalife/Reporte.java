
package naturalife;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// @author LUIS BEDOYA
 
public class Reporte {
    private String rutaArchivoREPORTE; //Atributo para asignar el nombre del archivo.
    File archivo;

    public Reporte() {
        rutaArchivoREPORTE = "";
        archivo = null;
    }

    public String getRutaArchivoREPORTE() {
        return rutaArchivoREPORTE;
    }

    public void setRutaArchivoREPORTE(String rutaArchivoREPORTE) {
        this.rutaArchivoREPORTE = rutaArchivoREPORTE;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
        public void guardar_DatosReportes(String Dato) throws IOException{
        archivo = new File(getRutaArchivoREPORTE());
        BufferedWriter escribir;
        if (archivo.exists()){
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(Dato);
            escribir.newLine();
        } else { 
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(Dato);
            escribir.newLine();
        }
        escribir.close();
    }
    
    
    public String Leer_Datos(String rutaArchivo) throws FileNotFoundException, IOException {
        String linea;
        String verDatosArchivo = "";
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            verDatosArchivo += String.valueOf(linea + "\n");
        }
        leer.close();
        return verDatosArchivo;
    }
    
     
    public int Cantidad_LineasArchivoRportes() throws FileNotFoundException, IOException{
        int numeroLineas = 0;
        String linea;
        FileReader fichero = new FileReader(getRutaArchivoREPORTE());
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            numeroLineas++;
        }
        leer.close();
        return numeroLineas;
    
    }
    
     public int Cantidad_LineasArchivoFicheroexistenteReporte() throws FileNotFoundException, IOException{
        int numeroLineas = 0;
        File archivo = new File ("Clientes.txt");
        FileReader fichero = new FileReader(archivo);
        BufferedReader leer = new BufferedReader(fichero); 
        String linea = ""; 
        while ((linea = leer.readLine()) != null) {
            numeroLineas++;
        }
        leer.close();
        return numeroLineas;
    
    }
     
   public String Mostrar() throws FileNotFoundException,IOException{
        //leo archivo
        File archivo = new File ("Clientes.txt");
        FileReader fichero = new FileReader(archivo);
        BufferedReader leer = new BufferedReader(fichero); 
        String linea = ""; 
        String Mensaje= "";
        int contador = 0;
        
        while (linea  != null && contador < Cantidad_LineasArchivoFicheroexistenteReporte() ){
            linea = leer.readLine();
             String[] Vector = linea.split(" ");
             for (int i = 0; i < Vector.length; i++) {
                Mensaje += Vector[i];
                
             }
             
             if(linea == null){
                 break;
             }
             contador++;
            }
        
        return Mensaje; 
       }
       
   
   }
