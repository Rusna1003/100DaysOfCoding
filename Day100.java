import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DAY100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String namaPengguna = scanner.nextLine();
        
        ZonedDateTime sekarang = ZonedDateTime.now(ZoneId.of("Asia/Makassar"));
        LocalTime waktuSekarang = sekarang.toLocalTime();

        String salam;
        if (waktuSekarang.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi";
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        System.out.println("==================================");
        System.out.println(salam + ", " + namaPengguna);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("==================================");

    }
}
