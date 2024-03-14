package buoi09_P1_KhaiNiemOOP;

/*
 * OOP: 4 tính chất : 
    *  Đóng gói
    *  Kế thừa
    *  Đa hình 
    *  Trừu tượng
 * Object : đối tượng có 2 đặc trưng : 
    *  1.Thuộc tính (attribute) : các biến (tên tuổi địa chỉ , vv, )
    *  2.Phương thức (method) : hành động - các hàm
 */
public class P1_HuongDoiTuong {

    public static void main(String[] args) {
        /*
         * Phân biệt class và Object
         * Tạo class SinhVien gồm các thuộc tính <1đ>: 
         * String : maSV, ten ,diaChi , matKhauFB , 
         * Integer: tuoi
         * Long : soDuTaiKhoanNganHang 
         * Và các contructor , getter setter và hàm inThongTin(): void
         * Tạo class Main: In thông tin của đối tượng SV       
         */
        
        // khoi tao doi tuong : contructor => new 
        P2_KhaiNiemContructor_Getter_Setter_SinhVien sinhVien = new P2_KhaiNiemContructor_Getter_Setter_SinhVien();
        sinhVien.setMaSV("PH31906");
        sinhVien.setTen("Nguyen Hai Yen");
        sinhVien.setTuoi(18);
        sinhVien.setDiaChi("HaNoi");
        sinhVien.setMatKhauFB("123");
        sinhVien.setSoDuTaiKhoanNganHang(100L); // long phải them L sau cùng > float là S
        sinhVien.inThongTin(); // Không truyền gì vào sẽ ra giá trị mặc định của kiểu dữ liệu . => Object : là null , int = 0 , float = 0.0
        
        System.out.println("");
        P2_KhaiNiemContructor_Getter_Setter_SinhVien sinhVienCoThamSo = new P2_KhaiNiemContructor_Getter_Setter_SinhVien("PH001", "NguyenBaCuong","HaNoi", "matKhauFB123", 18, 100L);
        sinhVienCoThamSo.inThongTin();
    }
}
