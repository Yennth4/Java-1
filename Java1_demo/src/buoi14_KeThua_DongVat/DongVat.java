package buoi14_KeThua_DongVat;

public class DongVat {

    private String ma;
    private String ten;
    private int gioiTinh;
    private int canNang;

    public DongVat() {
    }

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String gioiTinhStr() {
        if (gioiTinh == 1) {
            return "Đực";
        } else if (gioiTinh == 2) {
            return "Cái";
        }
        return "null";
    }
    
    public void inThongTin() {
        System.out.println("Mã ĐV : " + ma + " | Tên : " + ten + " | Giới tính (1: Đực || 2: Cái) : " + gioiTinhStr() + " | Cân nặng (kg) : " + canNang);
        System.out.println("");
    }
}
