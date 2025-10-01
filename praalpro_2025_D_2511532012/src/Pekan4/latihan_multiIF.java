package Pekan4;

import java.util.Scanner;

public class latihan_multiIF {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a=new Scanner (System.in);
		System.out.println("input umur anda :");
		umur=a.nextInt();
		System.out.println("sudah punya SIM C (y/n) :");
		sim=a.next().charAt(0);
		a.close();
		if((umur >= 17)&& (sim=='y')) {
			System.out.println(" ANDA SUDAH DEWASA DAN BOLEH MEMBAWAK MOTOR");
		}
		if((umur >= 17)&& (sim!='y')) {
			System.out.println(" ANDA SUDAH DEWASA TAPI TIDAK BOLEH MEMBAWAK MOTOR");
		}
		if((umur < 17)&& (sim!='y')) {
			System.out.println(" ANDA BELUM CUKUP UMUR MEMBAWAK MOTOR");
		}
		if((umur < 17)&& (sim=='y')) {
			System.out.println(" ANDA BELUM CUKUP UMUR MEMILIKI SIM");
		}
		
		}
	}

