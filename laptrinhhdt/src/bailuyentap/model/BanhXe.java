package bailuyentap.model;

public class BanhXe implements Cloneable {
      private String loaiBanhXe;
      private double banKinh;
	/**
	 * @param loaiBanhXe
	 * @param banKinh
	 */
	public BanhXe(String loaiBanhXe, double banKinh) {
		super();
		this.loaiBanhXe = loaiBanhXe;
		this.banKinh = banKinh;
	}
	/**
	 * @return the loaiBanhXe
	 */
	public String getLoaiBanhXe() {
		return loaiBanhXe;
	}
	/**
	 * @param loaiBanhXe the loaiBanhXe to set
	 */
	public void setLoaiBanhXe(String loaiBanhXe) {
		this.loaiBanhXe = loaiBanhXe;
	}
	/**
	 * @return the banKinh
	 */
	public double getBanKinh() {
		return banKinh;
	}
	/**
	 * @param banKinh the banKinh to set
	 */
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	@Override
	public String toString() {
		return "BanhXe [loaiBanhXe=" + loaiBanhXe + ", banKinh=" + banKinh + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

      
}