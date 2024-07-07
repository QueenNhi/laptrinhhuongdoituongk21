package bai11.model;

public class SinhVien {
	private String hoten;
	private double dtb;
	private int tuoi;
	public SinhVien(String hoten, double dtb, int tuoi) {
		super();
		this.hoten = hoten;
		this.dtb = dtb;
		this.tuoi = tuoi;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", dtb=" + dtb + ", tuoi=" + tuoi + "]";
	}
	

}
