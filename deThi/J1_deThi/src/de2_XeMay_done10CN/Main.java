package de2_XeMay_done10CN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XeMay> listXM = new ArrayList<>();
        ArrayList<XeSo> listXS = new ArrayList<>();
        QLXM xmService = new QLXM();
        xmService.fakeData(listXM);
        int chon;
        do {
            System.out.print("Nhập lựa chọn: ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    xmService.nhap(listXM);
                    break;
                }
                case 2: {
                    xmService.xuat(listXM);
                    break;
                }
                case 3: {
                    xmService.timMaTheoKhoangMinMax(listXM);
                    break;
                }
                case 4: {
                    XeMay kq = xmService.timMaNhap(listXM);
                    if (kq != null) {
                        System.out.println(kq.toString());
                    } else {
                        System.out.println("Khong tim thay ma nhap");
                    }
                    break;
                }
                case 5: {
                    xmService.giamDanTheoGia(listXM);
                    xmService.xuat(listXM);
                    break;
                }
                case 6: {
                    xmService.xoa(listXM);
                    break;
                }
                case 7: {
                    xmService.timXeGiaNhoHon50(listXM);
                    break;
                }
                case 8: {
                    xmService.tangDanTheoMa(listXM);
                    xmService.xuat(listXM);
                    break;
                }
                case 9: {
                    xmService.viTriCacXeCoGiaTienNhoNhat(listXM);
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat");
                    break;
                }
                default:
                    System.out.println("Ban nhap sai Moi nhap lai!!!");
                    break;
            }

        } while (chon != 0);
    }
}
