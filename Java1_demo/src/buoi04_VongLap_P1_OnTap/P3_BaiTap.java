/*
1. In ra 0 - 50
2. in ra số lẻ 1 - 50
3. tính tổng số  0 - 10
4. tính tổng số lẻ 0 - 15
5. tích 1 - 20
6. tích số chẵn 1 - 25
*/
package buoi04_VongLap_P1_OnTap;

import java.util.Scanner;

public class P3_BaiTap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Chon chucNang: ");
        int choise  = Integer.valueOf(scan.nextLine());
        switch (choise) {
            case 1: 
                // 1. In ra 0 - 50
            {
                int n = 0;
                while ( n < 51 ) {
                    System.out.println(n);
                    n++;
                }
            }
                break;
            case 2:
//                2. in ra số lẻ 1 - 50
            {
                for (int i = 1; i < 51; i++) {
                    if ( i % 2 == 1 ){
                        System.out.println(i);
                    }
                }
                
                // C2 : tăng bước nhảy lên 2 lần 
                int n = 1;
                while (n < 51){
                    System.out.println(n);
                    n +=2;
                }
            }
                break;
            case 3:
//                3. tính tổng số  0 - 10
            {
                int sum = 0;
                for (int i = 0; i < 11; i++) {
                    sum +=i;
                }
                System.out.println("Tong: " + sum);
            }
                break;
            case 4:
//                4. tính tổng số lẻ 0 - 15
            {
                int sum = 0;
                for (int i = 0; i < 15; i++) {
                    if ( i % 2 != 0 ) {
                        sum = sum + i;
                    }
                } 
                System.out.println("Tong : " + sum);
            }
                break;
            case 5:
//                5. tích 1 - 20
            {
                int tich = 0;
                for (int i = 1; i < 21; i++) {
                   tich *= i;
                }
                System.out.println("Tich: " + tich);
            }
                break;
            case 6:
                
                break;
            case 0:
                // thoat
                break;

            default:
                System.out.println("Sai chucNang moi chon lai !!!");
                break;
                
        }
    }
}
