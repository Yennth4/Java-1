package buoi10_MangDong;

public class DienThoai {

    private String ma;
    private String ten;
    private String dongMay;
    private float gia;
    private int dungLuong;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, String dongMay, float gia, int dungLuong, String mauSac) {
        this.ma = ma;
        this.ten = ten;
        this.dongMay = dongMay;
        this.gia = gia;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
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

    public String getDongMay() {
        return dongMay;
    }

    public void setDongMay(String dongMay) {
        this.dongMay = dongMay;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    // inThongTinHienThi kiểu trả về là String : tạo 1 biến trùng kiểu dữ liệu > return về biến đó > Gán sout và biến đó > in ra return thì để trong systemOut(dienThoai.hienThi());
    public String hienThi() {
        String ketQua = "";
        ketQua = "Ma = " + ma + " | Ten = " + ten + " | Dong May = " + dongMay + " | Gia = " + gia + " | Dung Luong = " + dungLuong + " | Mau sac = " + mauSac;
        return ketQua;
    }
}
