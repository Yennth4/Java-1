package de4_SinhVien_done10CN;

/**
 *
 * @author haiyenng4
 */
public class Nguoi {
    private String ma;
    private String ten;
    private int tuoi ;
    private boolean gioiTinh ;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String ma, String ten, int tuoi, boolean gioiTinh, String queQuan) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Ma = " + ma + ", ten = " + ten + ", tuoi = " + tuoi + ", gioiTinh = " + (gioiTinh == true ? "Nam" : "Nu")+ ", queQuan = " + queQuan ;
    }
    
    
}
