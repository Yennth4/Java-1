package de2_XeMay_done10CN;

/**
 *
 * @author haiyenng4
 */
public class XeMay {
    private String ma; 
    private String hang;
    private int giaTien;

    public XeMay() {
    }

    public XeMay(String ma, String hang, int giaTien) {
        this.ma = ma;
        this.hang = hang;
        this.giaTien = giaTien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "XeMay{" + "ma=" + ma + ", hang=" + hang + ", giaTien=" + giaTien + '}';
    }

    
}
