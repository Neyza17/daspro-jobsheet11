import java.util.Scanner;

public class HitungTotalHarga17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========MENU RESTO=======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        double totalHargaKeseluruhan = 0;
        System.out.print("Masukkan kode promo (jika ada): ");
        sc.nextLine();
        String kodePromo = sc.nextLine();
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) atau 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();
        if (pilihanMenu == 0) {
            break;
        }
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        double hargaMenu = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalHargaKeseluruhan += hargaMenu;
    }
    System.out.println("\nTotal keseluruhan harga pesanan Anda: Rp " + (int) totalHargaKeseluruhan);

        public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Pilihan menu tidak valid!");
            return 0;
        }
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        double totalSetelahDiskon = hargaTotal;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50%!");
            totalSetelahDiskon = hargaTotal * 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30%!");
            totalSetelahDiskon = hargaTotal * 0.7;
        } else if (kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diterapkan.");
        }
        return totalSetelahDiskon;
    }
}
