package de2_XeMay_done10CN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author haiyenng4
 */
public class QLXM {

    private Scanner sc = new Scanner(System.in);

    public void fakeData(ArrayList<XeMay> listXeMay) {
        listXeMay.add(new XeMay("1", "KIA", 10));
        listXeMay.add(new XeMay("1", "KIA", 10));
        listXeMay.add(new XeMay("2", "CMS", 20));
        listXeMay.add(new XeMay("3", "MOK", 30));
        listXeMay.add(new XeMay("4", "MES", 40));
        listXeMay.add(new XeMay("5", "BNW", 50));
    }

    public void nhap(ArrayList<XeMay> listXeMay) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Hang = ");
            String hang = sc.nextLine();
            System.out.print("Gia = ");
            int gia = Integer.valueOf(sc.nextLine());

            XeMay xm = new XeMay(ma, hang, gia);
            listXeMay.add(xm);
            System.out.print("Nhap tiep? : ");
            int nhap = Integer.valueOf(sc.nextLine());
            if (nhap == 0) {
                break;
            }
        }
    }

    public void xuat(ArrayList<XeMay> listXeMay) {
        for (XeMay xeMay : listXeMay) {
            System.out.println(xeMay.toString());
        }
    }

    //3.
    public ArrayList<XeMay> timMaTheoKhoangMinMax(ArrayList<XeMay> listXeMay) {
        System.out.print("Min = ");
        String min = sc.nextLine();
        System.out.print("Max = ");
        String max = sc.nextLine();
        ArrayList<XeMay> list = new ArrayList<>();
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getMa().compareToIgnoreCase(min) >= 0 && xeMay.getMa().compareToIgnoreCase(max) <= 0) {
                System.out.println(xeMay.toString());
            }
        }
        return list;
    }

    //4.
    public XeMay timMaNhap(ArrayList<XeMay> listXeMay) {
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getMa().equalsIgnoreCase(ma)) {
                return xeMay;
            }
        }
        return null;
    }

    //5.
    public void giamDanTheoGia(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((o1, o2) -> Integer.compare(o2.getGiaTien(), o1.getGiaTien()));
    }
    //6.
    public void xoa(ArrayList<XeMay> listXeMay) {
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        boolean kq = false;

        ArrayList<XeMay> listXoa = new ArrayList<>();
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getMa().equalsIgnoreCase(ma)) {
                listXoa.add(xeMay);
                kq = true;
            }
        }
        if (kq) {
            listXeMay.removeAll(listXoa);
            System.out.println("Da xoa ma nhap");
        } else {
            System.out.println("Khong tim ma can xoa");
        }
    }

    public void timXeGiaNhoHon50(ArrayList<XeMay> listXeMay) {
        boolean kq = false;
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getGiaTien() < 50) {
                System.out.println(xeMay.toString());
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay xe gia nho hon 50");
        }
    }

    //8.
    public void tangDanTheoMa(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((o1, o2) -> o1.getMa().compareTo(o2.getMa()));
    }

    //9.
    public void viTriCacXeCoGiaTienNhoNhat(ArrayList<XeMay> listXeMay) {
        int giaMin = listXeMay.get(0).getGiaTien();

        for (XeMay xeMay : listXeMay) {
            if (xeMay.getGiaTien() < giaMin) {
                giaMin = xeMay.getGiaTien();
            }
        }

        System.out.println("Vi tri cac xe co gia tien nho nhat:");
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getGiaTien() == giaMin) {
                System.out.println("Vi tri: " + i + ", " + listXeMay.get(i).toString());
            }
        }
    }
    
    public void viTriGiaMin(ArrayList<XeMay> listXeMay) {
        int min = listXeMay.get(0).getGiaTien();
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getGiaTien() < min) {
                min = xeMay.getGiaTien();
            }
        }
        System.out.print("Vi tri min: ");
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getGiaTien() == min) {
                System.out.println("Vi tri : " + i + " , " + listXeMay.get(i).toString());
            }
        }
    }
}
/**
 * 1. Nhập danh sách đối tượng (1 điểm ) .Khi nhập có hỏi tiếp hay ko? (0.5 điểm
 * ) 2. Xuất danh sách đối tượng (1 điểm ) 3. Tìm kiếm các xe máy có giá nhỏ hơn
 * 50 (1 điểm ) 4. Sắp xếp giảm dần của giá tiền (0.5 điểm ) 5. Xoa xe máy theo
 * mã nhập từ bản phim(0.5 điểm ) 6. Tìm vị trí của các xe máy có giá tiền nhỏ
 * nhất(1 điểm ) 7. Tìm mã xe máy theo khoảng do người dùng nhập(0.5 đ) 8. Tìm
 * kiếm xe máy trong khoảng giá tiền max, min(0.5 đ) 9. Sắp xếp giảm dần của giá
 * tiền (0.5 đ)
 */
