package DoAnHDT.model;

import java.util.ArrayList;
import java.util.List;

public class KyBinh extends NhanVat {
    String guom;
    String giao;
    String cung;
    String ngua;
    int soNamDaoTao;

    public KyBinh(String ten, int id, String gioiTinh, double nangLuong, String guom, String giao, String cung, String ngua, int soNamDaoTao) {
        super(ten, id, gioiTinh, nangLuong);
        this.guom = guom;
        this.giao = giao;
        this.cung = cung;
        this.ngua = ngua;
        this.soNamDaoTao = soNamDaoTao;
    }
}