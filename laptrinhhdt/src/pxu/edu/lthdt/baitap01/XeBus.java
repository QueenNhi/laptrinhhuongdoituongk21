package pxu.edu.lthdt.baitap01;
import java.time.LocalDate;

public class XeBus {
	
    
private String hangxe;
private int namsanxuat;
private float dongco;
private int soghe;
public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
	super();
	this.setHangxe(hangxe);
	this.setNamsanxuat(namsanxuat);
	this.setDongco(dongco);
	this.setSoghe(soghe);
}
public String getHangxe() {
	return hangxe;
}
public void setHangxe(String hangxe) {
	this.hangxe = hangxe;
}
public int getNamsanxuat() {
	return namsanxuat;
}
public void setNamsanxuat(int namsanxuat) { 
	LocalDate ngayht = LocalDate.now();
	int namhientai = ngayht.getYear();
	if((namsanxuat < 1896) || (namsanxuat > namhientai)) {
		System.out.println("Nam san xuat khong phu hop");
	}else {
		this.namsanxuat = namsanxuat;
	}
	
}
public float getDongco() {
	return dongco;
}
public void setDongco(float dongco) { 
	
	if (dongco <= 0) {
        System.out.println("Dong co khong the co cong suat la " + dongco + "kW");
    } else {
        this.dongco = dongco;
    }
	this.dongco = dongco;
}
public int getSoghe() { 
	
	
	return soghe;
}
public void setSoghe(int soghe) { 
	
	 if (soghe <= 0) {
         System.out.println("So ghe " + soghe + " khong hop le.");
     } else {
         this.soghe = soghe;
     }
	this.soghe = soghe;
}
@Override
public String toString() {
	return "XeBus [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe + "]";
} 

}
    
   
    