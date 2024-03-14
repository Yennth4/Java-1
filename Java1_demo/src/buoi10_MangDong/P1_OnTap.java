package buoi10_MangDong;

import java.util.Scanner;

public class P1_OnTap {
    public static void main(String[] args) {
//        P2_PhongHoc phongHoc = new P2_PhongHoc("PH21390", "NguyenHaiYen", "F406", 1.0, true);
//        phongHoc.display();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap toa: ");
        String toa = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        double dienTich = Double.valueOf(sc.nextLine());
        System.out.print("Nhap trang thai (Du slot thi nhap true , het slot thi nhap false): ");
        boolean trangThai = sc.nextBoolean();
        
        P2_PhongHoc phongHoc = new P2_PhongHoc(ma, ten, toa, dienTich, trangThai);
        System.out.println(phongHoc.display());
        
    }
}
