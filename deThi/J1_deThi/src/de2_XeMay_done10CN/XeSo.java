package de2_XeMay_done10CN;

/**
 *
 * @author haiyenng4
 */
public class XeSo extends XeMay {

    private String dongCo;
    private String nhienLieu;

    public XeSo() {
    }

    public XeSo(String dongCo, String nhienLieu, String ma, String hang, int giaTien) {
        super(ma, hang, giaTien);
        this.dongCo = dongCo;
        this.nhienLieu = nhienLieu;
    }

    @Override
    public String toString() {
        return super.toString() + " , DongCo= " + dongCo + " , NhienLieu = " + nhienLieu;
    }

    @Override
    public void setGiaTien(int giaTien) {
        super.setGiaTien(giaTien); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getGiaTien() {
        return super.getGiaTien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setHang(String hang) {
        super.setHang(hang); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHang() {
        return super.getHang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMa(String ma) {
        super.setMa(ma); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        return super.getMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }
}
