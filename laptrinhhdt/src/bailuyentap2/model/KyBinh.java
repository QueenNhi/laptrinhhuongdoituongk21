package bailuyentap2.model;

public class KyBinh extends NhanVat {
	public String sonamDaoTao;
	public String ngưa;
	public String guom;
	
	
	public KyBinh(double nangluong, String ten, String sonamDaoTao, String ngưa, String guom) {
		super(nangluong, ten);
		this.sonamDaoTao = sonamDaoTao;
		this.ngưa = ngưa;
		this.guom = guom;
	}


	public String getSonamDaoTao() {
		return sonamDaoTao;
	}


	public void setSonamDaoTao(String sonamDaoTao) {
		this.sonamDaoTao = sonamDaoTao;
	}


	public String getNgưa() {
		return ngưa;
	}


	public void setNgưa(String ngưa) {
		this.ngưa = ngưa;
	}


	public String getGuom() {
		return guom;
	}


	public void setGuom(String guom) {
		this.guom = guom;
	}


	@Override
	public String toString() {
		return "KyBinh [sonamDaoTao=" + sonamDaoTao + ", ngưa=" + ngưa + ", guom=" + guom + "]";
	}

}
