package bailuyentap2.model;

public abstract class VuKhi implements Cloneable {
	private String tenvk;
	private int soluong;
	public abstract void tanCong();
	public abstract void phongThu();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "VuKhi [tenvk=" + tenvk + ", soluong=" + soluong + "]";
	}

}
