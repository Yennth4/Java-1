package buoi06_Lab1234_Ass1;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

/*

 */
public class PhongTT35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("");
            System.out.print("Moi nhap chuc nang: ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    System.out.println("1.Tinh toan tong hieu tich thuong");
                    System.out.print("Nhap so nguyen dau tien: ");
                    int numberFisrt = Integer.valueOf(sc.nextLine());

                    System.out.print("Nhap so nguyen thu hai: ");
                    int numberSecond = Integer.valueOf(sc.nextLine());

                    System.out.println("");
                    System.out.println("Tong = " + (numberFisrt + numberSecond));
                    System.out.println("Hieu = " + (numberFisrt - numberSecond));
                    System.out.println("Tich = " + (numberFisrt * numberSecond));

                    System.out.println("Thuong = " + (1.0 * numberFisrt / numberSecond));
                }
                break;
                case 2: {
                    System.out.println("2.Nhap thong tin vat  nuoi");
                    System.out.print("Ten: ");
                    String ten = sc.nextLine();
                    System.out.print("Can nang: ");
                    int canNang = Integer.valueOf(sc.nextLine());
                    System.out.print("Noi song: ");
                    String noiSong = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int tuoi = Integer.valueOf(sc.nextLine());

                    System.out.println("");
                    System.out.println("Ten = " + ten);
                    System.out.println("Can nang = " + canNang);
                    System.out.println("Noi song = " + noiSong);
                    System.out.println("Tuoi = " + tuoi);
                }
                break;
                case 3: {
                    System.out.println("3.Tinh tich 1 - n");
                    System.out.print("Nhap n = ");
                    int n = Integer.valueOf(sc.nextLine());

                    int tich = 1;
                    for (int i = 1; i < n + 1; i++) {
                        tich *= i;
                    }
                    System.out.println("Tich = " + tich);
                }
                break;
                case 4: {
                    System.out.println("4.Mang.");
                    System.out.print("Moi nhap size : ");
                    int size = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[size];

                    System.out.println("Moi nhap mang : ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    
                    System.out.println("");
                    System.out.println("1.In ra mang vua nhap theo chieu nguoc lai: ");
                    for (int i = size - 1; i >= 0; i--) {
                        System.out.println(arr[i]);
                    }

                    
                    System.out.println("");
                    int tong = 0;
                    for (int i = 0; i < size; i++) {
                        if (i % 2 != 0 && arr[i] % 2 != 0) {
                            tong += arr[i];
                        }
                    }
                    System.out.println("2.Tong cac so le o vi tri le : " + tong);

                    
                    System.out.println("");
                    int viTri = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] > 20) {
                            viTri = i;
                        }
                    }
                    System.out.print("4.Vi tri so nguyen lon hon 20: " + viTri);
                    System.out.println("");
                }
                break;
                case 0:
                    // thoat
                    break;
                default:
                    System.out.println("Nhap sai chuc nang . Moi nhap lai!");
                    break;
            }

        } while (chon != 0);
    }

}
