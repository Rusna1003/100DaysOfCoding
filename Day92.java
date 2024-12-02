package pola_persegi;

import java.util.Scanner;

public class Pola_V {

   
      public static void main(String[] args) {
          Scanner sc =  new Scanner (System.in);
          System.out.print("masukkan tinggi :");
        int tinggi = sc.nextInt(); 
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < (2 * tinggi - 1); j++) {
                if (j == i || j == (2 * tinggi - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
