package tugas2;
import java.util.Scanner;

public class UpahMingguan {
    public static void main(String[] args) {
        
        String nama;
        int jamKerja;
        String golongan;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        nama = keyboard.nextLine();

        System.out.print("Masukkan Golongan (A/B/C/D): ");
        golongan = keyboard.nextLine();

        System.out.print("Masukkan Jumlah Jam Kerja: ");
        jamKerja = keyboard.nextInt();
        keyboard.close();
       
        int upahPerJam = 0;

        if (golongan == ("A")) {
            upahPerJam = 1000;
        } else if (golongan == ("B")) {
            upahPerJam = 2000;
        } else if (golongan == ("C")) {
            upahPerJam = 3000;
        } else if (golongan == ("D")) {
            upahPerJam = 4000;
        } else {
            System.out.println("===SILAHKAN MASUKKAN GOLONGAN LAGI===");
            return;
        }
        
        int upahPerMinggu;
        if (jamKerja > 60) {
            int lembur = jamKerja - 60;
            upahPerMinggu = (60 * upahPerJam) + (lembur * 5000);
        } else {
            upahPerMinggu = jamKerja * upahPerJam;
        }
	
        System.out.println("\n=== GAJI KARYAWAN PERMINGGU ===");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jam Kerja     : " + jamKerja + "Jam");
        System.out.println("Upah Mingguan : $" + upahPerMinggu + "$");
        System.out.println("=================================");
        
        
    }
}
