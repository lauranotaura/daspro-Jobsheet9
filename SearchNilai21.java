import java.util.Scanner;

public class SearchNilai21 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilai[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari: "); 
        int key = sc.nextInt();
        
        int indeksDitemukan = -1; 
        
        for (int i = 0; i < nilai.length; i++) { 
            if (nilai[i] == key) {
                indeksDitemukan = i; 
                break; 
            }
        }
        
        if (indeksDitemukan != -1) {
            System.out.println("\nNilai " + key + " ditemukan pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
        
        sc.close();
    }
}