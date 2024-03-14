package buoi04_VongLap_P1_OnTap;

import java.util.Scanner;

/**
 * Tao 1 menu gom cac chuc nang sau : * 
 * 1. Nhap 2 so nguyen . Tinh tong hieu
 * tich thuong 
 * 2. Nhap ten, tuoi, khuVucSong, canNang cua con meo hang xom. Va
 * in ra man hinh 
 * 3. Nhap vao 1 so nguyen. Kiem tra day la so chan hay le. 
 * 4. Nhap vao 1 so nguyen la canh hinh vuong. Tinh chu vi, dienTich hinh vuong 
 * 5. Nhap vao 1 so nguyen la ban kinh hinh tron. Tinh chu vi dien tich hinh tron.
 * 0. Thoat
 */
public class P1_OnTap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuc nang: ");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1:
                System.out.println("chucNang1");
                System.out.println("");
                 {
                    System.out.print("Nhap so nguyen a: ");
                    double a = Double.valueOf(sc.nextLine());

                    System.out.print("Nhap so nguyen b: ");
                    double b = Double.valueOf(sc.nextLine());

                    System.out.println("Tong: " + (a + b));
                    System.out.println("Hieu: " + (a - b));
                    System.out.println("Tich: " + (a * b));
                    System.out.println("Thuong: " + (a / b));
                }
                break;
            case 2: 
// 2. Nhap ten, tuoi, khuVucSong, canNang cua con meo hang xom. Va in ra man hinh
            {
                System.out.print("Ten: ");
                String ten = sc.nextLine();
                
                System.out.print("Tuoi: ");
                int tuoi = Integer.valueOf(sc.nextLine());
                
                System.out.print("Khu vuc song: ");
                String khuVucSong = sc.nextLine();
                
                System.out.print("canNang: ");
                int canNang = Integer.valueOf(sc.nextLine());

                System.out.println("");
                System.out.println("Ten: " + ten);
                System.out.println("Tuoi: " + tuoi);
                System.out.println("Khu vuc song: " + khuVucSong);
                System.out.println("Can nangg: " + canNang);
            }
            break;
            case 3:        
// 3. Nhap vao 1 so nguyen. Kiem tra day la so chan hay le.
            {
                System.out.println("Nhap n: ");
                int n = Integer.valueOf(sc.nextLine());
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
            }

            break;
            case 4:
// 4. Nhap vao 1 so nguyen la canh hinh vuong. Tinh chu vi, dienTich hinh vuong 
            {
                System.out.print("Canh hinh vuong n = ");
                int n = Integer.valueOf(sc.nextLine());
                
                System.out.println("");
                System.out.println("Chu Vi: " + (n*4));
                System.out.println("DienTich: " + (n*n));
            }
                break;
            case 5:
// 5.Nhap vao 1 so nguyen la ban kinh hinh tron. Tinh chu vi dien tich hinh tron.
            {
                System.out.print("Ban kinh hinh tron R = ");
                int r = Integer.parseInt(sc.nextLine());

                System.out.println("");
                System.out.println("Chu Vi: " + (r * 2 * 3.14) );
                System.out.println("Dien Tich: " + (3.14 * r * r));
            }
                break;
            case 0:
                // Thoat
                break;
            default:
                System.out.println("Khong co chucNang tren");
                break;
        }
    }
}
