package kalkulator_sederhanaa;

import java.util.Scanner;

public class Kalkulator_sederhanaa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("masukkan pertama: ");
            int a = sc.nextInt();

            System.out.print("masukkan kedua: ");
            int b = sc.nextInt();

            System.out.print("pilih operasi (+, -, *, /): ");
            char operasi = sc.next().charAt(0);

            int hasil = 0;
            switch (operasi) {
                case '+':
                    hasil = a + b;
                    break;
                case '-':
                    hasil = a - b;
                    break;
                case '*':
                    hasil = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        hasil = a / b;
                    } else {
                        System.out.println("tidak di temukan");
                        return;
                    }
                    break;
                default:

                    return;
           }

            System.out.println("Hasil: " + hasil);
        }
    }

}
