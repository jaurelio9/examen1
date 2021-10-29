
package javaapplication1;



public class Persona {
    
    private String nombre ="";
    private int edad =0;
    private String Nss;
    private char sexo ='H';
    private double peso =0;
    private double altura =0;
    
    public String getNombre(){
    return this.nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
      public int getEdad(){
    return this.edad;
    }
    
    public void setEdad(int edad){
    this.edad = edad;
    }
    
      public String getNss(){
    return this.Nss;
    }
      
       public char getSexo(){
    return this.sexo;
    }
    
    public boolean setSexo(char sexo){
         if(comprobarSexo(Character.toUpperCase(sexo))){
             this.sexo = Character.toUpperCase(sexo);
             return true;
         }else{
         return false;
         }
    }
    
   
    public double getPeso(){
    return this.peso;
    }
    
    public void setPeso(double peso){
       
    this.peso = peso;
    }
    
     public double getAltura(){
    return this.peso;
    }
    
    public void setAltura(double altura){
    this.altura = altura;
    }
    
    
    public Persona(String nombre, int edad, char sexo,double peso,double altura){
        this.nombre= nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso =peso;
        this.altura=altura;    
       this.Nss = generarNss();
    }
    
    public Persona(){
        this.Nss = generarNss();
    }
    
    private String generarNss(){
        String cadenaAlfanumerica = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789";
        StringBuilder nss = new StringBuilder(8);

         for (int m = 0; m < 8; m++) { 

            // generate numeric
            int index = (int)(cadenaAlfanumerica.length() * Math.random()); 

            // add the characters
            nss.append(cadenaAlfanumerica.charAt(index)); 
        } 

        return nss.toString(); 
   
    }
    
    public int calcularIMC(){
       int tipoPeso =0;
       double imc = (this.peso/(Math.pow(this.altura,2)));
       
       switch(this.sexo){
           
           case 'H':
               if (imc<20) {
                  tipoPeso = -1;
               }else if (imc>25) {
                   tipoPeso=1;
               }
               break;
           case 'M':
                if (imc<19) {
                  tipoPeso = -1;
               }else if (imc>24) {
                   tipoPeso=1;
               }
               break;
       }
       
       return tipoPeso;
    }
    
     public boolean esMayorDeEdad(){  
       return  (this.edad >= 18)? true: false; 
    }
     
    private boolean  comprobarSexo(char sexo){
        return (sexo=='H' || sexo=='M')?true:false;
    }
    public String toString(){
    
        String MensajeIMC ="";
        switch(calcularIMC()){
            case 0:
                MensajeIMC ="Usted está en su peso Ideal";
                break;
                 case 1:
                      MensajeIMC ="Usted está por de su encima peso Ideal";
                break;
                 case -1:
                      MensajeIMC ="Usted está por de bajo de su peso Ideal";
                break;
        }
        return "Nombre: "+this.nombre+"\n\r edad: "+this.edad+"\n\r sexo: "+this.sexo+"\n\r Nss: "+this.Nss+"\n\r peso: "+this.peso+"\n\r Altura: "+this.altura +" \n\r "+MensajeIMC+"\n\r"+((esMayorDeEdad())?"Usted es Mayor de edad":"Usted es Menor de edad");
    }
}
