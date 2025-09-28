package Pekan3;

import java.util.Scanner;

public class Operator_logika {

	public static void main(String[] args) {
		boolean A1;
		boolean A2;
		boolean c;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input boolean-1 (true / false ) : ");
		A1 = keyboard.nextBoolean();
		System.out.println("input boolean-2 (true / false ) : ");
		A2 = keyboard.nextBoolean();
		keyboard.close();
		
		System.out.println("A1 = " + A1 );
		System.out.println("A2 = " + A2 );
		System.out.println("Konjungsi" );
		c=A1&&A2;
		
		System.out.println("True and False = " + c );
		System.out.println("Disjungsi" );
		c=A1||A2;
		
		System.out.println("True and False = " + c  );
		System.out.println("Negasi" );
		c=!A1;
		
		System.out.println("Bukan True = " + c );
	}

}
