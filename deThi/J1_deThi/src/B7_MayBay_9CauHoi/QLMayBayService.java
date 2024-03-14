package B7_MayBay_9CauHoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLMayBayService {

    public void nhapMayBay(ArrayList<MayBay> listMayBay) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ma = ");
            String ma = sc.nextLine();
            System.out.print("Hang = ");
            String hang = sc.nextLine();
            System.out.print("So Ghe = ");
            int soGhe = Integer.valueOf(sc.nextLine());

            MayBay mayBay = new MayBay(ma, hang, soGhe);
            listMayBay.add(mayBay);

            System.out.print("Nhap nua ko <1:Y - 0:N> = ");
            int chon = Integer.valueOf(sc.nextLine());
            if (chon == 0) {
                break;
            }
        }
    }

    public void xuatMayBay(ArrayList<MayBay> list) {
        for (MayBay mayBay : list) {
            System.out.println(mayBay.inThongTin());
        }
    }

    public void fakeData(ArrayList<MayBay> list) {
        list.add(new MayBay("1", "01", 20));
        list.add(new MayBay("2", "02", 30));
        list.add(new MayBay("3", "03", 40));
        list.add(new MayBay("4", "04", 50));
        list.add(new MayBay("5", "05", 60));
    }

    public List<MayBay> timKiemMaxMinTheoSoGhe(ArrayList<MayBay> list, int min, int max) {
        List<MayBay> listGhe = new ArrayList<>();
        for (MayBay mayBay : list) {
            if (mayBay.getSoGhe() >= min && mayBay.getSoGhe() <= max) {
                listGhe.add(mayBay);
            }
        }
        return listGhe;
    }

    public void giamDanSoGhe(ArrayList<MayBay> listMayBay) {
        listMayBay.sort((o1, o2) -> Integer.compare(o2.getSoGhe(), o1.getSoGhe()));
    }

    public void tangDanMa(ArrayList<MayBay> listMayBay) {
        listMayBay.sort((o1, o2) -> o1.getMaMayBay().compareTo(o2.getMaMayBay()));
    }

    public void xoaTheoMa(ArrayList<MayBay> listMayBay, String ma) {
        listMayBay.removeIf(mayBay -> mayBay.getMaMayBay().equalsIgnoreCase(ma));
    }

    public void timKiemHangE(ArrayList<MayBay> listMayBay) {
        for (MayBay mayBay : listMayBay) {
            if (mayBay.getHangMayBay().toLowerCase().contains("E")) {
                mayBay.inThongTin();
            }
        }
    }

public void lietKeTop3MayBayCoSoGheLonNhatCuaHangBoeing(ArrayList<MayBay> listMayBay) {
    List<MayBay> listHangBoeing = new ArrayList<>();
    // Lọc ra các máy bay của hãng Boeing có số ghế lớn hơn min
    for (MayBay mayBay : listMayBay) {
        if (mayBay.getHangMayBay().equalsIgnoreCase("Boeing") && mayBay.getSoGhe() > 0) {
            listHangBoeing.add(mayBay);
        }
    }
    
    // Sắp xếp danh sách theo số ghế giảm dần
    listHangBoeing.sort((o1, o2) -> Integer.compare(o2.getSoGhe(), o1.getSoGhe()));
    
    // Lấy top 3 máy bay có số ghế lớn nhất
    List<MayBay> top3MayBay = listHangBoeing.subList(0, Math.min(listHangBoeing.size(), 3));
    
    // In thông tin các máy bay trong top 3
    for (MayBay mayBay : top3MayBay) {
        System.out.println(mayBay.inThongTin());
    }
}
}
/*
 * Bài 6. 
    1.Nhập danh sách đối tượng ?Khi nhập có hỏi tiếp hay ko?  
    2. Xuất danh sách đối tượng 
    3. Tìm kiếm máy bay trong khoảng số ghế max, min             
    4. Sắp xếp giảm dần của số ghế 
    5. Xóa đối tượng theo mã máy bay nhập từ bàn phím 
    6. Sắp xếp tăng dần theo mã 
    7. Tìm kiếm máy bay có hãng chứa chữ “e” 
    8. Tìm kiếm máy báy có hãng bắt đầu bằng “b” 
    9. Liệt kê top 3 máy bay có số ghế lớn nhất và của hãng “Boeing” 
    0.Thoát   

Tạo lớp DanDung kế thừa từ lớp MayBay thêm thuộc tính loaiDongCo – String, soDongCo – String và hàm inThongTin(): 
10. Kế Thừa.    Detail chức năng 10: khi lựa chọn chức năng 5 khởi tạo 1 đối tượng lớp DanDung có giá trị ban đầu bằng Constructor không tham số sau đó in thông tin đối tượng đó ra màn hình

 */
