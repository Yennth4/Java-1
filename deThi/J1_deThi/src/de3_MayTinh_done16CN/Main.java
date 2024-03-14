package de3_MayTinh_done16CN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLMTService mt = new QLMTService();
        ArrayList<MayTinh> listMT = new ArrayList<>();
        ArrayList<MayTinhMSI> listMTMSI = new ArrayList<>();
        mt.fakeData(listMT);
        int chon;
        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    mt.nhap(listMT);
                    break;
                }
                case 2: {
                    mt.xuat(listMT);
                    break;
                }
                case 3: {
                    mt.timKiemMayTinhBatDauA(listMT);
                    break;
                }
                case 4: {
                    mt.hienThiDSViTriLe(listMT);
                    break;
                }
                case 5: {
                    mt.sapXepTangDanTheoGia(listMT);
                    mt.xuat(listMT);
                    break;
                }
                case 6: {
                    mt.sapXepGiamDanTheoBoNho(listMT);
                    mt.xuat(listMT);
                    break;
                }
                case 7: { 
                    mt.hienThiDSGiaMaxMin(listMT);
                    break;
                }
                case 8: {
                    mt.hienThiDSTenKetThucE(listMT);
                    break;
                }
                case 9: {
                    mt.hienThiDSTenChuaA(listMT);
                    break;
                }
                case 10: {
                    MayTinh kq = mt.timKiemTheoMaNhap(listMT);
                    if (kq != null) {
                        kq.inThongTin();
                    } else {
                        System.out.println("Khong tim thay ma nhap");
                    }
                    break;
                }
                case 11: {
                    mt.xoaTheoMaNhap(listMT);
                    mt.xuat(listMT);
                    break;
                }
                case 12: {
                    mt.timGiaMax(listMT);
                    break;
                }
                case 13: {
                    mt.hienThiTrangThaiTrue(listMT);
                    break;
                }
                case 14: {
                    mt.hienThiTrangThaiFalse(listMT);
                    break;
                }
                case 15: {
                    mt.timKiemHangNhap(listMT);
                    break;
                }
                case 16: {
                    mt.nhapMayTinhMSI(listMTMSI);
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat");
                    break;
                }
                default:
                    System.out.println("Ban nhap sai ");
                    break;
            }
        } while (chon != 0);
    }
}
