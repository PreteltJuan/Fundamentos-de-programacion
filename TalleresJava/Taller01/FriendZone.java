package TalleresJava.Taller01;

import java.util.Scanner;

public class FriendZone
{
	public static void main(String a[]){
		
		Scanner in = new Scanner(System.in);
		
		String nombre_1 = in.nextLine();
		String nombre_2 = in.nextLine();

		System.out.print(nombre_1 + " deja en la friend zone a " + nombre_2);
		in.close();
	}

}