package de4_SinhVien_done10CN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haiyenng4
 */
public class SinhVienService {

    private Scanner sc = new Scanner(System.in);

    public void fakeData(ArrayList<SinhVien> listSV) {
        listSV.add(new SinhVien(1, 5, 2, "1", "ai", 1, true, "HN"));
        listSV.add(new SinhVien(1, 5, 7, "2", "Kely", 2, false, "MD"));
        listSV.add(new SinhVien(1, 5, 3, "3", "Manh", 3, false, "CG"));
        listSV.add(new SinhVien(1, 5, 9, "4", "Bai", 4, true, "XT"));
        listSV.add(new SinhVien(1, 5, 1, "5", "Lan", 5, false, "TX"));
    }

    public void nhap(ArrayList<SinhVien> listSV) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Ten = ");
            String ten = sc.nextLine();
            System.out.print("Tuoi = ");
            int tuoi = Integer.valueOf(sc.nextLine());
            System.out.print("GioiTinh = ");
            boolean gT = Boolean.valueOf(sc.nextLine());
            System.out.print("Quequan = ");
            String queQuan = sc.nextLine();
            System.out.print("Toan = ");
            double toan = Double.valueOf(sc.nextLine());
            System.out.print("Ly = ");
            double ly = Double.valueOf(sc.nextLine());
            System.out.print("Hoa = ");
            double hoa = Double.valueOf(sc.nextLine());

            SinhVien sv = new SinhVien(toan, ly, hoa, ma, ten, tuoi, gT, queQuan);
            listSV.add(sv);
            System.out.println("Nhap nua 0? : ");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                System.out.println("Ban da dung nhap");
                break;
            }
        }
    }

    public void xuat(ArrayList<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            System.out.println(sinhVien.toString());
            System.out.println("");
        }
    }

    public void timKiemTenBatDauChuA(ArrayList<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().toLowerCase().startsWith("a")) {
                System.out.println(sinhVien.toString());
                System.out.println("");
            }
        }
    }

    public void diemTBMax(ArrayList<SinhVien> listSV) {
        double diemTBMax = listSV.get(0).diemTB();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.diemTB() > diemTBMax) {
                diemTBMax = sinhVien.diemTB();
            }
        }

        System.out.println("Sinh Vien Co diem TB lon nhat la : ");
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).diemTB() == diemTBMax) {
                System.out.println("Vi tri: " + i + ", " + listSV.get(i).toString());
            }
        }
    }

    public SinhVien tenNhapTuBanPhim(ArrayList<SinhVien> listSV) {
        System.out.print("Nhap ten can tim: ");
        String ten = sc.nextLine();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTen().equalsIgnoreCase(ten)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void xoaMaNhap(ArrayList<SinhVien> listSV) {
        System.out.print("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        boolean kq = false;
        ArrayList<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getMa().equalsIgnoreCase(ma)) {
                list.add(sinhVien);
                kq = true;
            }
        }
        if (kq) {
            listSV.removeAll(list);
            System.out.println("Da xoa ma nhap");
        } else {
            System.out.println("Kh tim thay ma");
        }
    }

    public ArrayList<SinhVien> timSinhVienTuoiMaxMin(ArrayList<SinhVien> listSV) {
        System.out.print("Min = ");
        int min = Integer.valueOf(sc.nextLine());
        System.out.print("Max = ");
        int max = Integer.valueOf(sc.nextLine());

        ArrayList<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTuoi() >= min && sinhVien.getTuoi() <= max) {
                list.add(sinhVien);
            }
        }
        return list;
    }

    public ArrayList<SinhVien> timSinhVienMaMaxMin(ArrayList<SinhVien> listSV) {
        System.out.print("Min = ");
        String min = sc.nextLine();
        System.out.print("Max = ");
        String max = sc.nextLine();

        ArrayList<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getMa().compareToIgnoreCase(min) >= 0 && sinhVien.getMa().compareToIgnoreCase(max ) <= 0) {
                list.add(sinhVien);
            }
        }
        return list;
    }
}
