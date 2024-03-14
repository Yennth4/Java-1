package buoi05_Mang_P2_MenuLapLai;

import java.util.Scanner;

/*
 * Mảng 1. chứa cùng kiểu dữ liệu
 * 2. Chứa - vị trí i: 0 -> (size -1) 
 *         - gtri :  arr[i] : arr[0] -> Vị trí bắt dầu từ 0 :
 *
BT:

1. Nhap size cua mang so nguyen , nhập từ bàn phím in ra màn hình
2. Nhap 1 mang so nguyen từ bàn phím , tính tổng các số nguyên trong mảng
3. Nhap 1 mang so nguyen từ bàn phím , tính tích các số số lẻ ở vị trí chẵn trong mảng 
 
 */
public class P2_Mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn đê : ");
        int chon = Integer.valueOf(sc.nextLine());
        switch (chon) {
            case 1: {
                System.out.println("Nhap size: ");
                int size = sc.nextInt();
                int arr[] = new int[size];// Cu phap khai báo bảng 

                // cứ làm việc với mảng là dùng for 
                // nhap so nguyen vao bảng
                System.out.print("Nhập đê : ");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                // in ra 
                System.out.println("Tao trả mày lại những thứ tao đã nhận nè : ");
                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i]);
                }
            }
            break;

            case 2: {
                System.out.print("Nhap size: ");
                int size = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap arr: ");
                int arr[] = new int[size];
                //Nhap
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                // tinh & in ra
                int tong = 0;
                for (int i = 0; i < size; i++) {
                    tong += arr[i];
                }
                System.out.println("Tong: " + tong);
            }
            break;

            case 3: {

                System.out.print("Nhap size: ");
                int size = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap arr: ");
                int arr[] = new int[size];

                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
//tích các số số lẻ ở vị trí chẵn trong mảng 

                int tich = 1;
                for (int i = 0; i < size; i++) {
                    if (arr[i] % 2 != 0 && i % 2 == 0) { // gtri lẻ và vị trí chẵn 
                        tich *= arr[i];
                    }
                }
                System.out.println("Tich: " + tich);
            }
            break;

            case 4:
// thoát
                break;
            default:
                break;
        }

    }
}
