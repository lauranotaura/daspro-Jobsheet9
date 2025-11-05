import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        
        // Deklarasi array untuk menyimpan nilai
        int[] nilaiMhs = new int[jumlahMahasiswa];
        
        // 1. Memasukkan Setiap Nilai Mahasiswa
        System.out.println("\n--- Masukkan Nilai Mahasiswa ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        // 2. Menghitung Rata-rata, Tertinggi, dan Terendah
        double totalNilai = 0;
        int nilaiTertinggi = nilaiMhs[0]; // Asumsi nilai pertama sebagai yang tertinggi
        int nilaiTerendah = nilaiMhs[0];  // Asumsi nilai pertama sebagai yang terendah
        
        for (int nilai : nilaiMhs) {
            totalNilai += nilai;
            
            // Mencari Nilai Tertinggi
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            
            // Mencari Nilai Terendah
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // 3. Menampilkan Hasil
        System.out.println("\n--- Hasil Analisis Nilai ---");
        
        // Menampilkan Semua Nilai
        System.out.print("Semua Nilai yang dimasukkan: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i] + (i < nilaiMhs.length - 1 ? ", " : ""));
        }
        System.out.println();
        
        // Menampilkan Statistik
        System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        
        sc.close();
    }
}