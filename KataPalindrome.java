import java.util.Scanner;

public class KataPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int inputAngka = input.nextInt();
        int angkaPalindrome = findNextPalindrome(inputAngka);
        System.out.println("Angka palindrome terdekat dari " + inputAngka + " adalah " + angkaPalindrome);
    }

    public static int findNextPalindrome(int angka) {
        int angkaPalindrome = angka + 1;
        while (!isPalindrome(angkaPalindrome)) {
            angkaPalindrome++;
        }
        return angkaPalindrome;
    }

    public static boolean isPalindrome(int angka) {
        int temp = angka;
        int reversedAngka = 0;
        while (temp > 0) {
            reversedAngka = reversedAngka * 10 + temp % 10;
            temp /= 10;
        }
        return reversedAngka == angka;
    }
}
