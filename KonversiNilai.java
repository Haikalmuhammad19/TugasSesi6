// Nama  : Haikal Muhammad Kurniawan
// NIM   : 20220040008
// Kelas : TI22M 
import java.util.Scanner;

public class KonversiNilai {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        char grade;

        if (nilai >= 85 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 75 && nilai <= 84) {
            grade = 'B';
        } else if (nilai >= 65 && nilai <= 74) {
            grade = 'C';
        } else if (nilai >= 55 && nilai <= 64) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Nilai Anda: " + grade);
    }
}
