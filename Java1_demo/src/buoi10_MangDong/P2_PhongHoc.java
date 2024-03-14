package buoi10_MangDong;

public class P2_PhongHoc {

    private String ma;
    private String ten;
    private String toa;
    private double dienTich;
    private boolean trangThai;

    public P2_PhongHoc() {
    }

    public P2_PhongHoc(String ma, String ten, String toa, double dienTich, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.toa = toa;
        this.dienTich = dienTich;
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

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String display() {
        return "Ma = " + ma + " | Ten = " + ten + " | Toa = " + toa + " | DienTich = " + dienTich + " | Trang Thai = " + trangThai;
    }
}
