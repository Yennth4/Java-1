package B11_LuyenTap1_StringNguoi_full;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NguoiService {

    public void nhap(ArrayList<Nguoi> listNguoi) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ten: ");
            String ten = sc.nextLine();
            System.out.print("Tuoi: ");
            int tuoi = Integer.valueOf(sc.nextLine());
            System.out.print("Gioi Tinh (0:Nu - 1:Nam) = ");
            int gioiTinh = Integer.valueOf(sc.nextLine());
            System.out.print("Que quan: ");
            String queQuan = sc.nextLine();
            System.out.print("Nghe nghiep: ");
            String ngheNghiep = sc.nextLine();

            Nguoi nguoi = new Nguoi(ten, tuoi, gioiTinh, queQuan, ngheNghiep);
            listNguoi.add(nguoi);

            System.out.println("Muon in tiep kh ? <0: no , 1:yes>");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void xuat(ArrayList<Nguoi> listNguoi) {
        for (Nguoi nguoi : listNguoi) {
            System.out.println(nguoi.inThongTin());
        }
    }

    public List<Nguoi> timNguoiTheoGioiTinhNu(List<Nguoi> listNguoiService) {
    List<Nguoi> nguoiNuList = new ArrayList<>();
    for (Nguoi nguoi : listNguoiService) {
        if (nguoi.getGioiTinh() == 0) {
            nguoiNuList.add(nguoi);
        }
    }
    return nguoiNuList;
}

    public List<Nguoi> timNguoiTheoTuoi(int minTuoi, int maxTuoi, List<Nguoi> listNguoiService) {
        List<Nguoi> listNguoiTheoTuoi = new ArrayList<>();
        for (Nguoi nguoi : listNguoiService) {
            if (nguoi.getTuoi() >= minTuoi && nguoi.getTuoi() <= maxTuoi) {
                listNguoiTheoTuoi.add(nguoi);
            }
        }
        return listNguoiTheoTuoi;
    }
    
    public void sapXepTangDanTheoTuoi(ArrayList<Nguoi> listNguoiService) {
        listNguoiService.sort((nguoi1, nguoi2) -> Integer.compare(nguoi1.getTuoi(), nguoi2.getTuoi()));
    }

    public void sapXepGiamDanTheoTen(ArrayList<Nguoi> listNguoiService) {
        listNguoiService.sort((nguoi1, nguoi2) -> nguoi2.getTen().compareTo(nguoi1.getTen()));
    }

    public void xoaTheoViTri(int viTri, ArrayList<Nguoi> listNguoiService) {
        if (viTri >= 0 && viTri < listNguoiService.size()) {
            listNguoiService.remove(viTri);
            System.out.println("Người tại vị trí " + viTri + " đã được xoá.");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    public void fakeData(ArrayList<Nguoi> listNguoiService) {
        listNguoiService.add(new Nguoi("Yen1", 1, 0, "HN", "Hs"));
        listNguoiService.add(new Nguoi("Yen2", 2, 1, "HN2", "Hs2"));
        listNguoiService.add(new Nguoi("Yen3", 3, 0, "HN3", "Hs3"));
        listNguoiService.add(new Nguoi("Yen4", 4, 1, "HN4", "Hs4"));
        listNguoiService.add(new Nguoi("Yen5", 5, 0, "HN5", "Hs5"));
    }
}
