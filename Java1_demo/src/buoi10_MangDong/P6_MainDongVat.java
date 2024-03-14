/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi10_MangDong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P6_MainDongVat {
    public static void main(String[] args) {
        ArrayList<P5_DongVat> listDongVat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ma: ");
        String ma = sc.nextLine();
        System.out.print("Ten: ");
        String ten = sc.nextLine();
        System.out.print("Tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Can Nang: ");
        double canNang = Double.valueOf(sc.nextLine());
        
        P5_DongVat dongVat = new P5_DongVat(ma, ten, tuoi, canNang);
        listDongVat.add(dongVat);
        
        for (P5_DongVat p5_DongVat : listDongVat) {
            System.out.println(p5_DongVat.inThongTin());;
        }
    }
}
