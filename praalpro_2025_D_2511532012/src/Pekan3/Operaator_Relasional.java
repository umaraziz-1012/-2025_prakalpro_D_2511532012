package Pekan3;

import java.util.Scanner;

public class Operaator_Relasional {
	public static void main(String[] args) {
		
		int A1;
		int A2;
		boolean hasil;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input angka-1 : ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2 : ");
		A2 = keyboard.nextInt();
		keyboard.close();
		
		hasil = A1 > A2;
		System.out.println("A1 > A2 = " + hasil);
		
		hasil = A1 < A2;
		System.out.println("A1 < A2 = " + hasil);
		
		hasil = A1 >= A2;
		System.out.println("A1 >= A2 = " + hasil);
		
		hasil = A1 <= A2;
		System.out.println("A1 > A2 <= " + hasil);
		
		hasil = A1 == A2;
		System.out.println("A1 == A2 = " + hasil);
		
		hasil = A1 != A2;
		System.out.println("A1 != A2 = " + hasil);
	}

}
