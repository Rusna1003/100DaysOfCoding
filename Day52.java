import java.util .Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a= new Scanner (System.in);
		int b = a.nextInt();
		String hasil =(b %2 ==0)? "genap": "ganjil";
		System.out.println(hasil);
		
	}
}
