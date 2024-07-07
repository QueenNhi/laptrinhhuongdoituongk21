package bai14;

import java.sql.Connection;
import java.sql.SQLException;

import bai14.business.DBConnection;

public class LapTrinhCSDL {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Tao ket noi den CSDL tren may ao fedora server 40
		Connection kncsdl = DBConnection.getInstance().getConnection();
		if(kncsdl != null) {
			System.out.println("Ket noi toi may chu CSDL thanh cong");
		}else {
			System.out.println("Loi ket noi");
		}
	}

}