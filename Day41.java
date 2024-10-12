
		
		
		 
		
		
		
		
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
public class Day41 {
	public static void main(String[] args) {
		
		int a = 150;
		String b = Integer.toString(a);
		System.out.println("hasil konversi integer ke String "+b);
		int c= Integer.valueOf(b);
		System.out.println("hasil konversi String kembali ke integer "+c);
		
		int d= 75;
		double e = d;
		System.out.println("nilai int "+ d);
		System.out.println("nilai setelah typecasting ke double "+e);
		
		BigInteger R = new BigInteger("98765432109876543210");
		BigInteger U = new BigInteger ("12345678901234567890");
		BigInteger jumlah = R.add(U);
		BigInteger perkalian = R.multiply(U);
		System.out.println("penjumlahan BigInteger "+ jumlah);
		System.out.println("perkalian BigInteger "+ perkalian);
		
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan panjang persegi panjang :");
		int Unn = input.nextInt();
		System.out.println("Masukkan lebar persegi panjang ");
		int Pp=input.nextInt();
		double Ss= Unn*Pp;
		double Dd= 2* (Unn+Pp);
		System.out.println("luas persegi panjang :"+ Ss );
		System.out.println("keliling persrgi panjang :"+Dd);
	
		
		
		
		 
		
		
		
		
	}
}
