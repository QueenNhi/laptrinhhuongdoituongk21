package bai12.model;

public abstract class HinhHoc implements Cloneable{
	private double chuvi;
	private double dientich;
	
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}