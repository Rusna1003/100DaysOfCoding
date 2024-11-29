package rusnakyuttt_;

import java.util.Scanner;

public class RusnaKyuttt_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah siswa (maksimal 10): ");
        int jumlahSiswa = sc.nextInt();
        if (jumlahSiswa < 10) {

            String[] namaSiswa = new String[jumlahSiswa];
            sc.nextLine();
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("masukkan nama siswa ke - : " + (i + 1));
                namaSiswa[i] = sc.next();

            }
            System.out.println("daftar nama siswa");
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println((i + 1) + ". " + namaSiswa[i]);

            }

        } else {

            System.out.println(" tidak di ketahui");
        }

    }
}
