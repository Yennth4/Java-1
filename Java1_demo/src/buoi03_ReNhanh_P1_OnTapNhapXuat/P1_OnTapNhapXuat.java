package buoi03_ReNhanh_P1_OnTapNhapXuat;

import java.util.Scanner;

/*
    Co 2 kieu du lieu : Nguyen thuy ( giong C ) && Object ( 
        Co 3 dac trung : Chu cai DauTien viet hoa , co tuw khoas New , khi . no so ra goi y 
)
 */
public class P1_OnTapNhapXuat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// B1        // 1.Nhap ten , dia chi & in ra
//        System.out.print("Ten: ");
//        String ten = sc.nextLine();
//        
//        System.out.print("Dia chi: ");
//        String diaChi = sc.nextLine();
//        
//        System.out.println("Dia chi: "+diaChi);
//        System.out.println("Ten: " + ten);

        // 2.Nhap ten , tuoi , diaChi , canNang , nganhHoc & in ra màn hình 
        System.out.print("Can nang: ");
        int canNang = sc.nextInt();
        sc.nextLine();

        System.out.print("Ten: ");
        String ten = sc.nextLine();

        System.out.print("Tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
    // or 
    int tuoi1 = Integer.valueOf(sc.nextLine());

        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine();

        System.out.print("Can nang1: ");
        double canNang1 = Double.valueOf(sc.nextLine()); 
        /*
        Trôi lệnh trong Java là do nó gặp dấu cách và khác kiểu dữ liệu nên nó sẽ ăn xuống thằng String bên dưới
        Chống trôi lệnh trong Java : 
                C1: sc.nextLine()  => thêm cái này là xóa bộ nhớ đệm
        
                C2: Ép kiểu : coi tất cả mọi thứ nhập từ bàn phím là chuỗi > sau đó ép nó về kiểu dữ liệu tương ứng 
                    
                    1. Parse : chỉ ép theo từng dạng 
                    2. ValueOf : ép tất cả các kiểu > nên dùng 
                        Khác Pasre ( kiểu dữ liệu nguyên thủy ) >< ValueOf ( kiểu dữ liệu Object - có thể . và hiện gợi ý để có thể so sánh )
         */
        System.out.print("Nganh hoc: ");
        String nganhHoc = sc.nextLine();

        System.out.println(" ");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Diachi: " + diaChi);
        System.out.println("Nganhhoc: " + nganhHoc);
        System.out.println("Can nang: "+canNang);
        System.out.println("Can nang1: "+canNang1);

    }
}
