package pola_persegi;

import java.util.Scanner;

public class Persegi_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan lebar :");
        int lebar = sc.nextInt();

        System.out.print("masukkan tinggi :");
        int tinggi = sc.nextInt();
        for (int a = 0; a < lebar; a++) {
            for (int b = 0; b < tinggi; b++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("============");
        System.out.print("masukkan tinggi  : ");
        int tinggi_ = sc.nextInt();

        System.out.print("masukkan samping :");
        int samping = sc.nextInt();

        for (int c = 0; c < tinggi_; c++) {
            for (int d = 0; d < samping; d++) {
                System.out.print("#");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
