package buoi04_VongLap_P1_OnTap;

import java.util.Scanner;

/**
 *
 * 3 Vòng lặp :
 *
 * 1. While CuPhap: while (dkien) { // code }
 *
 * 2. do while CuPhap: do { // code cần lặp } while (dkien);
 *
 * 3.For CuPhap: for (batdau ; dkien ; bước nhảy) { // code }
 */
public class P2_VongLap {

    public static void main(String[] args) {

// in 0 - 10 sd 3 vong lap
      
        // Vong lap 1 : while 
        int number = 0;
        while (number < 11) {
            System.out.println("number " + number);
            number++;
            // C2 : number = number + 1 
            // C3 : numer +=1 
        }
   
        
        // Vong lap 2 : do while
        int n = 0 ;
        do {
            System.out.println("n = " + n);
            n++;
        } while (n < 11);
        
        // Vong lap 3 : for
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        
        // de in ra vong lap vô tận : xóa dkien trong for di la dc 
    }
}
