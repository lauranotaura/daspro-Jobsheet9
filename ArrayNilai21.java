import java.util.Scanner;
public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

// DEKLARASI
        int [] NilaiAkhir= new int[10];
//INPUT
        for (int i=0; i< 10; i++) {
            System.out.print("Masukan Nilai Akhir ke-"+i+" :");
            NilaiAkhir[i]=sc.nextInt();

        }
        for (int i =0;i <10;i++){
            System.out.println("Nilai Akhir ke-"+i+" adalah" +NilaiAkhir[i]);
        }
        sc.close();
    }
}
