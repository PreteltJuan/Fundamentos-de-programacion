package TalleresJava.Taller07;

import java.util.Scanner;


public class SubTexto {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        int indexInicio = in.nextInt();
        int indexFinal = in.nextInt() + 1;
        String substring = "";

        if ( indexFinal < string.length()) {
            substring = string.substring(indexInicio, indexFinal);            
        }

        System.out.println(substring);
        in.close();
    }
}
