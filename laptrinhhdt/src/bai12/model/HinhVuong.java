package bai12.model;

public class HinhVuong extends HinhHoc {
	private double canh;
	
	/**
	 * @param canh
	 */
	public HinhVuong(double canh) {
		super();
		this.canh = canh;
	}
	
	/**
	 * @return the canh
	 */
	public double getCanh() {
		return canh;
	}
	

	@Override
	public String toString() {
		return "HinhVuong [canh=" + canh + "]";
	}

	/**
	 * @param canh the canh to set
	 */
	public void setCanh(double canh) {
		this.canh = canh;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 4*canh;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return canh*canh;
	}

}