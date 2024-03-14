package buoi09_P1_KhaiNiemOOP;

public class P2_KhaiNiemContructor_Getter_Setter_SinhVien {
    // Tính đóng gói : bảo vệ quyền riêng tư
    // Phạm truy cập <nhắc đến đóng gói là có>
        // private
        // default
        // protected : 
        // public
    private String maSV;
    private String ten;
    private String diaChi;
    private String matKhauFB;
    private Integer tuoi;
    private Long soDuTaiKhoanNganHang;

    /**
     Học thầy phong : SQL & nhap mon ki thuat phan mem
     * contructor: dùng để khởi tạo 1 đối tượng
     * contructor: khphai HÀM - nó gần giống hàm (cùng là phương thức)
     * VD: int a = 5;
     
     * Có 2 loại contructer: không tham số , có tham số 
     * Mặc định của 1 class là loại contructor không tham số <Nên không cần khởi tạo> 
     * 
     * Nhưng khi khởi tạo contructer có tham số : 
     * Thì contructer không tham số <mặc định>  => bị mất đi 
     * Nếu muốn sdụng lại cái không tham số => thì phải khởi tạo 
     * 
     * Dấu hiệu nhận biết contructor 
     * - Ten contructor phải trùng với tên class
     * - Không có kiểu trả về <Không có return vì kphai hàm> 
     * Cấu trúc dữ liệu và giải thuật : các cô support các bạn: các môn học onl thì phải tự học là chính và hỏi.
     */
    
    public P2_KhaiNiemContructor_Getter_Setter_SinhVien() {
    }

    public P2_KhaiNiemContructor_Getter_Setter_SinhVien(String maSV, String ten, String diaChi, String matKhauFB, Integer tuoi, Long soDuTaiKhoanNganHang) {
        this.maSV = maSV;
        this.ten = ten;
        this.diaChi = diaChi;
        this.matKhauFB = matKhauFB;
        this.tuoi = tuoi;
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
    }

    /**
     * Getter: lấy ra thông tin dối tượng (vì private không cho các class khác dùng thông tin của mình)
         * Bắt đầu từ get - trừ boolean (bắt đầu từ isGioiTinh)
     * 
     * Setter: thay đổi thông tin đối tượng.
         * Bắt đầu : luôn bắt đầu từ set 
     */
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhauFB() {
        return matKhauFB;
    }

    public void setMatKhauFB(String matKhauFB) {
        this.matKhauFB = matKhauFB;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Long getSoDuTaiKhoanNganHang() {
        return soDuTaiKhoanNganHang;
    }

    public void setSoDuTaiKhoanNganHang(Long soDuTaiKhoanNganHang) {
        this.soDuTaiKhoanNganHang = soDuTaiKhoanNganHang;
    }

    public void inThongTin(){
        System.out.println("MaSV: " + maSV + " | TenSV: " + ten + " | Dia chi: " + diaChi + " | Tuoi: " + tuoi + " | MatKhauFB: " + matKhauFB + " | So du tai khoan: " + soDuTaiKhoanNganHang);
    }
    
    
}
