package Day90;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("modal awal :");
        double modal_awal = sc.nextInt();
        System.out.print("lama investasi :");
        int lama_investasi = sc.nextInt();
        double modalakhir= modal_awal;
        for (int tahun = 1; tahun <= lama_investasi; tahun++) {
            double untung = modalakhir * 0.05;
            modalakhir += untung;
            System.out.println("tahun " + tahun + "modal =" + modalakhir + "untung =" + untung);

        }
        System.out.println("total modal setelah " + lama_investasi + "tahun" + modalakhir);

    }

}
