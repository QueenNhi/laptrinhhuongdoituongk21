package bai11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.function.Predicate;
import bai11.model.SinhVien;

public class TimKiemHDT {

	public static void main(String[] args) {
		// Buoc 1: Tao du lieu
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Thong", 10, 17));
		dssv.add(new SinhVien("Quy", 9, 19));
		dssv.add(new SinhVien("Nhi", 9, 20));
		dssv.add(new SinhVien("Quang", 7, 18));
		System.out.println("Danh sach sinh vien ban dau");
		for(SinhVien item: dssv) {
			System.out.println(item);
		}
		System.out.println("--------------------------------");
		//Buoc 2: Tim kiem sinh vien co dtb thap nhat
		SinhVien sv_min = Collections.min(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
		});
		System.out.println("Sinh vien co dtb thap nhat la");
		System.out.println(sv_min);
		System.out.println("--------------------------------");
		//Buoc 3: Tim sinh vien co tuoi lon nhat
		SinhVien sv_max = Collections.max(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getTuoi(), o2.getTuoi());
			}
		});
		System.out.println("Sinh vien co tuoi cao nhat la");
		System.out.println(sv_max);
		System.out.println("--------------------------------");
		//Buoc 4: tim sv dau tien trong ds co ten la Quy
		int vitri = Collections.binarySearch(dssv, new SinhVien("Quy", 0, 0), 
				new Comparator<SinhVien>() {

					@Override
					public int compare(SinhVien o1, SinhVien o2) {
						// TODO Auto-generated method stub
						return o1.getHoten().compareTo(o2.getHoten());
					}
				});
		if (vitri < 0) {
			System.out.println("Khong tim thay ");
		}else {
			System.out.println("Vi tri cua sv co ten la Quy " + vitri);
			System.out.println(dssv.get(vitri));
		}
		System.out.println("--------------------------------");
//		Buoc 5: Su dung Stream va cu phap lambda
		List<SinhVien> kqloc = dssv.stream()
				.filter(sv -> sv.getDtb() >= 8)
				.filter(sv -> sv.getDtb() <= 10)
				.filter(sv -> sv.getTuoi() >= 18)
				.filter(sv -> sv.getTuoi() <= 20)
				.toList();
		System.out.println("Ket qua loc du lieu");
		for(SinhVien item: kqloc) {
			System.out.println(item);
		}
		System.out.println("--------------------------------");
//		//Buoc 6: Xay dung menh de logic - Predicate
		//Loc tat ca sinh vien co 8 <= dtb <= 10 OR 18 <= tuoi <= 20
		//Xay dung menh de logic 8 <= dtb <= 10
		Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
			@Override
			public boolean test(SinhVien t) {
				// TODO Auto-generated method stub
				return t.getDtb() >= 8 && t.getDtb() <= 10;
			}
		};
		//Xay dung menh de logic 18 <= tuoi <= 20
		Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {		
			@Override
			public boolean test(SinhVien t) {
				// TODO Auto-generated method stub
				return t.getTuoi() >= 18 && t.getTuoi() <= 20;
			}
		};
		//Tien hanh loc du lieu bang Stream va filter
		List<SinhVien> dskq = dssv.stream()
				.filter(dk_dtb.or(dk_tuoi))
				.toList();
		System.out.println("Ket qua loc du lieu 2");
		for(SinhVien item: dskq) {
			System.out.println(item);
		}
		System.out.println("--------------------------------");
	}

}