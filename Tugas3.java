import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("--- Selamat Datang di Kafe Kami ---");
        System.out.println("Menu Tersedia: Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice");
        System.out.println("-----------------------------------");
        
       
        System.out.print("Masukkan nama makanan/minuman yang ingin Anda pesan: ");
        String key = sc.nextLine();
        
      
        boolean ditemukan = false;
        int indeksDitemukan = -1;

        
        for (int i = 0; i < menu.length; i++) {
            
            if (menu[i].equalsIgnoreCase(key)) {
                ditemukan = true; 
                indeksDitemukan = i; 
                break; 
            }
        }

       
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
            System.out.println("Item: '" + menu[indeksDitemukan] + "' ditemukan.");
            System.out.println("Status: Makanan/Minuman tersebut TERSEDIA untuk dipesan.");
        } else {
            System.out.println("Item: '" + key + "' tidak ditemukan.");
            System.out.println("Status: Maaf, makanan/minuman yang Anda cari TIDAK ADA di menu.");
        }

        sc.close();
    }
}