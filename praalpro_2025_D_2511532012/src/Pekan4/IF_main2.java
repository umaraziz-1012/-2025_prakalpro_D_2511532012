package Pekan4;

import java.util.Scanner;

public class IF_main2 {

	public static void main(String[] args) {
		
			Double IPK;
			Scanner input=new Scanner(System.in);
			System.out.println("Input IPK anda = ");
			IPK=input.nextDouble();
			input.close();
			if (IPK>2.75 && IPK<5.00) {
				System.out.println("Anda lulus dengan sangat memuaskan dengan IPK " + IPK);
			}
			else if (IPK<2.75&& IPK>1.00) {
				System.out.println("Anda lulus biasa biasa saja dengan IPK " + IPK);
			}else if(IPK<=1.00){
			System.out.println("ANDA BODOH, ANDA TIDAK LULUS, SILAHKAN COBA LAGI");
			}else {
				System.out.println("GOBLOK MANA ADA IPK LEBIH DARI 5 ");
			}
			
	}

}
