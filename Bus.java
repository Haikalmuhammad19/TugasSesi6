import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        ArrayList<String> jalur = new ArrayList<>();
        jalur.add("Sukabumi");
        jalur.add("Cianjur");
        jalur.add("Bandung");
        jalur.add("Garut");
        jalur.add("Tasik");
        jalur.add("Ciamis");
        jalur.add("Banjar");

        ArrayList<Double> tarif = new ArrayList<>();
        tarif.add(10000.0);
        tarif.add(15000.0);
        tarif.add(7500.0);
        tarif.add(5000.0);
        tarif.add(7500.0);
        tarif.add(6000.0);

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kota keberangkatan: ");
        String keberangkatan = input.nextLine();
        while (!jalur.contains(keberangkatan)) {
            System.out.println("Kota keberangkatan tidak valid, silahkan coba lagi: ");
            keberangkatan = input.nextLine();
        }

        System.out.println("Masukkan kota tujuan: ");
        String tujuan = input.nextLine();
        while (!jalur.contains(tujuan)) {
            System.out.println("Kota tujuan tidak valid, silahkan coba lagi: ");
            tujuan = input.nextLine();
        }

        System.out.println("Apakah Anda anggota TNI/POLRI? (y/n)");
        String member = input.nextLine();

        double total = 0;
        int index_keberangkatan = jalur.indexOf(keberangkatan);
        int index_tujuan = jalur.indexOf(tujuan);

        if (index_keberangkatan != -1 && index_tujuan != -1) { // pengecekan jika kota valid
            if (index_keberangkatan < index_tujuan) { // jalur berlaku ke arah yang benar
                for (int i = index_keberangkatan; i < index_tujuan; i++) {
                    total += tarif.get(i);
                }
            } else { // jalur berlaku PP
                for (int i = index_keberangkatan; i > index_tujuan; i--) {
                    total += tarif.get(i-1); // perbaikan indeks pada arraylist tarif
                }
                total *= 2;
            }

            if ((keberangkatan.equals("Sukabumi") && tujuan.equals("Banjar")) || (keberangkatan.equals("Banjar") && tujuan.equals("Sukabumi"))) {
                total *= 0.95; // diskon 5% jika keberangkatan atau tujuan Sukabumi-Banjar
            }

            if (member.equalsIgnoreCase("y")) {
                total *= 0.9; // diskon 10% jika anggota TNI/POLRI
            }

            System.out.println("Tarif: " + total);
        } else {
            System.out.println("Kota keberangkatan atau tujuan tidak valid.");
        }
    }
}
