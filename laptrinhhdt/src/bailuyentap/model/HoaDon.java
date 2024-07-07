package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
	private int soHoaDon;
	private List<SanPham> dssp;
	/**
	 * @param soHoaDon
	 */
	public HoaDon(int soHoaDon) {
		super();
		this.soHoaDon = soHoaDon;
		this.dssp = new ArrayList<>();
	}
	
	public void addSanPham(SanPham sp) throws CloneNotSupportedException {
		this.dssp.add((SanPham) sp.clone());
	}

	/**
	 * @return the soHoaDon
	 */
	public int getSoHoaDon() {
		return soHoaDon;
	}

	/**
	 * @param soHoaDon the soHoaDon to set
	 */
	public void setSoHoaDon(int soHoaDon) {
		this.soHoaDon = soHoaDon;
	}

	/**
	 * @return the dssp
	 */
	public List<SanPham> getDssp() {
		return dssp;
	}

	/**
	 * @param dssp the dssp to set
	 */
	public void setDssp(List<SanPham> dssp) {
		for(SanPham item: dssp) {
			this.dssp.add(item);
		}
	}

	@Override
	public String toString() {
		return "HoaDon [soHoaDon=" + soHoaDon + ", dssp=" + dssp + "]";
	}
	
	
	
	
	
	
}