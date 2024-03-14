package B11_LuyenTap1_StringNguoi_full;

public class Nguoi {

    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String gioiTinh() {
        String gioiTinhStr = "";
        if (gioiTinh == 0) {
            gioiTinhStr = "Nu";
        } else if (gioiTinh == 1) {
            gioiTinhStr = "Nam";
        } else {
            gioiTinhStr = "null";
        }
        return gioiTinhStr;
    }

    public String inThongTin() {
        String kq = "";

        kq = "Ten = " + ten + " | Tuoi = " + tuoi + " | GioiTinh = " + gioiTinh() + " | Que Quan = " + queQuan + " | Nghe nghiep = " + ngheNghiep;
        System.out.println("");
        return kq;
    }
}
