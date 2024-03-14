package B8_SinhVien_SinhVienPoly;

public class SinhVienPoly extends SinhVien{
    private String chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    @Override
    public String display() {
        return super.display() + " | ChuyenNganhHep = " + chuyenNganhHep;
    }

    @Override
    public void setChuyenNganh(String chuyenNganh) {
        super.setChuyenNganh(chuyenNganh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getChuyenNganh() {
        return super.getChuyenNganh(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setHoTen(String hoTen) {
        super.setHoTen(hoTen); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMaSV(String maSV) {
        super.setMaSV(maSV); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMaSV() {
        return super.getMaSV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    
}
