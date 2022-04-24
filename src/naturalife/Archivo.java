package naturalife;
//@author LUIS BEDOYA
import java.io.*;

 
public class Archivo {
    private String rutaArchivo; //Atributo para asignar el nombre del archivo.
    File archivo;

    public Archivo() {
        rutaArchivo = "";
        archivo = null;
    }

     public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void guardar_Datos(String Dato) throws IOException{
        archivo = new File(getRutaArchivo());
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
    
     
    public int Cantidad_LineasArchivo() throws FileNotFoundException, IOException{
        int numeroLineas = 0;
        String linea;
        FileReader fichero = new FileReader(getRutaArchivo());
        BufferedReader leer = new BufferedReader(fichero);
        while ((linea = leer.readLine()) != null) {
            numeroLineas++;
        }
        leer.close();
        return numeroLineas;
    
    }
    
     public int Cantidad_LineasArchivoFicheroexistente() throws FileNotFoundException, IOException{
        int numeroLineas = 0;
        File archivo = new File ("Datos.txt");
        FileReader fichero = new FileReader(archivo);
        BufferedReader leer = new BufferedReader(fichero); 
        String linea = ""; 
        while ((linea = leer.readLine()) != null) {
            numeroLineas++;
        }
        leer.close();
        return numeroLineas;
    
    }
}
