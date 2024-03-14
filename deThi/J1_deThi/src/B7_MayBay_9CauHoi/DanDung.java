package B7_MayBay_9CauHoi;

public class DanDung extends MayBay{
    private String loaiDongCo;
    private String soDongCo;

    public DanDung() {
    }

    public DanDung(String loaiDongCo, String soDongCo, String maMayBay, String hangMayBay, int soGhe) {
        super(maMayBay, hangMayBay, soGhe);
        this.loaiDongCo = loaiDongCo;
        this.soDongCo = soDongCo;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public String getSoDongCo() {
        return soDongCo;
    }

    public void setSoDongCo(String soDongCo) {
        this.soDongCo = soDongCo;
    }
    
    public String inThongTinDanDung() {
        return super.inThongTin() + " | Loai = " + loaiDongCo + " | So = " + soDongCo;
    }
    
}
