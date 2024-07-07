package bailuyentap.model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham {
	private DongCo dongco;
	private List<BanhXe> dsbx;
	/**
	 * @param maSP
	 * @param tenSP
	 * @param soLuong
	 * @param giaCa
	 * @param dongco
	 */
	public XeHoi(int maSP, String tenSP, int soLuong, double giaCa, DongCo dongco) {
		super(maSP, tenSP, soLuong, giaCa);
		this.dongco = dongco;
		this.dsbx = new ArrayList<BanhXe>();
	}
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		this.dsbx.add((BanhXe)bx.clone());
	}
	/**
	 * @return the dongco
	 */
	public DongCo getDongco() {
		return dongco;
	}
	/**
	 * @param dongco the dongco to set
	 * @throws CloneNotSupportedException 
	 */
	public void setDongco(DongCo dongco) throws CloneNotSupportedException {
		this.dongco = (DongCo)dongco.clone();
	}
	/**
	 * @return the dsbx
	 */
	public List<BanhXe> getDsbx() {
		return dsbx;
	}
	/**
	 * @param dsbx the dsbx to set
	 * @throws CloneNotSupportedException 
	 */
	public void setDsbx(List<BanhXe> dsbx) throws CloneNotSupportedException {
		for(BanhXe item: dsbx) {
			this.dsbx.add((BanhXe)item.clone());
		}
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoLuong()=" + getSoLuong() + ", getGiaCa()=" + getGiaCa() + "]";
	}
	
	
}