package buoi05_Mang_P2_MenuLapLai;

import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * Tao menu gồm các chức năng sau - lặp lại (chọn 3 thì dừng): 
 *1. Tính tổng hiệu tích thương 3 số nguyên từ bàn phím 

 *2. Nhạp vào số nguyên dương n và tính tích các số lẻ 1-n chia hết cho 3 
    3. Thoát
 */
public class P1_MenuLapLai {

    public static void main(String[] args) {
        int chucNang;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("    Menu    ");
            System.out.println("1. Tinh");
            System.out.println("2. Tich số lẻ chia hết cho 3");
            System.out.println("Nhap chucNang: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1: {
                    System.out.print("a: ");
                    int a = Integer.valueOf(sc.nextLine());
                    System.out.print("b: ");
                    int b = Integer.valueOf(sc.nextLine());
                    System.out.print("c: ");
                    int c = Integer.valueOf(sc.nextLine());

                    System.out.println("Tong: " + (a + b + c));
                    System.out.println("Hieu: " + (a - b - c));
                    System.out.println("Tich: " + (a * b * c));
                    System.out.println("Thuong: " + (1.0 * (a / b / c)));
                }
                break;
                case 2:
                    System.out.println("Nhap n: ");
                    int n = Integer.valueOf(sc.nextLine());

                    int tich = 1;
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 != 0 && i % 3 == 0){
                            tich *= i;
                        }
                        System.out.println("Tich = " + tich);
                    }
                    break;
                case 3:
                    // thoát
                    break;
                default:
                    System.out.println("Chon chucNang sai!!!");
                    break;
            }

        } while (chucNang != 3);

    }
}
