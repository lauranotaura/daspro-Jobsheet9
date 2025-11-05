import java.util.Scanner;

public class ModifikasiArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //INPUT
        System.out.print("Masukkan jumlah mahasiswa : ");
        //DEKLARASI
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        int counterLulus = 0;
        double totalTidakLulus = 0;
        int counterTidakLulus = 0;
        
        //INPUT
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                counterLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                counterTidakLulus++;
            }
        }
        //HITUNG
        double rataRataLulus = 0.0;
        if (counterLulus > 0) {
            rataRataLulus = totalLulus / counterLulus; 
        }

        double rataRataTidakLulus = 0.0;
       
        if (counterTidakLulus > 0) {
            rataRataTidakLulus = totalTidakLulus / counterTidakLulus;
        }

        // OUTPUT
        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);

        sc.close();
    }
}