package baitap4vd2;

public class DongVat {
	 private String ten;
	    private int namsinh;
	    private String gioitinh;
	//
	    public DongVat(String ten, int namsinh, String gioitinh) {
	        this.ten = ten;
	        this.namsinh = namsinh;
	        this.gioitinh = gioitinh;
	    }

	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public int getNamsinh() {
	        return namsinh;
	    }

	    public void setNamsinh(int namsinh) {
	        this.namsinh = namsinh;
	    }

	    public String getGioitinh() {
	        return gioitinh;
	    }

	    public void setGioitinh(String gioitinh) {
	        this.gioitinh = gioitinh;
	    }

	    @Override
	    public String toString() {
	        return "DongVat{" +
	                "ten='" + ten + '\'' +
	                ", namsinh=" + namsinh +
	                ", gioitinh='" + gioitinh + '\'' +
	                '}';
	    }

}
