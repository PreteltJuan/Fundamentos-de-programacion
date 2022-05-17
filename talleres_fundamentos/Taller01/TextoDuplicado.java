package TalleresJava.Taller01;

import java.util.Scanner;

public class TextoDuplicado {
    public static void main(String[] args){
        
	Scanner in = new Scanner(System.in);

	String word = in.next();

        System.out.print(word + word);

        in.close();
    }
    
}
