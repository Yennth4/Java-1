/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi11_ChuaBaiMau1_LyThuyetFOR;

import buoi02_KieuDuLieuVaNhapXuat.P2_CodingConvention;
import buoi10_MangDong.DienThoai;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * Service > Chứa các chức năng của menu 
 * Nen de public vi sang main minh can dung
 */
public class P3_DienThoaiService_LyThuyetFor {

    private ArrayList<P2_DienThoai> dienThoaiService = new ArrayList<>();

    public void nhap(ArrayList<P2_DienThoai> listDienThoai) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma = ");
        int ma = Integer.valueOf(sc.nextLine());

        System.out.print("Ten = ");
        String ten = sc.nextLine();
        System.out.print("Hang = ");
        String hang = sc.nextLine();
        System.out.print("Mau = ");
        String mau = sc.nextLine();
        System.out.print("Bo nho (GB) = ");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.print("Gia (VND) = ");
        int gia = Integer.valueOf(sc.nextLine());

        P2_DienThoai dienThoai = new P2_DienThoai(ma, ten, hang, mau, boNho, gia);
        listDienThoai.add(dienThoai);
    }

    public void xuat(ArrayList<P2_DienThoai> listDienThoai) {
        /*
        // C1: for each kh co viTri can vi tri thi dung for thuong 
        for (P2_DienThoai p2_DienThoai : listDienThoai) {
            p2_DienThoai.inThongTin();
            System.out.println("In thanh cong");
        }
        
        // C2:  for thuong
        for (int i = 0; i < listDienThoai.size(); i++) {
            
            // gia tri cua vi tri i 
           P2_DienThoai dienThoai = listDienThoai.get(i);  // get(i) : tra ve 1 doiTuong len minh phai tao ra 1 doi tuong de hung no
           dienThoai.inThongTin();
        }
        
        // C3: for each + lamda(->) > Java 8 > trong forEach cua lamda thi truyen vao tenBien cua doiTuong
        listDienThoai.forEach(dt -> dt.inThongTin());
        
         */
        // C4: for each + methodrefences (tenClassDoiTuong :: inThongTin)> Java 8 > trong forEach truyen vao tenClas
        listDienThoai.forEach(P2_DienThoai::inThongTin);
    }

    public void timDienThoaiTheoGia() {

    }

    public void timDienThoaiTheoBoNho() {

    }

    public void sapXepGiamDanTheoTen(ArrayList<P2_DienThoai> listDienThoai) {
        listDienThoai.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    public void sapXepTangDanTheoGia(ArrayList<P2_DienThoai> listDienThoai) {

        listDienThoai.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia();
            // vi compateTo chi sap xep cho String > int kh dc nen co 2 cach : 1 la lay o1 - o2 : < 0 => o1 > o2
            // cach con lai la ep kieu ve String roi compareTo
        });

    }

    public void xoaTheoViTri(ArrayList<P2_DienThoai> listDT, int index) {
        listDT.remove(index);
    }

    public void xoaTheoMa() {

    }

}
