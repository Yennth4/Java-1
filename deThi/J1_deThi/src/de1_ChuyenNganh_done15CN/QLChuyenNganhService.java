package de1_ChuyenNganh_done15CN;

import java.util.ArrayList;
import java.util.Scanner;

public class QLChuyenNganhService {

    private Scanner sc = new Scanner(System.in);

    public void fakeData(ArrayList<ChuyenNganh> listChuyenNganh) {
        listChuyenNganh.add(new ChuyenNganh("1", "01", "1", "0", 2023, true));
        listChuyenNganh.add(new ChuyenNganh("2", "02", "2", "1", 2028, false));
        listChuyenNganh.add(new ChuyenNganh("3", "03", "3", "1", 2020, true));
        listChuyenNganh.add(new ChuyenNganh("4", "04", "4", "0", 2022, false));
        listChuyenNganh.add(new ChuyenNganh("5", "05", "5", "1", 2021, true));
    }

    public void nhap(ArrayList<ChuyenNganh> listChuyenNganh) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Ten = ");
            String ten = sc.nextLine();
            System.out.print("Chu nhiem = ");
            String chuNhiem = sc.nextLine();
            System.out.print("Mo ta = ");
            String moTa = sc.nextLine();
            System.out.print("Nam thanh lap = ");
            int namThanhLap = Integer.valueOf(sc.nextLine());
            System.out.print("Trang Thai = ");
            boolean trangThai = Boolean.valueOf(sc.nextLine());

            ChuyenNganh chuyenNganh = new ChuyenNganh(ma, ten, chuNhiem, moTa, namThanhLap, trangThai);
            listChuyenNganh.add(chuyenNganh);

            System.out.print("Nhap nua 0?");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                System.out.println("Ban da dung nhap");
                break;
            }
        }
    }

    public void xuat(ArrayList<ChuyenNganh> listChuyenNganh) {
        listChuyenNganh.forEach(ChuyenNganh::inThongTin);
    }
//3.

    public void timBatDauBangE(ArrayList<ChuyenNganh> listChuyenNganh) {
        boolean ketQua = false;
        for (ChuyenNganh chuyenNganh : listChuyenNganh) {
            if (chuyenNganh.getTen().toLowerCase().startsWith("e")) {
                chuyenNganh.inThongTin();
                System.out.println("");
                ketQua = true;
            }
        }
        if (!ketQua) {
            System.out.println("Khong tim thay chu E nao");
        }
    }

// 4.
    public void hienThiDanhSachChuyenNganhViTriChan(ArrayList<ChuyenNganh> listChuyenNganh) {
        for (int i = 0; i < listChuyenNganh.size(); i++) {
            if (i % 2 == 0) {
                listChuyenNganh.get(i).inThongTin();
                System.out.println("");
            }
        }
    }

//5.
    public void sapXepTheoTen(ArrayList<ChuyenNganh> listChuyenNganh) {
        listChuyenNganh.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
    }

//6.
    public ArrayList<ChuyenNganh> timTheoNamThanhLapMaxMin(ArrayList<ChuyenNganh> list) {
        System.out.print("Min = ");
        int min = Integer.valueOf(sc.nextLine());
        System.out.print("Max = ");
        int max = Integer.valueOf(sc.nextLine());

        ArrayList<ChuyenNganh> kq = new ArrayList<>();
        for (ChuyenNganh chuyenNganh : list) {
            if (chuyenNganh.getNamThanhLap() >= min && chuyenNganh.getNamThanhLap() <= max) {
                chuyenNganh.inThongTin();
            }
        }
        return kq;
    }

    // 7.
    public void timKiemTenKetThucE(ArrayList<ChuyenNganh> list) {
        boolean kq = false;
        for (ChuyenNganh chuyenNganh : list) {
            if (chuyenNganh.getTen().endsWith("e") || chuyenNganh.getTen().endsWith("E")) {
                chuyenNganh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay chu ket thuc E");
        }
    }

    //8.
    public void timTenChuaChuA(ArrayList<ChuyenNganh> list) {
        boolean kq = false;
        for (ChuyenNganh chuyenNganh : list) {
            if (chuyenNganh.getTen().contains("a") || chuyenNganh.getTen().contains("A")) {
                chuyenNganh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay chu chua A");
        }

    }

    //9.
    public ChuyenNganh timKiemMaNhap(ArrayList<ChuyenNganh> list) {
        System.out.print(" Nhap ma = ");
        String ma = sc.nextLine();
        for (ChuyenNganh chuyenNganh : list) {
            if (chuyenNganh.getMa().equalsIgnoreCase(ma)) {
                return chuyenNganh;
            }
        }
        return null;
    }

    //10.
    public void xoaMaNhap(ArrayList<ChuyenNganh> listCN) {
        ChuyenNganh chuyenNganh = timKiemMaNhap(listCN);
        if (chuyenNganh != null) {
            listCN.remove(chuyenNganh);
            System.out.println("Da xoa");
        } else {
            System.out.println("Khong tim thay ma can xoa");
        }
    }

    //11.
    public void timNamThanhLapMin(ArrayList<ChuyenNganh> listCN) {
        if (listCN.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }

        ChuyenNganh chuyenNganhMin = listCN.get(0);
        for (ChuyenNganh chuyenNganh : listCN) {
            if (chuyenNganh.getNamThanhLap() < chuyenNganhMin.getNamThanhLap()) {
                chuyenNganhMin = chuyenNganh;
            }
        }
        System.out.print("Chuyen nganh co nam thanh lap som nhat la : ");
        chuyenNganhMin.inThongTin();
    }

    //12.
    public ChuyenNganh timTheoChuNhiemNhap(ArrayList<ChuyenNganh> listCN) {
        System.out.println("Nhap chu nhiem : ");
        String chuNhiem = sc.nextLine();
        for (ChuyenNganh chuyenNganh : listCN) {
            if (chuyenNganh.getChuNhiem().equalsIgnoreCase(chuNhiem)) {
                return chuyenNganh;
            }
        }
        return null;
    }

//    13. 
    public void hienThiDanhSachTrue(ArrayList<ChuyenNganh> listCN) {
        for (ChuyenNganh chuyenNganh : listCN) {
            if (chuyenNganh.isTrangThai() == true) {
                chuyenNganh.inThongTin();
            }
        }
    }

    //14.
    public void hienThiDanhSachFalse(ArrayList<ChuyenNganh> listCN) {
        for (ChuyenNganh chuyenNganh : listCN) {
            if (chuyenNganh.isTrangThai() == false) {
                chuyenNganh.inThongTin();
            }
        }
    }

    //15.
    public void nhapUDPMCoThamSoInRaManHinhThongTinVuaNhap(ArrayList<UDPM> list) {
        System.out.print("Ma = ");
        String ma = sc.nextLine();
        System.out.print("Ten = ");
        String ten = sc.nextLine();
        System.out.print("Chu nhiem = ");
        String chuNhiem = sc.nextLine();
        System.out.print("Mo ta = ");
        String moTa = sc.nextLine();
        System.out.print("Nam thanh lap = ");
        int namThanhLap = Integer.valueOf(sc.nextLine());
        System.out.print("Trang Thai = ");
        boolean trangThai = Boolean.valueOf(sc.nextLine());
        System.out.print("SL = ");
        int soL = Integer.valueOf(sc.nextLine());
        
        UDPM it = new UDPM(soL, ma, ten, chuNhiem, moTa, namThanhLap, trangThai);
        it.inThongTin();
    }
}
