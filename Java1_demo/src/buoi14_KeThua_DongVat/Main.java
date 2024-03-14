package buoi14_KeThua_DongVat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QLDongVat dongVatService = new QLDongVat();
        ArrayList<DongVat> listDongVat = new ArrayList<>();
        ArrayList<Meo> listMeo = new ArrayList<>();
        dongVatService.fakeData(listDongVat);
        dongVatService.fakeData2(listMeo);
        int chon;
        do {
            System.out.println("    MENU    ");
            System.out.println("1.THEM DONG VAT");
            System.out.println("2.HIEN THI DANH SACH");
            System.out.println("3.TIM DONG VAT BAT DAU T ");
            System.out.println("4.NHAP THONG TIN MEO VA IN RA");
            System.out.print("Chọn đê = ");
            chon = Integer.valueOf(scan.nextLine());
            switch (chon) {
                case 1: {
                    dongVatService.nhap(listDongVat);
                    break;
                }
                case 2: {
                    dongVatService.hienThiThongTin(listDongVat);
                    break;
                }
                case 3: {
                    dongVatService.timTenBatDauChuT(listDongVat);
                    break;
                }
                case 4: {
                    dongVatService.nhapXuatMeo(listMeo);
                    break;
                }
                case 0: {
                    System.out.println("Bạn đã thoát chương trình");
                    break;
                }
                default:
                    System.out.println("Chọn sai !!!");
                    break;
            }
        } while (chon != 0);
    }
}

/**
Bài 4: Tạo class DongVat gồm các thuộc tính : ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int và các phương thức constructor, getter, setter và inThongTin(): void
Tạo class QLDongVat sử dụng ArrayList<DongVat> , Các chức năng viết trong class này.
Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng:
        1.Thêm động vật (Sau khi thêm hỏi có muốn thêm tiếp hay ko? Y/N)
         2.Hiển thị dsach động vật
         4.Tìm động vật có tên bắt đầu là chữ “t"
         5.Tạo class Meo kế thừa từ DongVat và thêm thuộc tính tiengKeu - String và các phương thức constructor, getter, setter và hàm inThongTin(): void. Nhập thông tin của mèo và hiển thị ra . Sử dụng constructor có tham số.
         0.Thoát
 */