package buoi14_KeThua_DongVat;

/**
 *
 * extends DongVat : Meo kế thừa từ class DongVat Không thể kế thừa các phương
 * thức và thuộc tính của cha : nếu phương thức bên DongVat : private - muốn lấy
 * được vẫn phải thông qua : super.getTenBien - chỉ cần khác private là
 * super.tenBien bth
 *
 * Lấy thông tin từ cha thông qua : "super"
 *
 */
public class Meo extends DongVat {

    private String tiengKeu;

    public Meo() {
    }

    public Meo(String tiengKeu, String ma, String ten, int gioiTinh, int canNang) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void hienThi() {
        // C1: Viết thuần 
        // System.out.println("Mã : " + super.getMa()+ " | Tên: " + super.getTen() + " | Giới tính = " + super.getGioiTinh() + " | Cân nặng = " + super.getCanNang() + " | Tiếng Kêu : " + tiengKeu);
        
        // C2: Gọi in thông tin của cha & viết thêm của con
        super.inThongTin();
        System.out.println("Tiếng Kêu : " + tiengKeu);
    }

}
