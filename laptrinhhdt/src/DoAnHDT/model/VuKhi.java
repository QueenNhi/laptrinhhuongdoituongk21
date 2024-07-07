package DoAnHDT.model;
public class VuKhi {
    private String ten;
    private String loaiVuKhi;
    private String mauMa;
    private double sucManh;

    // Constructor công khai
    public VuKhi(String ten, String loaiVuKhi, String mauMa, double sucManh) {
        this.ten = ten;
        this.loaiVuKhi = loaiVuKhi;
        this.mauMa = mauMa;
        this.sucManh = sucManh;
    }

    // Getter và Setter cho các thuộc tính
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiVuKhi() {
        return loaiVuKhi;
    }

    public void setLoaiVuKhi(String loaiVuKhi) {
        this.loaiVuKhi = loaiVuKhi;
    }

    public String getMauMa() {
        return mauMa;
    }

    public void setMauMa(String mauMa) {
        this.mauMa = mauMa;
    }

    public double getSucManh() {
        return sucManh;
    }

    public void setSucManh(double sucManh) {
        this.sucManh = sucManh;
    }

    @Override
    public String toString() {
        return "VuKhi [Tên=" + ten + ", Loại=" + loaiVuKhi + ", Màu mã=" + mauMa + ", Sức mạnh=" + sucManh + "]";
    }
}



