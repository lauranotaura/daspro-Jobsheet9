import java.util.Scanner;
public class ModifikasiArrayBilangan21 {
   public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

//Deklarasi
            int [] bil= {5,1286,7,200000};
//Input
            bil[0]= 5;
            bil[1]= 1286;
            bil[2]=7;
            bil[3]=200000;
//Output
           for (int i = 0; i < bil.length - 1; i++) {
// STATEMENT MODIFIKASI: Menjumlahkan elemen ke-i dengan elemen ke-(i+1)
            int hasilJumlah = bil[i] + bil[i+1];
            System.out.println(hasilJumlah);

 sc.close();
   } 
}
}