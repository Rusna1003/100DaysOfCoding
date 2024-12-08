package Day98;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka pertama :");
        int x = sc.nextInt();
        System.out.print("masukkan angka kedua :");
        int y = sc.nextInt();
        int jumlah = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < y) {
                    System.out.print(" + ");
                }
                jumlah += i;
            }

        }
        System.out.print("= " + jumlah);
    }
}
