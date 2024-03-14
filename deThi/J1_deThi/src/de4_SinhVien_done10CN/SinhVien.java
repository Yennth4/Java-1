package de4_SinhVien_done10CN;

/**
 *
 * @author haiyenng4
 */
public class SinhVien extends Nguoi{
    private double toan;
    private double ly;
    private double hoa;

    public SinhVien() {
    }

    public SinhVien(double toan, double ly, double hoa, String ma, String ten, int tuoi, boolean gioiTinh, String queQuan) {
        super(ma, ten, tuoi, gioiTinh, queQuan);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemTB() {
        return (toan + ly + hoa) / 3 ;
    }
    @Override
    public String toString() {
        return super.toString() + ", toan = " + toan + ", ly = " + ly + ", hoa = " + hoa + ", diemTb = " + diemTB(); 
    }

    @Override
    public void setQueQuan(String queQuan) {
        super.setQueQuan(queQuan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getQueQuan() {
        return super.getQueQuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGioiTinh(boolean gioiTinh) {
        super.setGioiTinh(gioiTinh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isGioiTinh() {
        return super.isGioiTinh(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTuoi(int tuoi) {
        super.setTuoi(tuoi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getTuoi() {
        return super.getTuoi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    
}
