package buoi02_KieuDuLieuVaNhapXuat;

import java.util.Scanner; // khai báo thư viện trong Java dùng import - C: include

/**
 * Nhập dữ liệu từ bàn phím 
    * Trong C dùng : scanf 
    * Trong Java dùng : Scanner
 */
public class P2_NhapXuat {

    public static void main(String[] args) {
        Scanner tenBien = new Scanner(System.in);  // cú pháp khai báo scanner
/*        System.out.print("Nhap ten: ");

        // Co 2 cach nhap String 
        // C1 : .next();
        String name = tenBien.next();  // khi đến khoảng trắng sẽ kh đọc được nữa và sẽ trôi lệnh k nhập được lệnh sau 

        //C2 : .nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = tenBien.nextLine();

        // In ra > sout 
        System.out.println("Ten : " + name);
        System.out.println("Dia chi: " + diaChi);
*/
        System.out.print("Nhap tuoi: ");
        int tuoi = tenBien.nextInt();
        double canNang = tenBien.nextDouble();
        float number = tenBien.nextFloat();
        long number1 = tenBien.nextLong(); // dùng Long trong bài toán vài tỉ , dùng cho ngân hàng  
                
        System.out.println("Tuoi cua ban la: "+tuoi);
        System.out.println("Can nang: "+canNang);
        System.out.println("Number: "+number);
        System.out.println("Number1: "+number1);
    }
}
