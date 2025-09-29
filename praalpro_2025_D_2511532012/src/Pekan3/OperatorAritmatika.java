package Pekan3;
import java.util.Scanner;
public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close ();
		
		System.out.println("operatr penjumlahan");
		hasil = A1 + A2;
		System.out.println("Hasil = " + hasil );
		
		System.out.println("operator pengurangan ");
		hasil = A1 - A2 ;
		System.out.println("Hasil = " + hasil );
		
		System.out.println("operator perkalian ");
		hasil = A1 * A2 ;
		System.out.println("Hasil = " + hasil );
		
		System.out.println("operator pembagian ");
		hasil = A1 / A2 ;
		System.out.println("Hasil = " + hasil );
		
		System.out.println("operator sisa bagi ");
		hasil = A1 % A2 ;
		System.out.println("Hasil = " + hasil );
		

	}

}
