package bai12.model;

import java.util.ArrayList;
import java.util.List;

public class BoSuuTap {
	private List<HinhHoc> bst;

	/**
	 * @param bst
	 */
	public BoSuuTap() {
		super();
		this.bst = new ArrayList<HinhHoc>();
	}
	
	public void addHinhHoc(HinhHoc hh) throws CloneNotSupportedException {
		this.bst.add((HinhHoc)hh.clone());
	}

	/**
	 * @return the bst
	 */
	public List<HinhHoc> getBst() {
		return bst;
	}

	/**
	 * @param bst the bst to set
	 */
	public void setBst(List<HinhHoc> bst) {
		this.bst = bst;
	}

	@Override
	public String toString() {
		return "BoSuuTap [bst=" + bst + "]";
	}
	
	
}