package Pekan4;

import java.util.Scanner;

public class latihan_IF1 {

	public static void main(String[] args) {
		Double IPK;
		Scanner input=new Scanner(System.in);
		System.out.println("Input IPK anda = ");
		IPK=input.nextDouble();
		input.close();
		if (IPK>2.75) {
			System.out.println("Anda lulus dengan sangat memuaskan dengan IPK " + IPK);
		}
		else if (IPK<2.75) {
			System.out.println("anda tidak lulus dengan IPK " + IPK);
		}
	}

}
