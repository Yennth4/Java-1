package buoi10_MangDong;

import java.util.Scanner;

public class P3_MainDienThoai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma: ");
        String ma = sc.nextLine();
        
        System.out.print("Ten: ");
        String ten = sc.nextLine();
        System.out.print("Dong May: ");
        String dongMay = sc.nextLine();
        System.out.print("Gia = ");
        float gia = Float.valueOf(sc.nextLine());
        System.out.print("Dung luong = ");
        int dungLuong = Integer.valueOf(sc.nextLine());
        System.out.print("Mau Sac: ");
        String mauSac = sc.nextLine();
        
        DienThoai dienThoai = new DienThoai(ma, ten, dongMay, gia, dungLuong, mauSac);
        System.out.println(dienThoai.hienThi());
    }
}
