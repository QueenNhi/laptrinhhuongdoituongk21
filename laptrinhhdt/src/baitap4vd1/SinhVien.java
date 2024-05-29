package baitap4vd1;

public class SinhVien {
	 private String hoten;
	    private int namsinh;
	    private String sdt;

	    // Default constructor
	    public SinhVien() {
	    }

	    // Parameterized constructor
	    public SinhVien(String hoten, int namsinh, String sdt) {
	        this.hoten = hoten;
	        this.namsinh = namsinh;
	        this.sdt = sdt;
	    }

	    // Getters and Setters
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
	        this.namsinh = namsinh;
	    }

	    public String getSdt() {
	        return sdt;
	    }

	    public void setSdt(String sdt) {
	        this.sdt = sdt;
	    }

		@Override
		public String toString() {
			if(this.namsinh==0) {
				return "SinhVien [hoten=" + hoten  + ", sdt=" + sdt + "]";
			}
			return "SinhVien [hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + "]";
		}

}
