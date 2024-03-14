package de4_SinhVien_done10CN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haiyenng4
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSV = new ArrayList<>();
        SinhVienService sv = new SinhVienService();
        sv.fakeData(listSV);
        int chon;
        do {
            System.out.print("Nhap de : ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    sv.nhap(listSV);
                    break;
                }
                case 2: {
                    sv.xuat(listSV);
                    break;
                }
                case 3: {
                    sv.timKiemTenBatDauChuA(listSV);
                    break;
                }
                case 4: {
                    sv.diemTBMax(listSV);
                    break;
                }
                case 5: {
                    SinhVien kq = sv.tenNhapTuBanPhim(listSV);
                    if (kq != null) {
                        System.out.println(kq.toString());
                    } else {
                        System.out.println("Khong tim thay ten nhap");
                    }
                    break;
                }
                case 6: {
                    sv.xoaMaNhap(listSV);
                    break;
                }
                case 7: {
                    ArrayList<SinhVien> kq = sv.timSinhVienTuoiMaxMin(listSV);
                    if (!kq.isEmpty()) {
                        for (SinhVien sinhVien : kq) {
                            System.out.println(sinhVien.toString());
                        }
                    } else {
                        System.out.println("Khong tim thay khoang max min");
                    }
                    break;
                }
                case 8: {
                    ArrayList<SinhVien> kq = sv.timSinhVienMaMaxMin(listSV);
                    if (!kq.isEmpty()) {
                        for (SinhVien sinhVien : kq) {
                            System.out.println(sinhVien.toString());
                        }
                    } else {
                        System.out.println("Khong tim thay khoang max min");
                    }
                    break;
                }
                 case 9:
                    System.out.print("Nhập mã nhân viên: ");
                    String maNV = sc.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    String tenNV = sc.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    int tuoiNV = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nhập giới tính nhân viên (Nam/Nữ): ");
                    String gioiTinhNVStr = sc.nextLine();
                    boolean gioiTinhNV = gioiTinhNVStr.equalsIgnoreCase("Nam");
                    System.out.print("Nhập quê quán nhân viên: ");
                    String queQuanNV = sc.nextLine();
                    System.out.print("Nhập lương theo ngày của nhân viên: ");
                    double luongTheoNgayNV = sc.nextDouble();
                    NhanVien nhanVien = new NhanVien(maNV, tenNV, tuoiNV, gioiTinhNV, queQuanNV, luongTheoNgayNV);
                     System.out.println(nhanVien.toString());
                    break;
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        } while (chon != 0);
    }

}
