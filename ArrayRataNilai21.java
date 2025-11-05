import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //DEKLARASI
            int[] nilaiMHS=new int[10];
            double total=0;
            double rata2;
        
        //INPUT 
        for (int i = 0; i< nilaiMHS.length; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+":");
            nilaiMHS[i]=sc.nextInt();
        }
        for (int i =0; i<nilaiMHS.length;i++){
            total+= nilaiMHS[i];
        }
        //HITUNG rata rata
        rata2=total/nilaiMHS.length;
        System.out.print("Rata -rata nilai= " +rata2);
    }
    
}
