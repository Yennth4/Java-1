package asm;

public class DienThoai {
    private String ma;
    private String ten;
    private int gia;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public String inThongTin() {
        return "Ma = " + ma + " , Ten = " + ten + " , Gia = " + gia;
    }
}
