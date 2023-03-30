public class HotelAmaris {
    public static void main(String[] args) {
        // Membuat array 2 dimensi untuk menyimpan status kamar hotel
        char[][] hotel = {
                {'*', '*', '*', '*', 'x'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', 'x', '*'}
        };

        // Looping untuk mencari keberadaan tamu
        for (int lantai = 0; lantai < hotel.length; lantai++) {
            for (int kamar = 0; kamar < hotel[lantai].length; kamar++) {
                if (hotel[lantai][kamar] == 'x') {
                    System.out.println("Tamu berada di Lantai " + (lantai+1) + " Kamar " + (kamar+1));
                }
            }
        }
    }
}
