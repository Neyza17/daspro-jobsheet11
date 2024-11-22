import java.util.Scanner;

public class CafeIbuMariana17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] penjualan = {
                {20, 20, 25, 20, 10, 60, 10}, // Kopi
                {30, 80, 40, 10, 15, 20, 25}, // Teh
                {5, 9, 20, 25, 10, 5, 45}, // Es Degan
                {50, 8, 17, 18, 10, 30, 6}, // Roti Bakar
                {15, 10, 16, 15, 10, 10, 55} // Gorengan
        };

        int pilihan;
        do {
            System.out.println("\nMenu Cafe Ibu Mariana");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Semua Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-Rata Penjualan Setiap Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    inputPenjualan(penjualan, sc);
                    break;
                case 2:
                    tampilkanSemuaData(penjualan);
                    break;
                case 3:
                    tampilkanMenuTertinggi(penjualan);
                    break;
                case 4:
                    tampilkanRataRata(penjualan);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        } while (pilihan != 5);
        sc.close();
    }
}