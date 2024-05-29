package Baividu4;

public class QuanLyChaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopCha obj1 = new LopCha("Lop Cha", 15, 33.1417);
		obj1.thuoctinh2=16;
		obj1.thuoctinh3=7.5;
		System.out.println(obj1);
		obj1.phuongthuc2();
		obj1.phuongthuc3();
		obj1.vidugoiprivate();
		System.out.println(obj1);
	}

}
