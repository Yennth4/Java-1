package de1_ChuyenNganh_done15CN;

public class ChuyenNganh {

    private String ma;
    private String ten;
    private String chuNhiem;
    private String moTa;
    private int namThanhLap;
    private boolean trangThai;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String ma, String ten, String chuNhiem, String moTa, int namThanhLap, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.chuNhiem = chuNhiem;
        this.moTa = moTa;
        this.namThanhLap = namThanhLap;
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

    public String getChuNhiem() {
        return chuNhiem;
    }

    public void setChuNhiem(String chuNhiem) {
        this.chuNhiem = chuNhiem;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getNamThanhLap() {
        return namThanhLap;
    }

    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public void inThongTin() {
        System.out.println("Ma: " + ma + " , ten: " + ten + " , chu Nhiem: " + chuNhiem + " , moTa: " + moTa + " , namThanhLap: " + namThanhLap + " , trangThai: " + (trangThai == true ? "Dang Hoat Dong" : "Khong Hoat Dong"));
    }
}
