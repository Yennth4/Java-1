package de3_MayTinh_done16CN;

import com.sun.source.tree.BreakTree;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yennth4
 */
public class QLMTService {

    private Scanner sc = new Scanner(System.in);

    public void fakeData(ArrayList<MayTinh> listMayTinh) {
        listMayTinh.add(new MayTinh("1", "Mai", "1", 1, 1, true));
        listMayTinh.add(new MayTinh("2", "Mei", "1", 2, 2, false));
        listMayTinh.add(new MayTinh("3", "Me", "1", 3, 3, false));
        listMayTinh.add(new MayTinh("4", "ai", "1", 4, 4, true));
        listMayTinh.add(new MayTinh("5", "Lai", "1", 5, 5, false));
        listMayTinh.add(new MayTinh("6", "Kai", "1", 6, 6, true));
    }

    public void nhap(ArrayList<MayTinh> listMayTinh) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Ten = ");
            String ten = sc.nextLine();
            System.out.print("Hang = ");
            String hang = sc.nextLine();
            System.out.print("BoNho = ");
            int boNho = Integer.valueOf(sc.nextLine());
            System.out.print("Gia = ");
            float gia = Float.valueOf(sc.nextLine());
            System.out.print("Trang thai <true:DangHD - false:KhongHD> = ");
            boolean trangThai = Boolean.valueOf(sc.nextLine());

            MayTinh mayTinh = new MayTinh(ma, ten, hang, boNho, gia, trangThai);
            listMayTinh.add(mayTinh);

            System.out.print("Nhap tiep 0 ? = ");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void xuat(ArrayList<MayTinh> listMayTinh) {
        listMayTinh.forEach(MayTinh::inThongTin);
    }
//3.

    public void timKiemMayTinhBatDauA(ArrayList<MayTinh> listMayTinh) {
        boolean kq = false;
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getTen().toLowerCase().startsWith("a")) {
                mayTinh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay chu bat dau A");
        }
    }
//4.

    public void hienThiDSViTriLe(ArrayList<MayTinh> listMayTinh) {
        for (int i = 0; i < listMayTinh.size(); i++) {
            if (i % 2 == 1) {
                listMayTinh.get(i).inThongTin();
            }
        }
    }
//5.

    public void sapXepTangDanTheoGia(ArrayList<MayTinh> listMayTinh) {
        listMayTinh.sort((o1, o2) -> Float.compare(o1.getGia(), o2.getGia()));
    }
//6.

    public void sapXepGiamDanTheoBoNho(ArrayList<MayTinh> listMayTinh) {
        listMayTinh.sort((o1, o2) -> Integer.compare(o2.getBoNho(), o1.getBoNho()));
    }
//7.

    public ArrayList<MayTinh> hienThiDSGiaMaxMin(ArrayList<MayTinh> listMayTinh) {
        System.out.print("Min = ");
        float min = Float.valueOf(sc.nextLine());
        System.out.print("Max = ");
        float max = Float.valueOf(sc.nextLine());
        ArrayList<MayTinh> kq = new ArrayList<>();
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getGia() >= min && mayTinh.getGia() <= max) {
                mayTinh.inThongTin();
            }
        }
        return kq;
    }
//8.

    public void hienThiDSTenKetThucE(ArrayList<MayTinh> listMayTinh) {
        boolean kq = false;
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getTen().toLowerCase().endsWith("e")) {
                mayTinh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay chu ketThuc e");
        }

    }
//9.

    public void hienThiDSTenChuaA(ArrayList<MayTinh> listMayTinh) {
        boolean kq = false;
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getTen().toLowerCase().contains("a")) {
                mayTinh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay chu chua A");
        }
    }
//10.

    public MayTinh timKiemTheoMaNhap(ArrayList<MayTinh> listMayTinh) {
        System.out.print("Nhap ma : ");
        String ma = sc.nextLine();
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getMa().equalsIgnoreCase(ma)) {
                return mayTinh;
            }
        }
        return null;
    }
//11.

    public void xoaTheoMaNhap(ArrayList<MayTinh> listMayTinh) {
        MayTinh kq = timKiemTheoMaNhap(listMayTinh);
        if (kq != null) {
            listMayTinh.remove(kq);
            System.out.println("Da xoa ma vua nhap");
        } else {
            System.out.println("Khong tim thay ma can xoa");
        }
    }
//12.

    public void timGiaMax(ArrayList<MayTinh> listMayTinh) {
        if (listMayTinh.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        MayTinh giaMax = listMayTinh.get(0);
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getGia() > giaMax.getGia()) {
                giaMax = mayTinh;
            }
        }
        System.out.print("Gia maz la : ");
        giaMax.inThongTin();
    }
//13.

    public void hienThiTrangThaiTrue(ArrayList<MayTinh> listMayTinh) {
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.isTrangThai() == true) {
                mayTinh.inThongTin();
            }
        }
    }
//14.

    public void hienThiTrangThaiFalse(ArrayList<MayTinh> listMayTinh) {
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.isTrangThai() == false) {
                mayTinh.inThongTin();
            }
        }
    }
//15.

    public void timKiemHangNhap(ArrayList<MayTinh> listMayTinh) {
        boolean kq = false;
        System.out.print("Nhap hang can tim: ");
        String hang = sc.nextLine();
        for (MayTinh mayTinh : listMayTinh) {
            if (mayTinh.getHang().equalsIgnoreCase(hang)) {
                mayTinh.inThongTin();
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay hang nhap");
        }
    }
//16.

    public void nhapMayTinhMSI(ArrayList<MayTinhMSI> list) {
        System.out.print("Ma = ");
        String ma = sc.nextLine();
        System.out.print("Ten = ");
        String ten = sc.nextLine();
        System.out.print("Hang = ");
        String hang = sc.nextLine();
        System.out.print("BoNho = ");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.print("Gia = ");
        float gia = Float.valueOf(sc.nextLine());
        System.out.print("Trang thai <true:DangHD - false:KhongHD> = ");
        boolean trangThai = Boolean.valueOf(sc.nextLine());
        System.out.print("MoTa = ");
        String moTa = sc.nextLine();

        MayTinhMSI mt = new MayTinhMSI(moTa, ma, ten, hang, boNho, gia, trangThai);
        mt.inThongTin();
    }
}
