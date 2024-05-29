package baitap4vd1;

public class GiangVien {
	 private String ten;
	    private int namSinh;
	    private String maGiangVien;
	    private String trinhDo;
	    private String chuyenNganh;

	    public GiangVien(String ten, int namSinh, String maGiangVien, String trinhDo, String chuyenNganh) {
	        this.ten = ten;
	        this.namSinh = namSinh;
	        this.maGiangVien = maGiangVien;
	        this.trinhDo = trinhDo;
	        this.chuyenNganh = chuyenNganh;
	    }

	    // Getter và Setter
	    public String getTen() {
	        return ten;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public int getNamSinh() {
	        return namSinh;
	    }

	    public void setNamSinh(int namSinh) {
	        this.namSinh = namSinh;
	    }

	    public String getMaGiangVien() {
	        return maGiangVien;
	    }

	    public void setMaGiangVien(String maGiangVien) {
	        this.maGiangVien = maGiangVien;
	    }

	    public String getTrinhDo() {
	        return trinhDo;
	    }

	    public void setTrinhDo(String trinhDo) {
	        this.trinhDo = trinhDo;
	    }

	    public String getChuyenNganh() {
	        return chuyenNganh;
	    }

	    public void setChuyenNganh(String chuyenNganh) {
	        this.chuyenNganh = chuyenNganh;
	    }

		@Override
		public String toString() {
			return "GiangVien [ten=" + ten + ", namSinh=" + namSinh + ", maGiangVien=" + maGiangVien + ", trinhDo="
					+ trinhDo + ", chuyenNganh=" + chuyenNganh + ", toString()=" + super.toString() + "]";
		}


}
