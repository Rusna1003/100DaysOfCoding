// soal 1
import java.util.Scanner;


public class Rusna_r {
    public static void main(String[] args) {
        Scanner apa = new Scanner(System.in);
        int mulai = apa.nextInt();
        int factorial = 1;
        for(int a =  mulai ; a>0; a--){
            factorial *=a;
            System.out.println(a);
            if (a>1){
                System.out.print(" ");
        }
        }
        System.out.print(" "+ factorial);
    }
}
// soal 2
public class Soal_02 {

    public static void main(String[] args) {
        int number = 1;

      
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); 
        }
    }
}
// soal 3
import java.util.Scanner;


public class soal_3 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Masukkan angka: ");
            number = sc.nextInt();

            
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println("Angka adalah kelipatan 2 dan kelipatan 3. Masukkan angka lagi.");
            } else if (number % 2 == 0) {
                System.out.println("Angka adalah kelipatan 2");
                break;
            } else if (number % 3 == 0) {
                System.out.println("Angka adalah kelipatan 3");
                break;
            } else {
                System.out.println("Angka bukan kelipatan 2 atau 3");
                break;
            }
        } while (true);

        
    }
}
// soal 4
public class soal_4 {
    public static void main(String[] args) {
        soal_4 obj = new soal_4();
        obj.halo("andri!");
        obj. halo("adam!");
        obj.halo("patima!");
        obj. halo("rusna!");
    }
    public void halo (String nama){
        System.out.println(" halo, "+ nama);
    }
    
}
// soal 5
public class soal_5 {
    public static void main(String[] args) {
        soal_5 obj = new soal_5();
        int hasil = obj.kali(2,5);
        System.out.println("hasil perkalian =" + hasil);
    }
    public int kali ( int a, int b){
        int hasil = a*b;
        return hasil;
    }
    
}
// soal 6
public class soal_6 {
  
    public static void main(String[] args) {
        int tinggi = 5; 

        for (int i = 1; i <= tinggi; i++) {
            
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
          
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
} 
