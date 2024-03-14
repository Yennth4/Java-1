package B7_MayBay_9CauHoi;

public class MayBay {
    private String maMayBay;
    private String hangMayBay;
    private int soGhe;

    public MayBay() {
    }

    public MayBay(String maMayBay, String hangMayBay, int soGhe) {
        this.maMayBay = maMayBay;
        this.hangMayBay = hangMayBay;
        this.soGhe = soGhe;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getHangMayBay() {
        return hangMayBay;
    }

    public void setHangMayBay(String hangMayBay) {
        this.hangMayBay = hangMayBay;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }
    
    public String inThongTin() {
        return "Ma = " + maMayBay + " | Hang = " + hangMayBay + " | So ghe = " + soGhe;
    }
    
}
