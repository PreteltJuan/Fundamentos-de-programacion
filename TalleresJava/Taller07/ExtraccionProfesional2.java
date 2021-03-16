package TalleresJava.Taller07;

import java.util.Scanner;

public class ExtraccionProfesional2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
            
            String cadena = in.nextLine();
            String nombreCompleto = "";
            int indexInicio = 0;
            int indexFinal = 0;
    
            while(cadena.indexOf("'>", indexFinal) != -1 ){               
                indexInicio = cadena.indexOf("'>", indexFinal)+2;               
                indexFinal = cadena.indexOf("<", indexInicio);
                nombreCompleto += cadena.substring(indexInicio, indexFinal );  
            }

            System.out.println(nombreCompleto);    
            in.close();
    }
    /*
    *Esta versión tiene la capacidad de recuperar cualquier cantidad de campos
    */
}
