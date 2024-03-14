package B8_SinhVien_SinhVienPoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSV = new ArrayList<>();
        ArrayList<SinhVienPoly> listSVPoly = new ArrayList<>();
        QLSinhVienService sinhVienService = new QLSinhVienService();
        sinhVienService.fakeData(listSV);
        int chon;
        do {
            System.out.println("Menu");
            System.out.print("1.Nhap ");
            System.out.print("2.Xuat ");
            System.out.print("3.Tim kiem ma nhap");
            System.out.print("4.Giam dan theo chuyenNganh");
            System.out.print("5.Tang dan theo chuyenNganh");
            System.out.print("6.Nhap && Xuat sinhVienPoly");
            System.out.print("7.Tim kiem ma theo khoang min max");
            System.out.print("8.Tim kiem chuyenNganh chu cuoi la T");
            System.out.print("9.");
            System.out.print("10.");
            System.out.println("0.Thoat");
            System.out.print("Chon de = ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    sinhVienService.nhap(listSV);
                    break;
                }
                case 2: {
                    sinhVienService.xuat(listSV);
                    break;
                }
                case 3: {
                    System.out.print("Ma : ");
                    String ma = sc.nextLine();
                    List<SinhVien> list = sinhVienService.timSVTheoMa(listSV, ma);
                    sinhVienService.xuat((ArrayList<SinhVien>) list);
                    break;
                }
                case 4: {
                    System.out.println("Sap xep giam dan theo chuyenNganh");
                    sinhVienService.giamDanTheoChuyenNganh(listSV);
                    sinhVienService.xuat(listSV);
                    break;
                }
                case 5: {
                    System.out.println("Sap xep tang dan theo chuyenNganh");
                    sinhVienService.tangDanTheoChuyenNganh(listSV);
                    sinhVienService.xuat(listSV);
                    break;
                }
                case 6: {
                    System.out.println("Thong tin sinh vien POLY");
                    sinhVienService.nhapSinhVienPoly(listSVPoly);
                    sinhVienService.xuatSinhVienPoly(listSVPoly);
                    break;
                }
                case 7: {
                    System.out.println("Tim kiem maSV theo khoang min max");
                    System.out.print("Min = ");
                    String min = sc.nextLine();
                    System.out.print("Max = ");
                    String max = sc.nextLine();
                    List<SinhVien> list = sinhVienService.timMaTheoMaxMin(listSV, min, max);
                    sinhVienService.xuat((ArrayList<SinhVien>) list);
                    break;
                }
                case 8: {
                    System.out.println("Tim kiem chuyenNganh chu cuoi la T");
                    sinhVienService.timChuyenNganhT(listSV);
                    break;
                }
                case 9: {
                    System.out.println("Liet ke top 3 ma max");
                    sinhVienService.lietKeTop3MaMax(listSV);
                    break;
                }
                case 10: {
                    System.out.println("Liet ke top 1 ma max co chu N trong ten");
                    sinhVienService.lietKeTop1MaMaxCoChuCaiNTrongHoTen(listSV);

                    break;
                }
                case 0: {
                    break;
                }
                default:
                    break;
            }
        } while (chon != 0);
    }
}
