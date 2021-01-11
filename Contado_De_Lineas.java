import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Contador_De_Lineas{

    //VARIABLE PARA CONTAR EL NUMERO DE LINEAS
    static int lineasTotales=0;

    public static void main(String[] args) {

        //CREACION DEL OBJETO ARCHIVO PARA ESTAR LEYENDO EL ARCHIVO
        File archivo = new File(“/Users/titaniumac1/documents/archivos_java/ejercicio/prueba_java/Contado_De_Lineas.java”)

	//LLAMAR EL MÉTODO QUE ME PERMITIRÁ CONTAR LAS LINEAS
	contar_Lineas(archivo);
        
    }

    public static void contar_Lineas(File archivo){
    
    try{
    
        //VERIFICACION DE QUE EL ARCHIVO EXISTA
        if(archivo.exists()){

            //EMPEZAMOS CON LA LECTURA
              BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));

	       String linealLeida;

        }else{ //SI NO EXISTE EL ARCHIVO ENTONCES

              System.out.println(“El archivo no existe”):

        }
    
    } catch(Exception e){

        System.out.println(e.getMessage());

    }
    
    }

}