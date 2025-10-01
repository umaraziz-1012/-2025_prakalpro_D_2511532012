package Pekan4;

import java.util.Scanner;

public class Latihan_Ifelse1 {

	public static void main(String[] args) {
		Double IPK;
		Scanner input=new Scanner(System.in);
		System.out.println("Input IPK anda = ");
		IPK=input.nextDouble();
		input.close();
		if (IPK>2.75) {
			System.out.println("Anda lulus dengan sangat memuaskan dengan IPK " + IPK);
		} else {
			System.out.println("anda tidak lulus dengan IPK " + IPK);
			System.out.println("COBA LAGI DI TAHUN DEPAN");
		}


	}

}
