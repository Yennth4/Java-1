package Lab5;

public class XeMay {

    private String maXeMay;
    private String hangXe;
    private int giaTien;

    public XeMay(String maXeMay, String hangXe, int giaTien) {
        this.maXeMay = maXeMay;
        this.hangXe = hangXe;
        this.giaTien = giaTien;
    }

    public XeMay() {
    }

    public String getMaXeMay() {
        return maXeMay;
    }

    public void setMaXeMay(String maXeMay) {
        this.maXeMay = maXeMay;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String inThongTin(){
        String ketQua = "Ma = " + maXeMay + " , hang = " + hangXe + " , gia = " + giaTien ;
        return ketQua;
    }
}
