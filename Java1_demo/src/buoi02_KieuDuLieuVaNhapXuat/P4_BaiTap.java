/*

1. Nhập tên , diaChi , nganhHoc , truongHoc , của bff và in 
2. Ten , tuoi , diaChi , chieuCao , canNang , nganhHoc , truongHoc cua bản thân và in ra 
 */
package buoi02_KieuDuLieuVaNhapXuat;

import java.util.Scanner;

public class P4_BaiTap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ten: ");
        String ten = sc.nextLine();
//        
//        System.out.println("Tuoi: ");
//        int tuoi = sc.nextInt();
//        sc.nextLine();
//                
        System.out.print("Sdt: ");
        String sdt = sc.nextLine();
        Integer.parseInt(sdt);

        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine();

        System.out.println(" ");
        System.out.println("Ten: "+ten);
        System.out.println("Sdt: "+sdt);
        System.out.println("Dia chi: "+diaChi);
    }
}
