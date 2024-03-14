package B12_DongHoFull;


import java.util.ArrayList;
import java.util.Scanner;

public class DongHoService {

    public void nhap(ArrayList<DongHo> list) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ma = ");
            int ma = Integer.valueOf(sc.nextLine());
            System.out.print("The loai = ");
            String theLoai = sc.nextLine();
            System.out.print("Mau sac = ");
            String mauSac = sc.nextLine();
            System.out.print("Kich thuoc = ");
            int kichThuoc = Integer.valueOf(sc.nextLine());
            System.out.print("Chat lieu = ");
            String chatLieu = sc.nextLine();
            System.out.print("Gia = ");
            int gia = Integer.valueOf(sc.nextLine());

            DongHo dh = new DongHo(ma, theLoai, mauSac, kichThuoc, chatLieu, gia);
            list.add(dh);

            System.out.print("Ban co muon nhap tiep khong ? <1.co / 2.khong>");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 2) {
                break;
            }
        }
    }

    public void xuat(ArrayList<DongHo> list) {
        for (DongHo dongHo : list) {
            dongHo.inThongTin();
        }
    }

    public void timDongHoTheoKhoangGia(ArrayList<DongHo> list, int min, int max) {
        for (DongHo dongHo : list) {
            if (dongHo.getGia() >= min && max >= dongHo.getGia()) {
                dongHo.inThongTin();
            }
        }
    }

    public void xoaTheoMa(ArrayList<DongHo> list, int ma) {
        for (DongHo dongHo : list) {
            if (dongHo.getMaDongHo() == ma) {
                list.remove(dongHo);
                System.out.println("Ma " + ma + " da duoc xoa");
                break;
            } else {
                System.out.println("Khong tim thay ma " + ma + " de xoa");
            }
        }
    }

    public void sapXepKichThuocTangDan(ArrayList<DongHo> list) {
        list.sort((o1, o2) -> Integer.compare(o1.getKichThuoc(), o2.getKichThuoc()));
    }

    public void sapXepKichThuocGiamDan(ArrayList<DongHo> list) {
        list.sort((o1, o2) -> Integer.compare(o2.getKichThuoc(), o1.getKichThuoc()));
    }

    public void lietKeTop3GiaDatNhat(ArrayList<DongHo> list) {
        list.sort((o1, o2) -> o2.getGia() - o1.getGia());
        for (int i = 0; i < 3; i++) {
            // in phần tử top 3 của danh sách đã sắp xếp
            System.out.println("Thong tin cua ma " + list.get(i).getMaDongHo() + " co gia la : "  + list.get(i).getGia());

        }
    }

    public void fakeData(ArrayList<DongHo> list) {
        list.add(new DongHo(1, "1", "Den", 1, "Nhua", 10));
        list.add(new DongHo(2, "2", "Trang", 2, "Vang", 20));
        list.add(new DongHo(3, "3", "Vang", 3, "KimLoai", 40));
        list.add(new DongHo(4, "4", "Nau", 4, "Da", 1));
        list.add(new DongHo(5, "5", "Bach kim", 5, "Fe", 5));
    }
}
