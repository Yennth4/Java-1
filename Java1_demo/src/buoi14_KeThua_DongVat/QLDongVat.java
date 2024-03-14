package buoi14_KeThua_DongVat;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDongVat {

    private Scanner scan = new Scanner(System.in);

    public void nhap(ArrayList<DongVat> listDV) {
        while (true) {
            System.out.print("Ma = ");
            String ma = scan.nextLine();
            System.out.print("Ten = ");
            String ten = scan.nextLine();
            System.out.print("Gioi tinh = ");
            int gioiTinh = Integer.valueOf(scan.nextLine());
            System.out.print("Can nang = ");
            int canNang = Integer.valueOf(scan.nextLine());

            DongVat dv = new DongVat(ma, ten, gioiTinh, canNang);
            listDV.add(dv);

            System.out.println("Muốn nhập tiếp ko ? (1: Yes - 0: No)");
            int chon = Integer.valueOf(scan.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void hienThiThongTin(ArrayList<DongVat> listDV) {
        listDV.forEach(DongVat::inThongTin);
        listDV.forEach(dv -> dv.inThongTin());
    }

    public void timTenBatDauChuT(ArrayList<DongVat> listDV) {
        for (DongVat dongVat : listDV) {
            if (dongVat.getTen().startsWith("t") || dongVat.getTen().startsWith("T")) {
                dongVat.inThongTin();
            }
        } // endsWith : tìm chữ cuối
        // contains: tìm chữ giữa
        // startsWith: tìm chữ đầu 
    }

    public void nhapXuatMeo(ArrayList<Meo> listMeo) {
        while (true) {
            System.out.print("Ma = ");
            String ma = scan.nextLine();
            System.out.print("Ten = ");
            String ten = scan.nextLine();
            System.out.print("Gioi tinh = ");
            int gioiTinh = Integer.valueOf(scan.nextLine());
            System.out.print("Can nang = ");
            int canNang = Integer.valueOf(scan.nextLine());
            System.out.print("Tieng Keu = ");
            String tiengKeu = scan.nextLine();

            Meo meo = new Meo(tiengKeu, ma, ten, gioiTinh, canNang);
            listMeo.add(meo);
            System.out.println("Muốn nhập tiếp ko ? (1: Yes - 0: No)");
            int chon = Integer.valueOf(scan.nextLine());
            if (chon == 0) {
                break;
            }
        }
        
        listMeo.forEach(Meo :: inThongTin);
    }

    public void fakeData(ArrayList<DongVat> listDV) {
        listDV.add(new DongVat("1", "Meo", 1, 12));
        listDV.add(new DongVat("2", "De", 2, 10));
        listDV.add(new DongVat("3", "Ga", 1, 20));
        listDV.add(new DongVat("4", "Thit", 2, 122));
        listDV.add(new DongVat("5", "Lon", 1, 123));
    }
    public void fakeData2(ArrayList<Meo> listMeo) {
        listMeo.add(new Meo("Meomeo", "1", "Meo",1, 12));
        listMeo.add(new Meo("Meomeo2", "2", "Meo2",2, 10));
        listMeo.add(new Meo("Meomeo3", "3", "Meo3",0, 11));
        listMeo.add(new Meo("Meomeo4", "4", "Meo4",2, 14));
        listMeo.add(new Meo("Meomeo5", "5", "Meo5",1, 13));
    }
}
