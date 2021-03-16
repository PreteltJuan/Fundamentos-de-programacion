package TalleresJava.Taller07;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine().toLowerCase();
    
        System.out.println(string.length());
        System.out.println(string.indexOf("a"));

        in.close();
    }
}
