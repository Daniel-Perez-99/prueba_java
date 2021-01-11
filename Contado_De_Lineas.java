import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.StreamTokenizer;


public class Contado_De_Lineas{

    //VARIABLE PARA CONTAR EL NUMERO DE LINEAS
    static int lineasTotales=0;
    static int claseTotales=0;
    static int metodosTotales=0;

    public static void main(String[] args) {

        //CREACION DEL OBJETO ARCHIVO PARA ESTAR LEYENDO EL ARCHIVO
        File archivo = new File("/Users/titaniumac1/documents/archivos_java/ejercicio/prueba_java/Contado_De_Lineas.java");

	    //LLAMAR EL MÉTODO QUE ME PERMITIRÁ CONTAR LAS LINEAS
	    contar_Lineas(archivo);
        
    }

    public static void contar_Lineas(File archivo){
    
        try{
    
            //VERIFICACION DE QUE EL ARCHIVO EXISTA
            if(archivo.exists()){

                //EMPEZAMOS CON LA LECTURA
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));

	            String lineaLeida = null;
	       
	            //WHILE QUE PERMITE CONTAR SOLO CUANDO LA LINEA LEIDA NO SEA NULL
	            while((lineaLeida = archivoLeer.readLine()) != null){
                    
                    //CONTAMOS LAS PALABRAS DE LA LINEA
                    StringTokenizer letras = new StringTokenizer(lineaLeida);

                    if((letras.countTokens() != 0) && (lineaLeida.indexOf("*") == -1) && (lineaLeida.indexOf("//") == -1) && (lineaLeida.indexOf("import") == -1) && (lineaLeida.length() > 0)){

                            if((lineaLeida.indexOf("main") != -1)){

                                //AUMENTAMOS EL NUMERO DE CLASES
                                claseTotales = claseTotales + 1;

                            }
                            //AUMENTAMOS EL NUMERO DE LINEAS¡ 
                            lineasTotales = lineasTotales + 1;

                    }
                    
                }
	        
	            //IMPRESION DE LOS DATOS
		        System.out.println("");
                System.out.println("Lineas totales: " + lineasTotales);
                
                System.out.println("");
		        System.out.println("Clases totales: " + claseTotales);

		        //SE CIERRA LA LECTURA DEL ARCHIVO
		        archivoLeer.close();


            }else{ //SI NO EXISTE EL ARCHIVO ENTONCES

                System.out.println("El archivo no existe");

            }
    
        } catch(Exception e){

            System.out.println(e.getMessage());

        }
    
    }
}