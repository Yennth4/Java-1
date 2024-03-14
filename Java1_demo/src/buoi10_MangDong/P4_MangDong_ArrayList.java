/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi10_MangDong;

import java.util.ArrayList;

/**
 * Mảng trước : int a[] = int [size]; > Gia tri cua vi tri i = arr[i]
 * size : cố định , bất tiện => Nên dùng mảnh động : Không cố định 
 * Collections : ArrayList<>()
 * Cấu trúc : ArrayList<kiểu dữ liệu> tenBien = new ArrayList<>();
 * Gia tri cua vi tri i = tenBien.get(i)
 * 
 */
public class P4_MangDong_ArrayList {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         System.out.println(list.size());
         
         list.add("IT18328");
         list.add("IT00328");
         
         list.remove(0);
         System.out.println( "2 = " + list.size());
         list.add("4");
         System.out.println( "3 = " + list.size());
         System.out.println(list);
    }
    
}
