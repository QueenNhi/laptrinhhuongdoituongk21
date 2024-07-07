package bailuyentap.model;

public class DongCo implements Cloneable {
	private String loaiDongCo;
	private double congSuat;
	/**
	 * @param loaiDongCo
	 * @param congSuat
	 */
	public DongCo(String loaiDongCo, double congSuat) {
		super();
		this.loaiDongCo = loaiDongCo;
		this.congSuat = congSuat;
	}
	/**
	 * @return the loaiDongCo
	 */
	public String getLoaiDongCo() {
		return loaiDongCo;
	}
	/**
	 * @param loaiDongCo the loaiDongCo to set
	 */
	public void setLoaiDongCo(String loaiDongCo) {
		this.loaiDongCo = loaiDongCo;
	}
	/**
	 * @return the congSuat
	 */
	public double getCongSuat() {
		return congSuat;
	}
	/**
	 * @param congSuat the congSuat to set
	 */
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public String toString() {
		return "DongCo [loaiDongCo=" + loaiDongCo + ", congSuat=" + congSuat + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}