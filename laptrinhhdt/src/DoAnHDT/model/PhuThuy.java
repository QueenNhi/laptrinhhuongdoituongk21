package DoAnHDT.model;

import java.util.List;

public class PhuThuy extends NhanVat {
    String phongCach;
    String sucManhPhepThuat;

    public PhuThuy(String ten, int id, String gioiTinh, double nangLuong, String phongCach, String sucManhPhepThuat) {
        super(ten, id, gioiTinh, nangLuong);
        this.phongCach = phongCach;
        this.sucManhPhepThuat = sucManhPhepThuat;
    }
}