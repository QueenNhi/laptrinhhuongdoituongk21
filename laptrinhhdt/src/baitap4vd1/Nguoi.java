package baitap4vd1;
import java.time.*;
public class Nguoi {
	private String hoten;
	private int namsinh;
	public Nguoi(String hoten, int namsinh) {
		super();
		this.hoten = hoten;
		this.setNamsinh(namsinh);
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		LocalDate ngayhientai = LocalDate.now();
		int namhientai = ngayhientai.getYear();
		if((namsinh <=0)||(namsinh > namhientai)) {
			System.out.println("nam sinh sai !!");
		}
		this.namsinh = namsinh;
	}
	@Override
	public String toString() {
		return "Nguoi [hoten=" + hoten + ", namsinh=" + namsinh + "]";
	}
	
}
