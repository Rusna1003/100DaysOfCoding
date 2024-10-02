
package Day31; 

public class java {
    public static void main(String[] args) {
        // konversi String ke tipe data primitif
        String Bulat = "120";
        byte iniByte = Byte.parseByte(Bulat);
        short iniShort = Short.parseShort(Bulat);
        int iniInt = Integer.parseInt(Bulat);
        long iniLong = Long.parseLong(Bulat);
        
        
        String Desimal = "10.03";
        float iniFloat = Float.parseFloat(Desimal);
        double iniDouble = Double.parseDouble(Desimal);
        
        String Strbool = "False";
        boolean iniBoolean = Boolean.parseBoolean(Strbool);
        
        String Caracter = "Rusna";
        char iniChar = Caracter.charAt(3);
        
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(iniBoolean);
        System.out.println(Caracter);
        
        
        
    }
    
    }
    

