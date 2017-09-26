package tareas.dos;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  private static Scanner scanner;

public static String menu() {
    StringBuffer sb = new StringBuffer();
    sb.append("¿Qué desea dibujar?\n");
    // FigurasGeometricas es un enum
    Object[] fgs = FigurasGeometricas.values();
    for(Integer i=0; i<fgs.length; i++) {
      sb.append(i+1);
      sb.append(": ");
      sb.append(fgs[i]);
      sb.append("\n");
    }
    sb.append("Presione 0 para salir.");
    return sb.toString();
  }
  
  public static void main(String[] args) {
    // variables
    Integer option, ancho, alto;
    //TODO: crear interfaz FiguraGeometrica
    FiguraGeometrica fg = null;
    //inicializar variable de tipo coleccion
    Collection<FiguraGeometrica> list1;
    list1 = new ArrayList<FiguraGeometrica>();

    scanner = new Scanner(System.in);
    // paso 2: creo el menú y espero la opción del usuario
    do {
      System.out.println(menu());
      option = scanner.nextInt();
      // paso 3: pregunto las dimensiones de la figura a dibujar
      //         y la creo
      if ((option - 1) == FigurasGeometricas.CUADRADO.ordinal()) {
          System.out.println("Ingrese el tamaño del lado: ");
          ancho = alto = scanner.nextInt();
          //TODO: crear clase cuadrado
          fg = new Cuadrado(ancho);
      } else if ((option - 1) == FigurasGeometricas.TRIANGULO.ordinal()) {
          System.out.println("Ingrese el tamaño de la base: ");
          ancho = alto = scanner.nextInt();
          //TODO: crear clase triangulo
          fg = new Triangulo(ancho);
      } else if ((option - 1) == FigurasGeometricas.RECTANGULO.ordinal()) {
          System.out.println("Ingrese el tamaño del ancho: ");
          ancho = scanner.nextInt();
          System.out.println("Ingrese el tamaño del alto: ");
          alto = scanner.nextInt();
          //TODO: crear clase rectangulo
          fg = new Rectangulo(ancho, alto);
      } else if (option == 0) {
    	  //recorrer colleccion y dibujar cada figura
    	  	//type of data put into list is FiguraGeometrica
    		Iterator<FiguraGeometrica> iter = list1.iterator();
    		while (iter.hasNext()) 
    		{
    			Dibuja d = (Dibuja)iter.next();
    			d.dibuja();
    		}
    		
      }
      // paso 4: agrego la figura a mi coleccion
      list1.add(fg);
      
      //TODO: agregar a coleccion
    } while (option != 0);
  }
  
}