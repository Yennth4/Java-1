package B11_LuyenTap1_StringNguoi_full;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NguoiService nguoiService = new NguoiService();
        ArrayList<Nguoi> listNguoi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        nguoiService.fakeData(listNguoi);
        int choice;
        do {
            System.out.println("  MENU  ");
            System.out.println("1. Nhập thông tin Người");
            System.out.println("2. In thông tin ra màn hình");
            System.out.println("3. Liệt kê tất cả Người có giới tính là Nữ");
            System.out.println("4. Liệt kê tất cả các Người có tuổi trong khoảng min, max");
            System.out.println("5. Sắp xếp tăng dần theo tuổi của người");
            System.out.println("6. Xoá người với vị trí nhập từ bàn phím");
            System.out.println("7. Sắp xếp giảm dần theo tên của người");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.valueOf(scanner.nextLine());

            switch (choice) {
                case 1: {
                    nguoiService.nhap(listNguoi);
                    break;
                }
                case 2: {
                    nguoiService.xuat(listNguoi);
                    break;
                }
                case 3: {
                    List<Nguoi> nguoiNuList = nguoiService.timNguoiTheoGioiTinhNu(listNguoi);
                    if (nguoiNuList.isEmpty()) {
                        System.out.println("Không có người nữ trong danh sách.");
                    } else {
                        System.out.println("Danh sách người có giới tính Nữ:");
                        nguoiService.xuat((ArrayList<Nguoi>) nguoiNuList);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhập tuổi min: ");
                    int minTuoi = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tuổi max: ");
                    int maxTuoi = Integer.parseInt(scanner.nextLine());
                    List<Nguoi> filteredList = nguoiService.timNguoiTheoTuoi(minTuoi, maxTuoi, listNguoi);
                    if (filteredList.isEmpty()) {
                        System.out.println("Không có người có tuổi từ " + minTuoi + " đến " + maxTuoi + ".");
                    } else {
                        System.out.println("Danh sách người có tuổi từ " + minTuoi + " đến " + maxTuoi + ":");
                        nguoiService.xuat((ArrayList<Nguoi>) filteredList);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Sắp xếp tăng dần theo tuổi.");
                    nguoiService.sapXepTangDanTheoTuoi(listNguoi);
                    nguoiService.xuat(listNguoi);
                    break;
                }
                case 6: {
                    System.out.print("Nhập vị trí người cần xoá: ");
                    int viTri = Integer.valueOf(scanner.nextLine());
                    nguoiService.xoaTheoViTri(viTri, listNguoi);
                    break;
                }
                case 7: {
                    System.out.println("Sắp xếp giảm dần theo tên.");
                    nguoiService.sapXepGiamDanTheoTen(listNguoi);
                    nguoiService.xuat(listNguoi);
                    break;
                }
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }
}
/*
Tạo class Nguoi gồm các thuộc tính: ten - String , tuoi - int, gioiTinh - int ( 0-Nữ, 1- Nam), queQuan - String , ngheNghiep - String và các phương thức constructor, getter, setter và inThongTin(): String

Tạo class QuanLyNguoiService sử dụng ArrayList<Nguoi> . Các chức năng viết trong class này

Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0 và làm các chức năng:

1.Nhập thông tin Nguoi

2.In thông tin ra màn hình

3. Liệt kê tất cả Người có giới tính là Nữ

4. Liệt kê tất cả các Người có tuổi trong khoảng min, max nhập từ bàn phím

5. Sắp xếp tăng dần theo tuổi của người

6. Xoá người với vị trí nhập từ bàn phím

7. Sắp xếp giảm dần theo tên của người

0.Thoát
*/