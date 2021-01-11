import java.io.BufferedReader; //1
import java.io.File; //2
import java.io.FileReader; //3
import java.util.StringTokenizer; //4


public class Contado_De_Lineas{ //5

    //VARIABLE PARA CONTAR EL NUMERO DE LINEAS //6
    static int lineasTotales=0; //7

    public static void main(String[] args) { //8

        //CREACION DEL OBJETO ARCHIVO PARA ESTAR LEYENDO EL ARCHIVO //9
        File archivo = new File("/Users/titaniumac1/documents/archivos_java/ejercicio/prueba_java/Contado_De_Lineas.java"); //10

	    //LLAMAR EL MÉTODO QUE ME PERMITIRÁ CONTAR LAS LINEAS //11
	    contar_Lineas(archivo); //12
        
    } //13

    public static void contar_Lineas(File archivo){ //14
    
        try{ //15
    
        //VERIFICACION DE QUE EL ARCHIVO EXISTA //16
            if(archivo.exists()){ //17

                //EMPEZAMOS CON LA LECTURA //18
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo)); //19

	            String lineaLeida; //20
	       
	            //WHILE QUE PERMITE CONTAR SOLO CUANDO LA LINEA LEIDA NO SEA NULL //21
	            while((lineaLeida = archivoLeer.readLine()) != null){ //22
                    
                    //CONTAMOS LAS PALABRAS DE LA LINEA //23
                    StringTokenizer letras = new StringTokenizer(lineaLeida); //24

                    if(letras.countTokens() != 0){ //25

                        //AUMENTAMOS EL NUMERO DE LINEAS //26
                        lineasTotales = lineasTotales + 1; //27

                    } //28
                    
                } //29
	        
	            //IMPRESION DE LOS DATOS //30
		        System.out.println(""); //31
		        System.out.println("Lineas totales: " + lineasTotales); //32

		        //SE CIERRA LA LECTURA DEL ARCHIVO //33
		        archivoLeer.close(); //34


            }else{ //SI NO EXISTE EL ARCHIVO ENTONCES //35

                System.out.println("El archivo no existe"); //36

            } //37
    
        } catch(Exception e){ //38

            System.out.println(e.getMessage()); //39

        } //40
    
    } //41

} //42