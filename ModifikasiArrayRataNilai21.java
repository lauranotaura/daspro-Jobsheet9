import java.util.Scanner;
public class ModifikasiArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

//Modifikasi

        //DEKLARASI
        int[] nilaiMhs = new int[5];
        int counterLulus = 0; 

        // INPUT
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiMhs[i] = sc.nextInt();
        } 
        
       // OUTPUT
        System.out.println("\n--- Status Kelulusan ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " LULUS!");
                // MODIFIKASI: Tambahkan 1 ke counterLulus jika LULUS
                counterLulus++; 
            } else {
                System.out.println("Mahasiswa ke-" + i + " TIDAK LULUS!");
            }
        }
        
        // MODIFIKASI UTAMA: Menampilkan total mahasiswa yang lulus
        System.out.println("\nJumlah total mahasiswa yang LULUS adalah: " + counterLulus);

        sc.close();
    }
}
    
