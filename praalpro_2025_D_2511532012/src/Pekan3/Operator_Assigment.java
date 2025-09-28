package Pekan3;
import java.util.Scanner;
public class Operator_Assigment {

	public static void main(String[] args) {
		int A1 ;
		int A2 ;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input angka-1 : ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2 : ");
		A2 = keyboard.nextInt();
		keyboard.close();
		
		System.out.println("Assisgment penambahan ");
		A1 += A2;
		System.out.println("penambahan : " + A1);
		
		System.out.println("Assisgment pengurangan ");
		A1 -= A2;
		System.out.println("pengurangan : " + A1);
		
		System.out.println("Assisgment perkalian ");
		A1 *= A2;
		System.out.println("perkalian : " + A1);
		
		System.out.println("Assisgment pembagian ");
		A1 /= A2;
		System.out.println("pembagian : " + A1);
		
		System.out.println("Assisgment sisa bagi ");
		A1 %= A2;
		System.out.println("sisa bagi : " + A1);
		

	}

}
