package DoAnHDT.model;
import java.util.ArrayList;
import java.util.List;


public class NhanVat {
    private String ten;
    private int id;
    private String gioiTinh;
    private double nangLuong;
    private List<VuKhi> danhSachVuKhi; // Danh sách vũ khí

    public NhanVat(String ten, int id, String gioiTinh, double nangLuong) {
        this.ten = ten;
        this.id = id;
        this.gioiTinh = gioiTinh;
        this.nangLuong = nangLuong;
        this.danhSachVuKhi = new ArrayList<>();
    }

    // Getter và Setter cho tất cả các thuộc tính
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(double nangLuong) {
        this.nangLuong = nangLuong;
    }

    public List<VuKhi> getDanhSachVuKhi() {
        return danhSachVuKhi;
    }

    public void setDanhSachVuKhi(List<VuKhi> danhSachVuKhi) {
        this.danhSachVuKhi = danhSachVuKhi;
    }

    // Thêm một vũ khí vào danh sách
    public void themVuKhi(VuKhi vuKhi) {
        this.danhSachVuKhi.add(vuKhi);
    }

    // Xóa một vũ khí khỏi danh sách
    public void xoaVuKhi(VuKhi vuKhi) {
        this.danhSachVuKhi.remove(vuKhi);
    }

    @Override
    public String toString() {
        return "NhanVat{" +
                "ten='" + ten + '\'' +
                ", id=" + id +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", nangLuong=" + nangLuong +
                ", danhSachVuKhi=" + danhSachVuKhi +
                '}';
    }
}