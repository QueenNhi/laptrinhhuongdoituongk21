package bai10.model2;

public class SinhVien {
	private String hoten;
	private double dtb;
	private int tuoi;
	/**
	 * @param hoten
	 * @param dtb
	 * @param tuoi
	 */
	public SinhVien(String hoten, double dtb, int tuoi) {
		super();
		this.hoten = hoten;
		this.dtb = dtb;
		this.tuoi = tuoi;
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	/**
	 * @return the dtb
	 */
	public double getDtb() {
		return dtb;
	}
	/**
	 * @param dtb the dtb to set
	 */
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}
	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", dtb=" + dtb + ", tuoi=" + tuoi + "]";
	}
	
}