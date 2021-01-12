//IMPOTAR TODAS LAS LIBRERIAS A UTILIZAR
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Contado_De_Lineas{

    //VARIABLES PARA CONTAR EL NUMERO DE LINEAS, CLASES Y METODOS
    static int lineasTotales=0;
    static int claseTotales=0;
    static int metodosTotales=0;
    static File archivo=null;

    public static void main(String[] args) {

        //LLAMAR EL MÉTODO QUE ME PERMITIRÁ cargar el archivo
        cargar_Archivo(archivo);
        
    }

    //METODO QUE PERMITE CARGAR EL ARCHIVO Y ADEMAS LLAMA A LA FUNCION CONTAR_LINEAS
    public static void cargar_Archivo(File archivo){

        //CREACION DEL OBJETO ARCHIVO PARA ESTAR CARGANDO EL ARCHIVO
        File arch = new File("/Users/titaniumac1/documents/archivos_java/ejercicio/prueba_java/Contado_De_Lineas.java");
        
        //LLAMAR EL MÉTODO QUE ME PERMITIRÁ CONTAR LAS LINEAS
	    contar_Lineas(arch);

    }

    //METODO QUE PERMITE CONTAR LAS LINEAS DE CODIGO, NUMERO DE METODOS Y CLASES
    public static void contar_Lineas(File archivo){
    
        try{
    
            //VERIFICACION DE QUE EL ARCHIVO EXISTA
            if(archivo.exists()){

                //EMPEZAMOS CON LA LECTURA
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));

	            String lineaLeida;
	       
	            //WHILE QUE PERMITE CONTAR SOLO CUANDO LA LINEA LEIDA NO SEA NULL
	            while((lineaLeida = archivoLeer.readLine()) != null){
                    
                    //CONTAMOS LAS PALABRAS DE LA LINEA
                    StringTokenizer letras = new StringTokenizer(lineaLeida);

                    //SI LA LINEA NO ESTA VACIA, SI NO TIENE ASTERISCOS, DOBLE DIAGONAL Y LA PALABRA IMPORT ENTONCES ENTRAMOS AL IF
                    if((letras.countTokens() != 0) && (lineaLeida.indexOf("*") == -1) && (lineaLeida.indexOf("//") == -1) && (lineaLeida.indexOf("import") == -1)){

                        //SI LA LINEA LEIDA TIENE LA PALABRA MAIN, ENTONCES ENTRAMOS AL IF
                        if((lineaLeida.indexOf("main") != -1) && (lineaLeida.indexOf("if") == -1)){

                            //AUMENTAMOS EL NUMERO DE CLASES
                            claseTotales++;

                        }

                        //SI LA LINEA LEIDA TIENE LA PALABRA STATIC PERO NO TIENE LA DE MAIN, ENTONCES ENTRAMOS AL IF
                        if((lineaLeida.indexOf("public static") != -1) && (lineaLeida.indexOf("main") == -1) && (lineaLeida.indexOf("if") == -1)){

                            //AUMENTAMOS EL NUMERO DE METODOS
                            metodosTotales++;

                        }

                        //AUMENTAMOS EL NUMERO DE LINEAS¡ 
                        lineasTotales++;

                    }
                    
                }
	        
	            //IMPRESION DE LOS DATOS
                System.out.println("\nLineas totales: " + lineasTotales);
                
                System.out.println("\nClases totales: " + claseTotales);
                
		        System.out.println("\nMetodos totales: " + metodosTotales);

		        //SE CIERRA LA LECTURA DEL ARCHIVO
		        archivoLeer.close();


            }else{ //SI NO EXISTE EL ARCHIVO ENTONCES

                System.out.println("El archivo no existe");

            }
    
        } catch(Exception e){

           // System.out.println(e.getMessage());
           System.out.println("Error");

        }
    
    }

}