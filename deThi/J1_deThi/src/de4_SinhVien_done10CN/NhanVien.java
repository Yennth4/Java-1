/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4_SinhVien_done10CN;

/**
 *
 * @author admin
 */
public class NhanVien extends Nguoi {
    private double luongTheoNgay;

    public NhanVien(String ma, String ten, int tuoi, boolean gioiTinh, String queQuan,
                    double luongTheoNgay) {
        super(ma, ten, tuoi, gioiTinh, queQuan);
        this.luongTheoNgay = luongTheoNgay;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luong theo ngay = " + luongTheoNgay; 
    }

    @Override
    public void setQueQuan(String queQuan) {
        super.setQueQuan(queQuan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getQueQuan() {
        return super.getQueQuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGioiTinh(boolean gioiTinh) {
        super.setGioiTinh(gioiTinh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isGioiTinh() {
        return super.isGioiTinh(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTuoi(int tuoi) {
        super.setTuoi(tuoi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getTuoi() {
        return super.getTuoi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTen(String ten) {
        super.setTen(ten); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTen() {
        return super.getTen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMa(String ma) {
        super.setMa(ma); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        return super.getMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


}
