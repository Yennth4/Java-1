package buoi03_ReNhanh_P1_OnTapNhapXuat;

import java.util.Scanner;

/**
 *
 * Cấu trúc rẽ nhánh
 *
 * 1. If elseif else
 *
 * if (dkien) { 
 * // code 
 * } else if(dkien1) {
 * // code 
 * } else {
 * // code 
 * }

 * 2.Switch(tenBien) { 
 *      case gTri: { 
 *      // code 
 *      ketThuc case cuối cùng là : break 
 * }
 * ketThuc switch là default default: { 
 * // TruongHopNgoaiLe không rơi vào các
 * case trên break; 
 * } 
 * }
 *
 *
 */
public class P3_ReNhanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int n = Integer.valueOf(sc.nextLine());
        switch (n) {
            case 1: {
                // code
            }
            case 2: {
                // code
            }
            case 3: {
                // code
            }
            case 4: {
                // code
            }
            case 5: {
                // code
            }
            case 0:
                break;
            default: {
                System.out.println("Khong phai cac truong hop tren");
                break;
            }
        }
    }
}
