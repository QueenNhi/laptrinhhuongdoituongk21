package bailuyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bailuyentap.model.BanhXe;
import bailuyentap.model.DongCo;
import bailuyentap.model.HoaDon;
import bailuyentap.model.LapTop;
import bailuyentap.model.LopHoc;
import bailuyentap.model.SanPham;
import bailuyentap.model.SinhVien;
import bailuyentap.model.XeHoi;

public class quanlysanpham {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<XeHoi> cars = new ArrayList<XeHoi>();
		XeHoi car1 = new XeHoi(1, "Toyota", 2, 1000, new DongCo("Dong co xang", 140));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		car1.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car1);
		XeHoi car2 = new XeHoi(1, "Vinfast", 2, 1500, new DongCo("Dong co dien", 140));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		car2.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car2);
		XeHoi car3 = new XeHoi(1, "Lambo", 2, 1000, new DongCo("Dong co xang", 140));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		car3.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car3);
		XeHoi car4 = new XeHoi(1, "Audi", 2, 2000, new DongCo("Dong co xang", 140));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		car4.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car4);
		XeHoi car5 = new XeHoi(1, "Honda", 2, 1000, new DongCo("Dong co xang", 140));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		car5.addBanhXe(new BanhXe("caosu", 1.5));
		cars.add(car5);
		System.out.println("Danh sach xe hoi");
		for(XeHoi item: cars) {
			System.out.println(item);
		}
		//Tao list 7 laptop
		List<LapTop> lts = new ArrayList<LapTop>();
		lts.add(new LapTop(1, "Dell", 1, 15000000, 16, "i7"));
		lts.add(new LapTop(2, "MSI", 1, 17000000, 32, "i9"));
		lts.add(new LapTop(3, "Lenovo", 1, 15000000, 16, "i7"));
		lts.add(new LapTop(4, "Mac Air 3", 1, 15000000, 16, "i7"));
		lts.add(new LapTop(5, "HP", 1, 15000000, 16, "i7"));
		lts.add(new LapTop(6, "ROG", 1, 15000000, 16, "i7"));
		lts.add(new LapTop(7, "Asus", 1, 15000000, 16, "i7"));
		for (LapTop item: lts) {
			System.out.println(item);
		}
		//Tao 1 doi tuong kieu SV co 1 hoadon chua 5 sanpham gom laptop va XeHoi
		
		List<SanPham> listSanPham = new ArrayList<SanPham>();
		
		listSanPham.add(new LapTop(123, "Mac", 5, 1500, 365,"i7"));
		listSanPham.add(car5);
		listSanPham.add(new LapTop(234, "Win", 5, 1500, 365,"i7"));
		listSanPham.add(car4);
		listSanPham.add(new LapTop(357, "Dell", 5, 1500, 365,"i7"));
		
		HoaDon hoaDon = new HoaDon(123);
		hoaDon.setDssp(listSanPham);
		
		System.out.println(hoaDon);
		
		SinhVien sv = new SinhVien("HỒ THỊ QUỲNH NHI", new LopHoc("CNTT"));
		sv.addHoaDon(hoaDon);
		
		System.out.println(sv);
		
		//Sap xep List<XeHoi> cars theo gia xe
		Collections.sort(cars, new Comparator<XeHoi>() {

			@Override
			public int compare(XeHoi o1, XeHoi o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGiaCa(), o2.getGiaCa());
			}
			
		});
		for (SanPham sanPham : cars) {
			System.out.println(sanPham);
		}
		
		//Sap xep List<Laptop> theo RAM
		Collections.sort(lts, new Comparator<LapTop>() {

			@Override
			public int compare(LapTop o1, LapTop o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getRam(), o2.getRam());
			}
			
		});
		for(LapTop item : lts) {
			System.out.println(item);
		}
		
		//Tim kiem SanPham co gia cao nhat trong HoaDon cua SinhVien
		List<SanPham> dssp = sv.getHoaDon().get(0).getDssp();
		SanPham tam = Collections.max(dssp, new Comparator<SanPham>() {
			@Override
			public int compare(SanPham o1, SanPham o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGiaCa(), o2.getGiaCa());
			}
		});
		System.out.println(tam);
		//Tim kiem bang Predicate
		Predicate<SanPham> dk_tk = new Predicate<SanPham>() {
			
			@Override
			public boolean test(SanPham t) {
				// TODO Auto-generated method stub
				return t.getGiaCa()>=1000 && t.getSoLuong()<=5;
			}
		};
		List<SanPham> dskq = dssp.stream()
				.filter(dk_tk)
				.toList();
		System.out.println("danh sach tim kiem");
		for(SanPham item: dskq) {
			System.out.println(item);
		}
	}
	

}