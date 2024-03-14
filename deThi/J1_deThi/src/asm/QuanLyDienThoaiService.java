package asm;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDienThoaiService {

    private Scanner sc = new Scanner(System.in);

    public void nhap(ArrayList<DienThoai> listDienThoai) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Ten = ");
            String ten = sc.nextLine();
            System.out.print("Gia = ");
            int gia = Integer.valueOf(sc.nextLine());

            DienThoai dienThoai = new DienThoai(ma, ten, gia);
            listDienThoai.add(dienThoai);
            System.out.println("Nhap tiep 0 ? <1:Y - 0:No> = ");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                System.out.println("Ban da dung vong lap !");
                break;
            }
        }
    }

    public void xuat(ArrayList<DienThoai> listDienThoai) {
        for (DienThoai dienThoai : listDienThoai) {
            System.out.println(dienThoai.inThongTin());
            System.out.println("");
        }
    }

    public void hienThiDanhSachChuaMaNhapTuBanPhim(ArrayList<DienThoai> listDienThoai) {
        System.out.print("Nhap ma = ");
        String ma = sc.nextLine();

        boolean kq = false;
        for (DienThoai dienThoai : listDienThoai) {
            if (dienThoai.getMa().equalsIgnoreCase(ma)) {
                System.out.println(dienThoai.inThongTin());
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay ma can hien thi");
        }
    }

    public void tangDanTheoTen(ArrayList<DienThoai> listDienThoai) {
        listDienThoai.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
    }

    public void xoaTheoMaNhap(ArrayList<DienThoai> listDienThoai) {
        System.out.print("Nhap ma = ");
        String ma = sc.nextLine();

        boolean kq = false;
        for (DienThoai dienThoai : listDienThoai) {
            if (dienThoai.getMa().equalsIgnoreCase(ma)) {
                listDienThoai.remove(dienThoai);
                System.out.println("Da xoa ma " + ma);
                kq = true;
                break;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay ma can xoa");
        }
    }

    public void top3GiaMin(ArrayList<DienThoai> listDienThoai) {
        if (listDienThoai.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        listDienThoai.sort((o1, o2) -> o1.getGia() - o2.getGia());
        int dem = Math.min(listDienThoai.size(), 3);
        for (int i = 0; i < dem; i++) {
            System.out.println(listDienThoai.get(i).inThongTin());
        }
    }

    public void fakeData(ArrayList<DienThoai> listDienThoai) {
        listDienThoai.add(new DienThoai("1", "Ma1", 10));
        listDienThoai.add(new DienThoai("2", "Ma2", 20));
        listDienThoai.add(new DienThoai("3", "Ma3", 30));
        listDienThoai.add(new DienThoai("4", "Ma4", 40));
        listDienThoai.add(new DienThoai("5", "Ma5", 50));
    }

    public void inThongTinIPhone() {
        Iphone ip = new Iphone(256, "Vang", "6", "Ma6", 60);
        System.out.println(ip.inThongTin());
    }
}
