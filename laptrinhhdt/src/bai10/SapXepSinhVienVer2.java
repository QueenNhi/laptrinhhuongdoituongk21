package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bai10.model2.SinhVien;

public class SapXepSinhVienVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Loc", 10, 20));		
		dssv.add(new SinhVien("Nhat", 8, 18));
		dssv.add(new SinhVien("Binh", 9, 22));
		System.out.println("SAP XEP THEO HO TEN");
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getHoten().compareTo(o2.getHoten());
			}
		});
		for(SinhVien item: dssv) {
			System.out.println(item);
		}
		
		System.out.println("SAP XEP THEO DTB");
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
		});
		for(SinhVien item: dssv) {
			System.out.println(item);
		}
		
		System.out.println("SAP XEP THEO TUOI");
		Collections.sort(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getTuoi(), o2.getTuoi());
			}
			
		});
		for(SinhVien sv: dssv) {
			System.out.println(sv);
		}
	}

}