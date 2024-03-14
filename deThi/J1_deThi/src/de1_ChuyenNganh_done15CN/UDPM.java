package de1_ChuyenNganh_done15CN;
public class UDPM extends ChuyenNganh{
    private int soLuongSinhVien;

    public UDPM() {
    }

    public UDPM(int soLuongSinhVien, String ma, String ten, String chuNhiem, String moTa, int namThanhLap, boolean trangThai) {
        super(ma, ten, chuNhiem, moTa, namThanhLap, trangThai);
        this.soLuongSinhVien = soLuongSinhVien;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("So Luong SV = " + soLuongSinhVien);
    }

    @Override
    public void setTrangThai(boolean trangThai) {
        super.setTrangThai(trangThai); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isTrangThai() {
        return super.isTrangThai(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNamThanhLap(int namThanhLap) {
        super.setNamThanhLap(namThanhLap); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getNamThanhLap() {
        return super.getNamThanhLap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMoTa(String moTa) {
        super.setMoTa(moTa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMoTa() {
        return super.getMoTa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setChuNhiem(String chuNhiem) {
        super.setChuNhiem(chuNhiem); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getChuNhiem() {
        return super.getChuNhiem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    public int getSoLuongSinhVien() {
        return soLuongSinhVien;
    }

    public void setSoLuongSinhVien(int soLuongSinhVien) {
        this.soLuongSinhVien = soLuongSinhVien;
    }
}
