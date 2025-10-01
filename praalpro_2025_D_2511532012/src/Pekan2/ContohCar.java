package Pekan2;

public class ContohCar {

	public static void main(String[] args) {
		//deklarasi valiable char 
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		
		System.out.println("contoh variable char :");
		System.out.println("Huruf pertama: " + huruf1);
		System.out.println("Huruf kedua: " + huruf2);
		System.out.println("Angka: " + angka);
		System.out.println("Simbol: " + simbol);
		
		char huruf3 = (char) (huruf1 + 1) ; // A (65) + 1 = b(66)
		System.out.println("Huruf1 + 1 = " + huruf3);
		
		int kodeHuruf = huruf1;
		String biner1 = String.format("8s", Integer.toBinaryString (huruf1)).replace(' ', '0');
		System.out.println("Kode ASCII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println("Kode BINER dari " + huruf1 + " = " + biner1);
		
		String kata = "" + huruf1 + huruf2 + angka + simbol ;
		System.out.println(" Gabungan char menjadi string: " + kata );
		System.out.println("END");

	}

}
