public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan bulan lahir 1-12 ");
        int bulan = input.nextInt();
        System.out.println("masukan tangga lahir 1-30 ");
        int tanggal = input.nextInt();
        if((bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 9 || bulan == 11)&&(tanggal >=1 && tanggal <= 31)){
       }else if((bulan == 4 || bulan == 6 || bulan == 8 || bulan == 10 || bulan == 12)&&(tanggal >1 && tanggal <= 30)){
       }else if((bulan == 2)&&(tanggal >= 1 && tanggal <= 28)){  
       }else{
            System.out.println("tanggal atau bulan tidak valid");
            return;
       }
        String zodiac = null;
        switch(bulan){
            case 1:
                if(tanggal >= 20){
                    zodiac = "aquarius";
                }else{
                    zodiac = "capricorn";
                }
                break;
            case 2:
                if(tanggal >= 19){
                    zodiac = "pisces";
                }else{
                    zodiac = "aquarius";
                }
                break;
            case 3:
                if(tanggal >= 21){
                    zodiac = "aries";
                }else{
                    zodiac = "pisces";
                }
                break;
            case 4:
                if(tanggal >= 20){
                    zodiac = "taurus";
                }else{
                    zodiac = "aries";
                }
                break;
            case 5:
                if(tanggal >= 21){
                    zodiac = "gemini";
                }else{
                    zodiac = "taurus";
                }
                break;
            case 6:
                if(tanggal >= 21){
                    zodiac = "cancer";
                }else{
                    zodiac = "gemini";
                }
                break;
            case 7:
                if(tanggal >= 23){
                    zodiac = "leo";
                }else{
                    zodiac = "cancer";
                }
                break;
            case 8:
                if(tanggal >= 23){
                    zodiac = "virgo";
                }else{
                    zodiac = "leo";
                }
                break;
            case 9:
                if(tanggal >= 23){
                    zodiac = "libra";
                }else{
                    zodiac = "virgo";
                }
                break;
            case 10:
                if(tanggal >= 23){
                    zodiac = "scorpio";
                }else{
                    zodiac = "libra";
                }
                break;
            case 11:
                if(tanggal >= 22){
                    zodiac = "sagitarius";
                }else{
                    zodiac = "scorpio";
                }
                break;
            case 12:
                if(tanggal >= 22){
                    zodiac = "capricorn";
                }else{
                    zodiac = "sagitarius";
                }
                break;
            default:
                System.out.println("bulan tidak valid");
                return;
        }
        System.out.println("maka zodiak kamu adalah "+ zodiac);
              
    }
}
