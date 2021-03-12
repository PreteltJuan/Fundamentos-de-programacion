package TalleresJava.Tests;

import TalleresJava.Taller06.*;

public class Main {

    public static void main(String[] args) {
        Punto punto1 = new Punto(23,56);
        Punto punto2 = new Punto(456, 234);
    
        System.out.println( Punto.distancia(punto1, punto2) );   
        
        Planeta planeta1 = new Planeta();
        Planeta planeta2 = Planeta.planetaMedio(planeta1);
        System.out.println( planeta1.getNombre() + " " + planeta1.getMasa() );   
        System.out.println( planeta2.getNombre() + " " + planeta2.getMasa() );  
        
        Overloading.mostrar("A");
        Overloading.mostrar('a');
        Overloading.mostrar(2.2);
        Overloading.mostrar(1);
    }

}
