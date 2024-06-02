package baitaptinhdiem;
	
	public class BoBinh extends NhanVat {
	    private int soNamKinhNghiem;
	    private double chienCong;
	    private String ten;
		private String id ;
		protected byte gioiTinh;
		private double nangLuong;	
	    
		public BoBinh(String ten, String id, byte gioiTinh, double nangLuong, int soNamKinhNghiem, double chienCong) {
			super(ten, id, gioiTinh, nangLuong);
			this.soNamKinhNghiem = soNamKinhNghiem;
			this.chienCong = chienCong;
			this.ten = ten;
			this.id = id;
			this.gioiTinh = gioiTinh;
			this.nangLuong = nangLuong;		
		}

		public int getSoNamKinhNghiem() {
			return soNamKinhNghiem;
		}

		public void setSoNamKinhNghiem(int soNamKinhNghiem) {
			this.soNamKinhNghiem = soNamKinhNghiem;
		}

		public double getChienCong() {
			return chienCong;
		}

		public void setChienCong(double chienCong) {
			this.chienCong = chienCong;
		}

		public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public byte getGioiTinh() {
			return gioiTinh;
		}

		public void setGioiTinh(byte gioiTinh) {
			this.gioiTinh = gioiTinh;
		}

		public double getNangLuong() {
			return nangLuong;
		}

		public void setNangLuong(double nangLuong) {
			this.nangLuong = nangLuong;
		}

		@Override
		public String toString() {
			return "BoBinh [soNamKinhNghiem=" + soNamKinhNghiem + ", chienCong=" + chienCong + ", ten=" + ten + ", id="
					+ id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + "]";
		}

		
	   
	}