package bai12.model;

public class HinhTron extends HinhHoc {
	private double bankinh;
	
	/**
	 * @param bankinh
	 */
	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	/**
	 * @return the bankinh
	 */
	public double getBankinh() {
		return bankinh;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + "]";
	}

	/**
	 * @param bankinh the bankinh to set
	 */
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*bankinh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*bankinh*bankinh;
	}

}