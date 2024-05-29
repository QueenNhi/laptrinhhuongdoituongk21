package baitap4vd2;

public class Tho extends DongVat {

    private int soluong;
    private String mausac;
    private String giong;
//
    public Tho(String ten, int namsinh, String gioitinh, int soluong, String mausac, String giong) {
        super(ten, namsinh, gioitinh);
        this.soluong = soluong;
        this.mausac = mausac;
        this.giong = giong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    @Override
    public String toString() {
        return "Tho{" +
                "ten='" + getTen() + '\'' +
                ", namsinh=" + getNamsinh() +
                ", gioitinh='" + getGioitinh() + '\'' +
                ", soluong=" + soluong +
                ", mausac='" + mausac + '\'' +
                ", giong='" + giong + '\'' +
                '}';
    }

}
