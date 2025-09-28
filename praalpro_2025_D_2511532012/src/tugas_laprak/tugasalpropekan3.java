package tugas_laprak;

import java.util.Scanner;

public class tugasalpropekan3 {

	public static void main(String[] args) {
		int jari2 ;
		int tinggi;
		final double PI = 3.14;
		double volume;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input jari jari : ");
		jari2 = keyboard.nextInt();
		System.out.println("input tinggi : ");
		tinggi = keyboard.nextInt();
		keyboard.close();
		
		volume = PI * jari2 * jari2 * tinggi ;
		System.out.println("Volume = " + volume);
		

	}

}
