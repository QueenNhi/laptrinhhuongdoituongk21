package bailuyentap2.model;

import java.util.ArrayList;
import java.util.List;

public class NhanVat implements DiChuyen {
	private double nangluong;
	private String ten;
	private List<VuKhi> dsvk;


	
	public NhanVat(double nangluong, String ten) {
		super();
		this.nangluong = nangluong;
		this.ten = ten;
		this.dsvk = new ArrayList<VuKhi>();
	}

	public void addVuKhi(VuKhi vk) throws CloneNotSupportedException {
		this.dsvk.add((VuKhi)vk.clone());
	}


	/**
	 * @return the nangluong
	 */
	public double getNangluong() {
		return nangluong;
	}

	/**
	 * @param nangluong the nangluong to set
	 */
	public void setNangluong(double nangluong) {
		this.nangluong = nangluong;
	}

	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}

	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}

	/**
	 * @return the dsvk
	 */
	public List<VuKhi> getDsvk() {
		return dsvk;
	}

	/**
	 * @param dsvk the dsvk to set
	 * @throws CloneNotSupportedException 
	 */
	public void setDsvk(List<VuKhi> dsvk) throws CloneNotSupportedException {
		for(VuKhi item: dsvk) {
			this.dsvk.add((VuKhi)item.clone());
		}
	}



	@Override
	public String toString() {
		return "NhanVat [nangluong=" + nangluong + ", ten=" + ten + ", dsvk=" + dsvk + "]";
	}

	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub

	}

	@Override
	public void diLen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diXuong() {
		// TODO Auto-generated method stub
		
	}

}