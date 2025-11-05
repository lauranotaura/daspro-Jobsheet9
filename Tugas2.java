import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan yang akan diinput: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 
        
        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        long totalBiaya = 0; 
        
        System.out.println("\n--- Masukkan Detail Pesanan ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ":");
            
            System.out.print("  Nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("  Harga satuan (Rp): ");
            hargaPesanan[i] = sc.nextInt();
            
            totalBiaya += hargaPesanan[i]; 
            
            sc.nextLine(); 
        }
        
        System.out.println("\n--- Daftar Pesanan Kafe ---");
        System.out.println("No.\tNama Pesanan\t\tHarga (Rp)");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-3d\t%-20s\t%,d\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        
        System.out.println("-------------------------------------------------");
        System.out.printf("TOTAL BIAYA PESANAN: \t\t%,d\n", totalBiaya);
        
        sc.close();
    }
}