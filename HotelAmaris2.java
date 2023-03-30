public class HotelAmaris2 {
    public static void main(String[] args) {
        // Membuat array 2 dimensi untuk menyimpan status kamar hotel
        char[][] hotel = {
                {'*', '*', '*', '*', 'x'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', 'x', '*'}
        };

        int kamarKosong = 0; // inisialisasi jumlah kamar kosong
        // Looping untuk menghitung jumlah kamar kosong
        for (char[] hotel1 : hotel) {
            for (int kamar = 0; kamar < hotel1.length; kamar++) {
                if (hotel1[kamar] == '*') {
                    kamarKosong++;
                }
            }
        }

        System.out.println("Jumlah kamar yang tersedia adalah " + kamarKosong + " kamar");
    }
}
