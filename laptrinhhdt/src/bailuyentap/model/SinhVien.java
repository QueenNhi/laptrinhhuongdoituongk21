package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class SinhVien {
	private String hoTen;
	private LopHoc lop;
	private List<HoaDon> dshd;
	/**
	 * @param hoTen
	 * @param lop
	 */
	public SinhVien(String hoTen, LopHoc lop) {
		super();
		setHoTen(hoTen);
		this.lop = lop;
		this.dshd = new ArrayList<HoaDon>();
	}
	
	public void addHoaDon(HoaDon hd) {
		this.dshd.add(hd);
	}
	/**
	 * @return the hoTen
	 */
	
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	/**
	 * @return the lop
	 */
	public LopHoc getLop() {
		return lop;
	}
	/**
	 * @param lop the lop to set
	 */
	public void setLop(LopHoc lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", lop=" + lop + ", dshd=" + dshd + "]";
	}
	
	public List<HoaDon> getHoaDon() {
		return this.dshd;
	}
	
}