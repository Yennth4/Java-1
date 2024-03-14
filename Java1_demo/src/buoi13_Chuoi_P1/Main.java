package buoi13_Chuoi_P1;
public class Main {

    /**
     * String => Nhap chuoi nextLine, next String có rất nhiều hàm hỗ trợ 
     * 1. Laydo dai cua String 
     *      => length : Lay do dai cua 1 chuoi 
     * 2. Ghep chuoi 
     *      => +
     *      => concat 
     * 3. So sanh 
     *      => == 
     *      => compareTo(Phan biet hoa thuong)
     *      => compareToIgnoreCase ( Khong phan biet hoa thuong)
     *      => equals : Phan biet hoa thuong
     *      => equalsIgnoreCase : Khong phan biet hoa thuong
     * 4. Kiem tra chua : Kiem chuõi 1 có chứa chuõi 2 không
     *      => contains: co phan biet hoa thuong
     * 5. Viet hoa het : toUpperCase
     * 6.Viet thuong het: toLowerCase
     */
    public static void main(String[] args) {
        String str = "MOB1014.03"; // => 1 so dua vao Ascii
//        System.out.println(str.length());
        String str1 = "Java 1";
        // Ghep => MOB1014.01 Java 1
        String result = str.concat(str1);
        String str2 = "mob1014.03";
        // SS
        // C1: compareTo => int
        // Neu ket qua tra ra = 0 => 2 String giong nhau (=)
        // Neu ket qua tra ra > 0 => Chuoi 1 > Chuoi 2
        // Neu ket qua tra ra <= 0 => Chuoi 1 < Chuoi 2
        int ss = str.compareToIgnoreCase(str2);
//        System.out.println(ss);
        // C2: equal
        str.equals(str2); // Boolean : chi ra dc la 2 string giong hoac khac nhau
        str.equalsIgnoreCase(str2);// Khong phan biet hoa thuong
        String str3 ="B";
        System.out.println(str.contains(str3));
        System.out.println(str1.toUpperCase()); // JAVA 1
        System.out.println(str1.toLowerCase()); // java 1

    }
}
