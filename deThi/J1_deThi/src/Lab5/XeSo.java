package Lab5;

public class XeSo extends XeMay{
    private int dungTich;

    public XeSo(String maXeMay, String hangXe, int giaTien, int dungTich) {
        super(maXeMay, hangXe, giaTien);
        this.dungTich = dungTich;
    }

    public XeSo() {
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String inThongTin() {
        return super.inThongTin() + " , dung tich = " + dungTich; 
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
    public void setHangXe(String hangXe) {
        super.setHangXe(hangXe); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHangXe() {
        return super.getHangXe(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMaXeMay(String maXeMay) {
        super.setMaXeMay(maXeMay); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMaXeMay() {
        return super.getMaXeMay(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
