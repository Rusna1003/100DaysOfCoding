import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner Q= new Scanner(System.in);
		int a,b,c,d;
		// operator perkalian
		System.out.print("Masukkan nilai  :");
		a =Q.nextInt();
		
		System.out.print("Masukkan nilai   :");
		b=Q.nextInt();
		a*=b;
		System.out.print(a);
		
		// operator pembagian
		System.out.print("Masukkan nilai :");
		c =Q.nextInt();
		
		System.out.print("Masukkan nilai:");
		d=Q.nextInt();
		c/=d;
		System.out.print(c);
        
		
	
		
	}
}
