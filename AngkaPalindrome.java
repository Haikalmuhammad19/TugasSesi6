import java.util.Scanner;

public class AngkaPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();
        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah sebuah palindrome.");
        } else {
            System.out.println(kata + " bukan sebuah palindrome.");
        }
    }

    public static boolean isPalindrome(String kata) {
        kata = kata.toLowerCase().replaceAll("\\s", "");
        int panjangKata = kata.length();
        for (int i = 0; i < panjangKata / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjangKata - i - 1)) {
                return false;
            }
        }
        return true;
    }
}