//LEONIDAS CHAVEZ
//DNI: 92963990

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Parcial2 {
	
	 public static ArrayList<String> leerArchivo(String path) {
	        ArrayList<String> lineas = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
	            String linea;
	            
	            while ((linea = br.readLine()) != null) {
	                lineas.add(linea);
	            }
	            
	            br.close();
	            
	        } catch (IOException e) {
	            System.out.println("Archivo inexistente!");
	        }
	     
	        return lineas;
	    }

	    public static HashMap<Integer, String> mapear(ArrayList<String> lineas) {
	        HashMap<Integer, String> mapa = new HashMap<>();
	        
	        for (int i = 0; i < lineas.size(); i++) {
	            mapa.put(i + 1, lineas.get(i));
	        }
	        
	        return mapa;
	    }

	    public static String[] toArray(HashMap<Integer, String> mapa) {
	        return mapa.values().toArray(new String[0]);
	    }

	    public static void main(String[] args) {
	        String path = "C:\\programasjavaya\\ProyectoParcial2\\Texto.txt";
	        ArrayList<String> lineas = leerArchivo(path);

	        if (!lineas.isEmpty()) {
	            HashMap<Integer, String> mapa = mapear(lineas);
	            String[] arrayDeStrings = toArray(mapa);
	            
	            System.out.println("Texto literario elegido:");
	            
	            for (String linea : lineas) {
	                System.out.println(linea);
	            }
	            
	            System.out.println();
	            System.out.println("HashMap:");
	            
	            System.out.println(mapa);
	            System.out.println();
	            System.out.println("Array de Strings:");
	            
	            for (String txt : arrayDeStrings) {
	                System.out.println(txt);
	            }

	             
	        }
	    }


}
// Entrando en detalle, comprobé que la variable "path" que se solicita colocar como 
// nombre es la interfaz en la que estamos trabajando,
// lo segundo que noté es que al ejecutar me muestra el 
// texto que cree, y el arrayDeStrings lo muestra ordenado de la misma manera, solo
// me causo malestar el no poder ordenar el hashMap en lineas verticales, pero comprendo
// que para esto debi crear un treeMap, e inicializarlo con el hasMap.
//  









