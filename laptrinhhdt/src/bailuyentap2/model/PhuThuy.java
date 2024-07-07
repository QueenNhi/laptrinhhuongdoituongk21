package bailuyentap2.model;

import java.util.List;

public class PhuThuy extends NhanVat {
	private String phepthuat;

	/**
	 * @param nangluong
	 * @param ten
	 * @param phepthuat
	 */
	public PhuThuy(double nangluong, String ten, String phepthuat) {
		super(nangluong, ten);
		this.phepthuat = phepthuat;
	}

	/**
	 * @return the phepthuat
	 */
	public String getPhepthuat() {
		return phepthuat;
	}

	/**
	 * @param phepthuat the phepthuat to set
	 */
	public void setPhepthuat(String phepthuat) {
		this.phepthuat = phepthuat;
	}



	@Override
	public String toString() {
		return "PhuThuy [phepthuat=" + phepthuat + ", getNangluong()=" + getNangluong() + ", getTen()=" + getTen()
				+ ", getDsvk()=" + getDsvk() + "]";
	}

	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		System.out.println("Bay sang trai 15m");
	}

	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub
		System.out.println("Bay sang phai 10m");
	}


}
