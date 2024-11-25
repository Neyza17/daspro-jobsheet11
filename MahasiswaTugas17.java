import java.util.Scanner;

public class MahasiswaTugas17 {

    public static void main(String[] args) {

        String[] Tugas = {"Agama", "Matematika", "B Inggris", "B Indonesia", "Fisika"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}
