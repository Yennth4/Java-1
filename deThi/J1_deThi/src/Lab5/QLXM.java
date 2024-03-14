package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class QLXM {

    private Scanner sc = new Scanner(System.in);

    public void nhap(ArrayList<XeMay> listXeMay) {
        while (true) {
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Hang = ");
            String hang = sc.nextLine();
            System.out.print("Gia = ");
            int gia = Integer.valueOf(sc.nextLine());

            XeMay xeMay = new XeMay(ma, hang, gia);
            listXeMay.add(xeMay);
            System.out.print("Nhap tiep 0 ?");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void xuat(ArrayList<XeMay> listXeMay) {
        for (XeMay xeMay : listXeMay) {
            System.out.println(xeMay.inThongTin());
            System.out.println("");
        }
    }

    public void timKiemXeNhoHon50(ArrayList<XeMay> listXeMay) {
        boolean kq = false;
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getGiaTien() < 50) {
                System.out.println(xeMay.inThongTin());
                kq = true;
            }
        }
        if (!kq) {
            System.out.println("Khong tim thay xe nho hon 50");
        }
    }

    public void giamDanTheoGia(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((o1, o2) -> o2.getGiaTien() - o1.getGiaTien());
    }

    public void xoaTheoMa(ArrayList<XeMay> listXeMay) {
        System.out.print("Nhap ma can xoa = ");
        String ma = sc.nextLine();

        boolean kw = false;
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getMaXeMay().equalsIgnoreCase(ma)) {
                listXeMay.remove(xeMay);
                kw = true;
                System.out.println("Da xoa ma " + ma);
                break;
            }
        }
        if (!kw) {
            System.out.println("Khong tim thay ma can xoa");
        }
    }

    public void timViTriXeNhoNhat(ArrayList<XeMay> listXeMay) {
        if (listXeMay.isEmpty()) {
            System.out.println("Danh sach rong!!!");
            return;
        }
        listXeMay.sort((o1, o2) -> o1.getGiaTien() - o2.getGiaTien());
        System.out.println("Cac xe co gia nho nhat");
        int dem = Math.min(listXeMay.size(), 3);
        for (int i = 0; i < dem; i++) {
            System.out.println(listXeMay.get(i).inThongTin());
        }
    }

    public void nhapXeSo(ArrayList<XeSo> listXeSo) {
        System.out.print("Ma = ");
        String ma = sc.nextLine();
        System.out.print("Hang = ");
        String hang = sc.nextLine();
        System.out.print("Gia = ");
        int gia = Integer.valueOf(sc.nextLine());
        System.out.print("Dung tich = ");
        int dungTich = Integer.valueOf(sc.nextLine());

        XeSo xeSo = new XeSo(ma, hang, gia, dungTich);
        listXeSo.add(xeSo);
    }

    public void xuatXeSo(ArrayList<XeSo> listXeSo) {
        for (XeSo xeSo : listXeSo) {
            System.out.println(xeSo.inThongTin());
        }
    }

    public void fakeData(ArrayList<XeMay> listXeMay) {
        listXeMay.add(new XeMay("1", "1", 10));
        listXeMay.add(new XeMay("2", "2", 200));
        listXeMay.add(new XeMay("3", "3", 300));
        listXeMay.add(new XeMay("4", "4", 400));
        listXeMay.add(new XeMay("5", "5", 500));
    }

    // 8
    public void timXeTheoMa(ArrayList<XeMay> listXeMay) {
        System.out.println("Nhap ma can tim = ");
        String ma = sc.nextLine();

        boolean kw = false;
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getMaXeMay().equalsIgnoreCase(ma)) {
                System.out.println(xeMay.inThongTin());
                kw = true;
                break;
            }
        }
        if (!kw) {
            System.out.println("Khong co ma ban can tim");
        }
    }

    // 9
    public void timNguoiTheoGiaMaxMin(ArrayList<XeMay> listXeMay) {
        System.out.print("Min = ");
        int min = Integer.valueOf(sc.nextLine());
        System.out.print("Max = ");
        int max = Integer.valueOf(sc.nextLine());

        boolean kw = false;
        for (XeMay xeMay : listXeMay) {
            if (xeMay.getGiaTien() >= min && xeMay.getGiaTien() <= max) {
                System.out.println(xeMay.inThongTin());
                kw = true;
                break;
            }
        }
        if (!kw) {
            System.out.println("Khong co gia ban can tim");
        }
    }

    // 10
    public void tangDanTheoMa(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((o1, o2) -> o2.getMaXeMay().compareToIgnoreCase(o1.getMaXeMay()));
    }

    public void xoaTheoViTri(ArrayList<XeMay> listXeMay) {
        System.out.print("Nhap viTri can xoa = ");
        int viTri = Integer.valueOf(sc.nextLine());

        if (viTri >= 0 && viTri <= listXeMay.size()) {
            listXeMay.remove(viTri);
            System.out.println("Da xoa vi tri " + viTri);
        } else {
            System.out.println("Khong co vi tri can xoa");
        }

    }
}
