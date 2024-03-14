package B12_DongHoFull;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DongHoService dhoService = new DongHoService();
        ArrayList<DongHo> listDongHo = new ArrayList<>();
        int choice;
        dhoService.fakeData(listDongHo);
        do {
            System.out.println("\n    MENU    ");
            System.out.println("1. Nhập thông tin đồng hồ");
            System.out.println("2. In các thông tin đồng hồ ra màn hình");
            System.out.println("3. Tìm các đồng hồ có giá nhập từ bàn phím");
            System.out.println("4. Xoá đồng hồ theo mã nhập từ bàn phím");
            System.out.println("5. Sắp xếp tăng dần theo kich thước");
            System.out.println("6. Sắp xếp giảm dần theo kích thước");
            System.out.println("7. Top 3 giá lớn nhất  ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng : ");
            choice = Integer.valueOf(scanner.nextLine());

            switch (choice) {
                case 1: {
                    dhoService.nhap(listDongHo);
                }
                break;

                case 2:
                    System.out.println(" DANH SÁCH ĐỒNG HỒ ");
                    dhoService.xuat(listDongHo);
                    break;

                case 3:
                    System.out.print("Nhập giá đồng hồ min: ");
                    int min = Integer.valueOf(scanner.nextLine());
                    System.out.print("Nhập giá đồng hồ max: ");
                    int max = Integer.valueOf(scanner.nextLine());
                    dhoService.timDongHoTheoKhoangGia(listDongHo, min, max);
                    break;
                case 4: {
                    System.out.print("Nhap ma can xoa: ");
                    int maNhap = Integer.valueOf(scanner.nextLine());
                    dhoService.xoaTheoMa(listDongHo, maNhap);
                }
                break;
                case 5: {
                    dhoService.sapXepKichThuocTangDan(listDongHo);
                    dhoService.xuat(listDongHo);
                }
                break;
                case 6: {
                    dhoService.sapXepKichThuocGiamDan(listDongHo);
                    dhoService.xuat(listDongHo);
                }
                break;
                case 7: {
                    System.out.println("Top 3 dong ho co gia dat nhat la: ");
                    dhoService.lietKeTop3GiaDatNhat(listDongHo);
                }
                break;

                case 0:
                    System.out.println("Bạn đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }
}
/*
Tạo đối tượng DongHo gồm các thông tin:maDongHo - int, theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int và các phương thức constructor, getter, setter và inThongTin(): void

Tạo class DongHoService sử dụng ArrayList<DongHo> . Các chức năng viết trong class này

Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0 và làm các chức năng:

1.Nhập thông tin đối tượng. Hỏi nhập tiếp hay không ?( 1 - có , 2 là dừng)

2.In các thông tin ra màn hình

3.Tìm kiếm đồng hồ theo khoảng giá

4. Xoá đồng hồ theo mã

5. Sắp xếp đồng hồ theo kích thước tăng dần

6. Sắp xếp đồng hồ theo kích thước giảm dần

7. Liệt kê top 3 đồng hồ có giá đắt nhất

0.Thoát
 */
