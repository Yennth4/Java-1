package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLXM quanLyXeMayService = new QLXM();
        ArrayList<XeSo> dsXeSo = new ArrayList<>();
        ArrayList<XeMay> listXeMay = new ArrayList<>();
        quanLyXeMayService.fakeData(listXeMay);
        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Nhập danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng");
            System.out.println("3. Tìm kiếm các xe máy có giá nhỏ hơn 50");
            System.out.println("4. Sắp xếp giảm dần của giá tiền");
            System.out.println("5. Xóa xe máy theo mã");
            System.out.println("6. Tìm vị trí của các xe máy có giá tiền nhỏ nhất");
            System.out.println("7. Nhập thông tin xe số");
            System.out.println("8. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    quanLyXeMayService.nhap(listXeMay);
                    break;
                case 2:
                    quanLyXeMayService.xuat(listXeMay);
                    break;
                case 3:
                    quanLyXeMayService.timKiemXeNhoHon50(listXeMay);
                    break;
                case 4:
                    quanLyXeMayService.giamDanTheoGia(listXeMay);
                    quanLyXeMayService.xuat(listXeMay);
                    System.out.println("Đã sắp xếp danh sách theo giá tiền giảm dần.");
                    break;
                case 5:
                    quanLyXeMayService.xoaTheoMa(listXeMay);
                    quanLyXeMayService.xuat(listXeMay);
                    break;
                case 6:
                    quanLyXeMayService.timViTriXeNhoNhat(listXeMay);
                    break;
                case 7:
                    quanLyXeMayService.nhapXeSo(dsXeSo);
                    quanLyXeMayService.xuatXeSo(dsXeSo);
                    break;
                case 8:
                    quanLyXeMayService.timXeTheoMa(listXeMay);
                    break;
                case 9:
                    quanLyXeMayService.timNguoiTheoGiaMaxMin(listXeMay);
                    break;
                case 10:
                    quanLyXeMayService.tangDanTheoMa(listXeMay);
                    quanLyXeMayService.xuat(listXeMay);
                    break;
                case 11:
                    quanLyXeMayService.xoaTheoViTri(listXeMay);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
                    break;
            }
        }
    }

}
