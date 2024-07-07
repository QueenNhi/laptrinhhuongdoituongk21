package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
	private String tenLop;
	private List<SinhVien> dssv;
	/**
	 * @param tenLop
	 * @param dssv
	 */
	public LopHoc(String tenLop) {
		super();
		setTenLop(tenLop);
		this.dssv = new ArrayList<SinhVien>();
	}
	/**
	 * @return the tenLop
	 */
	public String getTenLop() {
		return tenLop;
	}
	/**
	 * @param tenLop the tenLop to set
	 */
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	/**
	 * @return the dssv
	 */
	public List<SinhVien> getDssv() {
		return dssv;
	}
	/**
	 * @param dssv the dssv to set
	 */
	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	@Override
	public String toString() {
		return "LopHoc [tenLop=" + tenLop + ", dssv=" + dssv + "]";
	}
	
	
	
	
	
}