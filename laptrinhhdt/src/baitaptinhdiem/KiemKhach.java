package baitaptinhdiem;

public class KiemKhach extends NhanVat {
    private int soKiem;
    private int capDoSuDung;

    public KiemKhach(String ten, String id, byte gioiTinh, double nangLuong, int soKiem, int capDoSuDung) {
        super(ten, id, gioiTinh, nangLuong);
        this.soKiem = soKiem;
        this.capDoSuDung = capDoSuDung;
    }

    public int getSoKiem() {
        return soKiem;
    }

    public void setSoKiem(int soKiem) {
        this.soKiem = soKiem;
    }

    public int getCapDoSuDung() {
        return capDoSuDung;
    }

    public void setCapDoSuDung(int capDoSuDung) {
        this.capDoSuDung = capDoSuDung;
    }

    @Override
    public String toString() {
        return "KiemKhach [soKiem=" + soKiem + ", capDoSuDung=" + capDoSuDung + "]";
    }
}