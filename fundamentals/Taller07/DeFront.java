package TalleresJava.Taller07;

import java.util.Scanner;

public class DeFront {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();
        String string2 = "";

        if( string.indexOf("a") == 0){
            string2 += "a";
        }
       
        
        if( string.indexOf("b") == 1){
            string2 += "b";
        }

        if(string.length()>1) string2 += string.substring(2, string.length());

        System.out.println(string2);

        in.close();
    }
}
