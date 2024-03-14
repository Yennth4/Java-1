package de3_MayTinh_done16CN;

public class MayTinhMSI extends MayTinh{
    private String moTa;

    public MayTinhMSI() {
    }

    public MayTinhMSI(String moTa, String ma, String ten, String hang, int boNho, float gia, boolean trangThai) {
        super(ma, ten, hang, boNho, gia, trangThai);
        this.moTa = moTa;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("MoTa = " +moTa);
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
    public void setGia(float gia) {
        super.setGia(gia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public float getGia() {
        return super.getGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setBoNho(int boNho) {
        super.setBoNho(boNho); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getBoNho() {
        return super.getBoNho(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setHang(String hang) {
        super.setHang(hang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHang() {
        return super.getHang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}
