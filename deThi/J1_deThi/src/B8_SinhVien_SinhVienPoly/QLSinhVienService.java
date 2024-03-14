package B8_SinhVien_SinhVienPoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yennth4
 */
public class QLSinhVienService {

    private Scanner sc = new Scanner(System.in);

    public void fakeData(ArrayList<SinhVien> listSV) {
        listSV.add(new SinhVien("1", "NguyenVanA", "IT"));
        listSV.add(new SinhVien("2", "NguyenVanB", "MKT"));
        listSV.add(new SinhVien("3", "NguyenVanC", "SALES"));
        listSV.add(new SinhVien("4", "NguyenVanD", "TKDH"));
        listSV.add(new SinhVien("5", "NguyenVanE", "QHCC"));
    }

    public void nhap(ArrayList<SinhVien> listSV) {
        while (true) {
            System.out.print("Ma : ");
            String ma = sc.nextLine();
            System.out.print("HoTen : ");
            String hoTen = sc.nextLine();
            System.out.print("ChuyenNganh : ");
            String chuyenNganh = sc.nextLine();

            SinhVien sinhVien = new SinhVien(ma, hoTen, chuyenNganh);
            listSV.add(sinhVien);
            System.out.print("Nhap tiep 0 ? ");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void xuat(ArrayList<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            System.out.println(sinhVien.display());
            System.out.println("");
        }
    }

    public List<SinhVien> timSVTheoMa(ArrayList<SinhVien> listSV, String ma) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getMaSV().equalsIgnoreCase(ma)) {
                list.add(sinhVien);
            }
        }
        return list;
    }

    public List<SinhVien> timMaTheoMaxMin(ArrayList<SinhVien> listSV, String min, String max) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getMaSV().compareToIgnoreCase(min) >= 0 && sinhVien.getMaSV().compareToIgnoreCase(max) <= 0) {
                list.add(sinhVien);
            }
        }
        return list;
    }

    public void giamDanTheoChuyenNganh(ArrayList<SinhVien> listSV) {
        listSV.sort((o1, o2) -> o1.getChuyenNganh().compareTo(o2.getChuyenNganh()));
    }

    public void tangDanTheoChuyenNganh(ArrayList<SinhVien> listSV) {
        listSV.sort((o1, o2) -> o2.getChuyenNganh().compareTo(o1.getChuyenNganh()));
    }

    public void nhapSinhVienPoly(ArrayList<SinhVienPoly> listSV) {
        System.out.print("Ma : ");
        String ma = sc.nextLine();
        System.out.print("HoTen : ");
        String hoTen = sc.nextLine();
        System.out.print("ChuyenNganh : ");
        String chuyenNganh = sc.nextLine();
        System.out.print("ChuyenNganhHep : ");
        String chuyenNganhHep = sc.nextLine();

        SinhVienPoly svPoly = new SinhVienPoly(chuyenNganhHep, ma, hoTen, chuyenNganh);
        listSV.add(svPoly);
    }

    public void xuatSinhVienPoly(ArrayList<SinhVienPoly> listSV) {
        for (SinhVienPoly sinhVienPoly : listSV) {
            System.out.println(sinhVienPoly.display());
            System.out.println("");
        }
    }

    public void timChuyenNganhT(ArrayList<SinhVien> listSV) {
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getChuyenNganh().endsWith("t") || sinhVien.getChuyenNganh().endsWith("T")) {
                System.out.println(sinhVien.display());
            }
        }
    }

    public void lietKeTop3MaMax(ArrayList<SinhVien> list) {
        list.sort((o1, o2) -> o2.getMaSV().compareTo(o1.getMaSV()));
        for (int i = 0; i < 3; i++) {
            // in phần tử top 3 của danh sách đã sắp xếp
            System.out.println("Thong tin cua ma " + list.get(i).getMaSV() + " co nickname la : " + list.get(i).getHoTen());
            System.out.println("");
        }
    }

    public void lietKeTop1MaMaxCoChuCaiNTrongHoTen(ArrayList<SinhVien> list) {
        SinhVien maxMaSinhVien = null;

        // Tìm sinh viên có mã lớn nhất
        for (SinhVien sinhVien : list) {
            if (maxMaSinhVien == null || sinhVien.getMaSV().compareTo(maxMaSinhVien.getMaSV()) > 0) {
                maxMaSinhVien = sinhVien;
            }
        }

        // Kiểm tra và in ra sinh viên có chữ 'N' trong họ tên của mã lớn nhất
        if (maxMaSinhVien != null && maxMaSinhVien.getHoTen().contains("N")) {
            System.out.println("Thong tin cua ma " + maxMaSinhVien.getMaSV() + " co nickname la : " + maxMaSinhVien.getHoTen());
        } else {
            System.out.println("Khong co sinh vien nao co chua chu 'N' trong ho ten.");

        }

    }

}
