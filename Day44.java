package Day44.java;

import java.util.Scanner;


public class Rusna {

        public static void main(String[] args) {
       Scanner rusna = new Scanner(System.in);
            System.out.println("masukan angka pertama");
       int a = rusna.nextInt();
            System.out.println("masukan angka kedua");
       int b = rusna.nextInt();
       
       if(a>=b && a<=b){
           System.out.println("angka a dan b sama besar");
       }
       else if(a>b){
           System.out.println("angka a lebih besar dari b");
       }
       else if(a<b){
           System.out.println("angka a lebih kecil dari b ");
       }
    }
    
}
