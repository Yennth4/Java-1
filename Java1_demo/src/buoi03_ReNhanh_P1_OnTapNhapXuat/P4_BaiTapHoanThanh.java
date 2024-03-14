/*
BTVN
     1. Nhap vao 1 so nguyen. Kiem tra day la so chan hay le
     2. Tinh tong,hieu, tich, thuong cua 2 so nguyen nhap tu ban phim
     3. Nhap vao 1 so nguyen. Kiem tra so do thuoc thang nao trong nam
     4. Nhap vao 1 so nguyen. Kiem tra so do thuoc quy nao trong nam
     5. Tao 1 menu gom cac chuc nang sau
         1. Nhap ten, tuoi, dia chi cua ban than va in ra man hinh
         2. Kiem tra 1 so nhap tu ban phim xem co lon hon 10 khong
         3. Thoat
 */
package buoi03_ReNhanh_P1_OnTapNhapXuat;

import java.util.Scanner;

public class P4_BaiTapHoanThanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuc nang : ");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                System.out.println("so chan , so le");
                System.out.print("Nhap n: ");
                int n = Integer.valueOf(sc.nextInt());
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break;
            }

            case 2: {
                System.out.print("Nhap a: ");
                int a = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap b: ");
                int b = Integer.valueOf(sc.nextLine());

                System.out.println("Tong: " + (a + b));
                System.out.println("Hieu: " + (a - b));
                System.out.println("Tích: " + (a * b));

                double thuong = (double) a / b;
                System.out.println("Thuong: " + thuong);
                break;
            }

            case 4: {
                System.out.println("Nhập số nguyên tháng  - check quý");
                System.out.println("Nhập tháng: ");
                int n = Integer.valueOf(sc.nextLine());
                switch (n) {
                    case 1:
                        System.out.println("Quý 1");
                        break;
                    case 2:
                        System.out.println("Quý 1");
                        break;
                    case 3:
                        System.out.println("Quý 1");
                        break;

                    case 4:
                        System.out.println("Quý 2");
                        break;
                    case 5:
                        System.out.println("Quý 2");
                        break;
                    case 6:
                        System.out.println("Quý 2");
                        break;

                    case 7:
                        System.out.println("Quý 3");
                        break;
                    case 8:
                        System.out.println("Quý 3");
                        break;
                    case 9:
                        System.out.println("Quý 3");
                        break;

                    case 10:
                        System.out.println("Quý 4");
                        break;
                    case 11:
                        System.out.println("Quý 4");
                        break;
                    case 12:
                        System.out.println("Quý 4");
                        break;

                    default:
                        System.out.println("Khong thuoc quy nao !!!");
                        break;
                }
                break;
            }

            case 3: {
                System.out.println("Nhap so nguyen thang: ");
                int n = Integer.valueOf(sc.nextLine());
                switch (n) {
                    case 1:
                        System.out.println("Thang 1");
                        break;
                    case 2:
                        System.out.println("Thang 2");
                        break;
                    case 3:
                        System.out.println("Thang 3");
                        break;
                    case 4:
                        System.out.println("Thang 4");
                        break;
                    case 5:
                        System.out.println("Thang 5");
                        break;
                    case 6:
                        System.out.println("Thang 6");
                        break;
                    case 7:
                        System.out.println("Thang 7");
                        break;
                    case 8:
                        System.out.println("Thang 8");
                        break;
                    case 9:
                        System.out.println("Thang 9");
                        break;
                    case 10:
                        System.out.println("Thang 10");
                        break;
                    case 11:
                        System.out.println("Thang 11");
                        break;
                    case 12:
                        System.out.println("Thang 12");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Nhập sai tháng!!!");
                        break;
                }
                break;
            }

            case 5: {
                System.out.println("        Tạo menu");
                System.out.print("Moi nhap chuc nang nhỏ nèo : ");
                int chucNang1 = Integer.valueOf(sc.nextLine());
                switch (chucNang1) {
                    case 1: {
                        System.out.println("chucNang1: Nhap ten, tuoi, dia chi cua ban than va in ra man hinh");
                        System.out.print("Ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Tuoi: ");
                        int tuoi = Integer.valueOf(sc.nextLine());
                        System.out.print("DiaChi: ");
                        String diaChi = sc.nextLine();

                        System.out.println("");
                        System.out.println("Ten1: " + ten);
                        System.out.println("Tuoi1: " + tuoi);
                        System.out.println("Diachi1: " + diaChi);
                        break;
                    }
                    case 2: {
                        System.out.println("chucNang2: Kiem tra 1 so nhap tu ban phim xem co lon hon 10 khong ?");
                        System.out.print("Nhap n: ");
                        int n = Integer.valueOf(sc.nextLine());
                        if (n > 10) {
                            System.out.println(n + " : lon hon 10");
                        } else if (n < 10) {
                            System.out.println(n + " : nho hon 10");
                        } else {
                            System.out.println(n + " : Bang 10");
                        }
                        break;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        System.out.println("chucNang k tồn tại");
                        break;
                    }
                }
                break;
            }
            
            default: {
                System.out.println("chucNang k tồn tại!!!");
                break;
            }

        }
    }
}
