package de3_MayTinh_done16CN;

public class MayTinh {
    private String ma;
    private String ten;
    private String hang;
    private int boNho;
    private float gia;
    private boolean trangThai;

    public MayTinh() {
    }

    public MayTinh(String ma, String ten, String hang, int boNho, float gia, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.boNho = boNho;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public void inThongTin() {
        System.out.println("Ma = " + ma + " , ten = " + ten + " , hang = " + hang + " , boNho = " +  boNho + " , gia = " + gia + " , trangThai = " + (trangThai == true ? "DangHD" : "KhongHD"));
    }
}
