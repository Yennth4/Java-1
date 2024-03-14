package B7_MayBay_9CauHoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLMayBayService mayBayService = new QLMayBayService();
        ArrayList<MayBay> listMayBay = new ArrayList<>();
        mayBayService.fakeData(listMayBay);
        int chon;
        do {
            System.out.println("Menu");
            System.out.print("Chon de = ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    mayBayService.nhapMayBay(listMayBay);
                    break;
                }
                case 2: {
                    mayBayService.xuatMayBay(listMayBay);
                    break;
                }
                case 3: {
                    System.out.print("Min = ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.print("Max = ");
                    int max = Integer.valueOf(sc.nextLine());
                    List<MayBay> listGhe = mayBayService.timKiemMaxMinTheoSoGhe(listMayBay, min, max);
                    mayBayService.xuatMayBay((ArrayList<MayBay>) listGhe);
                    break;
                }
                case 4: {
                    mayBayService.giamDanSoGhe(listMayBay);
                    mayBayService.xuatMayBay(listMayBay);
                    break;
                }
                case 5: {
                    System.out.print("Ma = ");
                    String ma = sc.nextLine();
                    mayBayService.xoaTheoMa(listMayBay, ma);
                    System.out.println("Xoa " + ma + " thanh cong");
                    break;
                }
                case 6: {
                    mayBayService.tangDanMa(listMayBay);
                    mayBayService.xuatMayBay(listMayBay);
                    break;
                }
                case 7: {
                    mayBayService.timKiemHangE(listMayBay);
                    break;
                }
                case 8: {
                    mayBayService.lietKeTop3MayBayCoSoGheLonNhatCuaHangBoeing(listMayBay);
                    break;
                }
                case 9: {
                    
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat chuong trinh");
                    break;
                }
                default:
                    System.out.println("Chuc nang ko co trong chuong trinh");
                    break;
            }
        } while (chon != 0);
    }
}
