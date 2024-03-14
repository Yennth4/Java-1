/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi12_LuyenTap1_DongHo;

/**
 *
 * @author admin
 */
public class DongHo {

    private int maDongHo;
    private String theLoai;
    private String mauSac;
    private int kichThuoc;
    private String chatLieu;
    private int gia;

    public DongHo() {
    }

    public DongHo(int maDongHo, String theLoai, String mauSac, int kichThuoc, String chatLieu, int gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("Ma dong ho = " + maDongHo + " | The loai = " + theLoai + " | Mau sac = " + mauSac + " | Kich thuoc = " + kichThuoc + " | Chat lieu : " + chatLieu + " | Gia : " + gia);
        System.out.println("--");
    }

}
