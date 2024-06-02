package baitaptinhdiem;

public class KyBinh extends NhanVat {
    private String loaiVukhi;
    private boolean guom;
    private boolean giao;
    private boolean cung;
    private boolean ngua;
    private int soNamDaoTao;
	public KyBinh(String ten, String id, byte gioiTinh, double nangLuong, String loaiVukhi, int soNamDaoTao, boolean giao, boolean guom, boolean ngua, boolean cung) {
		super(ten, id, gioiTinh, nangLuong);
		this.loaiVukhi = loaiVukhi;
		this.soNamDaoTao = soNamDaoTao;
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}

	public String getLoaiVukhi() {
		return loaiVukhi;
	}
	public void setLoaiVukhi(String loaiVukhi) {
		this.loaiVukhi = loaiVukhi;
	}
	public int getSoNamDaoTao() {
		return soNamDaoTao;
	}
	public void setSoNamDaoTao(int soNamDaoTao) {
		this.soNamDaoTao = soNamDaoTao;
	}
	 public boolean isGuom() {
	        return guom;
	    }

	    public void setGuom(boolean guom) {
	        this.guom = guom;
	    }

	    public boolean isGiao() {
	        return giao;
	    }

	    public void setGiao(boolean giao) {
	        this.giao = giao;
	    }

	    public boolean isCung() {
	        return cung;
	    }

	    public void setCung(boolean cung) {
	        this.cung = cung;
	    }

	    public boolean isNgua() {
	        return ngua;
	    }

	    public void setNgua(boolean ngua) {
	        this.ngua = ngua;
	    }

	    @Override
	    public String toString() {
	        return "KyBinh [loaiVukhi=" + loaiVukhi + ", guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", soNamDaoTao=" + soNamDaoTao + "]";
	    }
	}

 
