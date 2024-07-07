package bailuyentap.model;

public class SanPham implements Cloneable{
	private int maSP;
	private String tenSP;
	private int soLuong;
	private double giaCa;
	/**
	 * @param maSP
	 * @param tenSP
	 * @param soLuong
	 * @param giaCa
	 */
	public SanPham(int maSP, String tenSP, int soLuong, double giaCa) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.giaCa = giaCa;
	}
	/**
	 * @return the maSP
	 */
	public int getMaSP() {
		return maSP;
	}
	/**
	 * @param maSP the maSP to set
	 */
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	/**
	 * @return the tenSP
	 */
	public String getTenSP() {
		return tenSP;
	}
	/**
	 * @param tenSP the tenSP to set
	 */
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @return the giaCa
	 */
	public double getGiaCa() {
		return giaCa;
	}
	/**
	 * @param giaCa the giaCa to set
	 */
	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", giaCa=" + giaCa + "]";
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}