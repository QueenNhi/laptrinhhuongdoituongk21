package bailuyentap.model;

public class LapTop extends SanPham {
	private int ram;
	private String cpu;
	/**
	 * @param maSP
	 * @param tenSP
	 * @param soLuong
	 * @param giaCa
	 * @param ram
	 * @param cpu
	 */
	public LapTop(int maSP, String tenSP, int soLuong, double giaCa, int ram, String cpu) {
		super(maSP, tenSP, soLuong, giaCa);
		this.ram = ram;
		this.cpu = cpu;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}
	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", getMaSP()=" + getMaSP() + ", getTenSP()=" + getTenSP()
				+ ", getSoLuong()=" + getSoLuong() + ", getGiaCa()=" + getGiaCa() + "]";
	}
	
	
}