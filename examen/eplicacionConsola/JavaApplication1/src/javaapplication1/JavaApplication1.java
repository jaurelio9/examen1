
package javaapplication1;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication1 {
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
    
      Persona p = new Persona();
      String nombre ="";
      int edad =0;
      char sexo ='H';
      double peso =0.0;
      double altura=0.0;
      
         System.out.println("ingrese su Nombre");
         nombre = s.nextLine();
         System.out.println("ingrese su Edad");
         edad = Integer.parseInt(s.nextLine());
         
            do {
            System.out.println("ingrese su Sexo (H para hombre M para Mujer)");
             sexo =s.next().charAt(0); 
        } while (!p.setSexo(sexo));
         
        
         System.out.println("Ingrese su peso en KG");
         peso = s.nextDouble();
     
         System.out.println("ingrese su Altura en Metros");
         altura = s.nextDouble();
         
         p.setNombre(nombre);
         p.setEdad(edad);  
         p.setPeso(peso);
         p.setAltura(altura);
         
         System.out.println(p.toString());
         
    }
    
}
