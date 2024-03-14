package buoi11_ChuaBaiMau1_LyThuyetFOR;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_MainDienThoai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P3_DienThoaiService_LyThuyetFor dienThoaiService = new P3_DienThoaiService_LyThuyetFor();
        ArrayList<P2_DienThoai> listDienThoai = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n    Menu    ");
            System.out.println("1.Nhap thong tin dien thoai");
            System.out.println("2.In thong tin");
            System.out.println("3.Tim theo gia");
            System.out.println("4.Tim theo bo nho");
            System.out.println("5.Sap xep giam dan");
            System.out.println("6.Sap xep tang dan");
            System.out.println("7.Xoa dien thoai theo vi tri");
            System.out.println("8.Xoa dien thoai theo ma");
            System.out.println("0.Thoat");
            System.out.print("Moi nhap lua chon : ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    System.out.println("Bai 1 : Nhap thong tin dien thoai");
                    dienThoaiService.nhap(listDienThoai);
                    break;
                }

                case 2: {
                    System.out.println("Bai 2 : In thong tin");;
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }

                case 3: {
                    System.out.println("Bai 3 : Tim theo gia");

                    break;
                }

                case 4: {
                    System.out.println("Bai 4 : Tim theo bo nho");

                    break;
                }

                case 5: {
                    dienThoaiService.sapXepGiamDanTheoTen(listDienThoai);
                    System.out.println("Bai 5 : Sap xep giam dan");
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }

                case 6: {
                    dienThoaiService.sapXepTangDanTheoGia(listDienThoai);
                    System.out.println("Bai 6 : Sap xep tang dan");
                    dienThoaiService.xuat(listDienThoai);
                    break;
                }

                case 7: {
                    System.out.println("Bai 7 : Xoa dien thoai theo vi tri");
                    System.out.print("Nhap vi tri can xoa = ");
                    int viTri = Integer.valueOf(sc.nextLine());
                    dienThoaiService.xoaTheoViTri(listDienThoai, viTri);
                    System.out.println("Xoa thanh cong");
                    break;
                }

                case 8: {
                    System.out.println("Bai 8 : Xoa dien thoai theo ma");

                    break;
                }

                case 0:
                    System.out.println("Ban da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Sai chuc nang !!! Moi nhap lai.");
                    break;
            }
        } while (chon != 0);
    }
}
