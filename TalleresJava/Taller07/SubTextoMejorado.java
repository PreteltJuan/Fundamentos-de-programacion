package TalleresJava.Taller07;

import java.util.Scanner;

public class SubTextoMejorado {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        int indexInicio = in.nextInt();
        int indexFinal = in.nextInt();
     
        if ( indexFinal > string.length()) {
            System.err.println("Error");
        }
        else if(indexInicio > indexFinal ){
            System.err.println("Error2");
        }else{
            System.out.println(string.substring(indexInicio, indexFinal+1));
        }
        
        
        in.close();
    }
}
