package baitaptinhdiem;

public class PhuThuy extends NhanVat {
    private String phongCach;
    private int sucManhPhepThuat;
    private boolean choi;
    private boolean gay;
	public PhuThuy(String ten, String id, byte gioiTinh, double nangLuong, String phongCach, int sucManhPhepThuat, boolean choi, boolean gay) {
		super(ten, id, gioiTinh, nangLuong);
		this.phongCach = phongCach;
		this.sucManhPhepThuat = sucManhPhepThuat;
		this.choi = choi;
		this.gay = gay;
	
	}
	public String getPhongCach() {
		return phongCach;
	}
	public void setPhongCach(String phongCach) {
		this.phongCach = phongCach;
	}
	public int getSucManhPhepThuat() {
		return sucManhPhepThuat;
	}
	public void setSucManhPhepThuat(int sucManhPhepThuat) {
		this.sucManhPhepThuat = sucManhPhepThuat;
	}
	 public boolean isChoi() {
	        return choi;
	    }

	    public void setChoi(boolean choi) {
	        this.choi = choi;
	    }

	    public boolean gay() {
	        return gay;
	    }

	    public void setGay(boolean gay) {
	        this.gay = gay;
	    }

	    @Override
	    public String toString() {
	        return "PhuThuy [phongCach=" + phongCach + ", sucManhPhepThuat=" + sucManhPhepThuat + ", choi=" + choi
	                + ", gay=" + gay + "]";
	    }

    
}
