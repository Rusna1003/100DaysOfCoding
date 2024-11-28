import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan status PNS / Bukan :");
        String status = a.nextLine();
        System.out.print("Masukkan gaji pokok :");
        double gaji = a.nextDouble();
        if (status.equalsIgnoreCase("PNS")) {
            if(gaji >= 2000000 && gaji <= 5000000){
                System.out.println("Gaji bersih : " + (gaji - (gaji * 10 / 100)));
            }else if (gaji >= 5000000){
                System.out.println("Gaji Bersih : " + (gaji - (gaji * 12 / 100 )));
            }else {
                System.out.println("Gaji Bersih : " + (gaji - (gaji * 5 / 100)));
            }
        }else if (status.equalsIgnoreCase("Bukan")){
            if(gaji >= 2000000 && gaji <= 5000000){
                System.out.println("Gaji bersih : " + (gaji - (gaji * 5 /100)));
            }else if (gaji >= 5000000){
                System.out.println("Gaji bersih : " + (gaji - (gaji * 5 /100)));
            }else {
                System.out.println("Gaji bersih : " + gaji);
            }
        }else {
            System.out.println("Status pegawai tidak valid1-");
        }
        
     
    }
}
