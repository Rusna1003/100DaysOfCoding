public class Day72 {
    public static void hitungMundur(int n){
        if(n <= -1){
            return;
        }else{
            System.out.println(n);
            hitungMundur(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int angka = 10;
        hitungMundur(angka);
    }
    
}
