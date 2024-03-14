package asm;

public class Iphone extends DienThoai {

    private int boNho;
    private String mauSac;

    public Iphone() {
    }

    public Iphone(int boNho, String mauSac, String ma, String ten, int gia) {
        super(ma, ten, gia);
        this.boNho = boNho;
        this.mauSac = mauSac;
    }

    @Override
    public String inThongTin() {
        return super.inThongTin() + " , Bo nho = " + boNho + " Mau sac = " + mauSac;
    }

    @Override
    public void setGia(int gia) {
        super.setGia(gia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getGia() {
        return super.getGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTen(String ten) {
        super.setTen(ten); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTen() {
        return super.getTen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMa(String ma) {
        super.setMa(ma); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        return super.getMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getBoNho() {
        return boNho;
    }

    public void setBoNho(int boNho) {
        this.boNho = boNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

}
