package bai12;

import bai12.model.BoSuuTap;
import bai12.model.HinhHoc;
import bai12.model.HinhTron;
import bai12.model.HinhVuong;

public class QuanLyHinhHoc {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BoSuuTap dshh = new BoSuuTap();
		dshh.addHinhHoc(new HinhVuong(12));
		dshh.addHinhHoc(new HinhTron(8));
		System.out.println(dshh);
	}

}