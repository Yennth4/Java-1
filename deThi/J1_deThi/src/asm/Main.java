package asm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai> listDienThoai = new ArrayList<>();
        QuanLyDienThoaiService dienThoaiService = new QuanLyDienThoaiService();
        dienThoaiService.fakeData(listDienThoai);
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("3.Hien thi ds chua ma nhap tu ban phim");
            System.out.println("4.Sap xep tang dan theo ten");
            System.out.println("5.Xoa theo ma nhap");
            System.out.println("6.Top 3 gia dien thoai nho nhat");
            System.out.println("7.In thong tin Ip fix cung");
            System.out.println("0.Thoat");
            System.out.print("Moi chon = ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    dienThoaiService.nhap(listDienThoai);
                    break;
                }
                case 2: {
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }
                case 3: {
                    dienThoaiService.hienThiDanhSachChuaMaNhapTuBanPhim(listDienThoai);
                    break;
                }
                case 4: {
                    dienThoaiService.tangDanTheoTen(listDienThoai);
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }
                case 5: {
                    dienThoaiService.xoaTheoMaNhap(listDienThoai);
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }
                case 6: {
                    dienThoaiService.top3GiaMin(listDienThoai);
                    break;
                }
                case 7: {
                    dienThoaiService.inThongTinIPhone();
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat chuong trinh");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Ban da nhap sai  Moi nhap lai!!!");
                    break;
            }
        } while (chon != 0);
    }
}
