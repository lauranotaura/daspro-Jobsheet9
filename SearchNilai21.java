import java.util.Scanner;
public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    //DEKLARASI
        int[] arrNilai={80,85,78,96,90,82,86};
        int key=90;
        int hasil= 0;

    //INPUT
    for (int i= 0; i< arrNilai.length;i++){
        if(key== arrNilai[i]){
            hasil=i;
            break;
        }
    }
    //OUTPUT
        System.out.println();
        System.out.println("Nilai"+key+" ketemu di indeks ke-"+hasil);
        System.out.println();

        sc.close();
    }
    }
    

