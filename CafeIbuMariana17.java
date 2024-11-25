import java.util.Scanner;

public class CafeIbuMariana17 {

    public static void main(String[] args) {
        int[][] penjualan = {
                {28, 20, 25, 20, 10, 50, 10},
                {30, 40, 40, 10, 15, 20, 25},
                {5, 9, 20, 25, 18, 5, 45},
                {50, 8, 17, 18, 10, 30, 6},
                {15, 10, 16, 15, 10, 10, 55}
        };
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Data Penjualan Kafe Ibu Mariana:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
        int maxPenjualan = 0;
        int indexMenuTerlaris = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                indexMenuTerlaris = i;
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menu[indexMenuTerlaris]);
        System.out.println("\nRata-rata penjualan setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan =0;
            for (int j = 0; j < penjualan[i].length; j++){
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
}
