package DoAnHDT.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private Connection conn;
    private String ipadd = "127.0.0.1";
    private String port = "3306";
    private String database = "qlsv";
    private String username = "root";
    private String password = "@Dmin1234";
    
    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://" + ipadd + ":" + port + "/" + database, username, password);
            System.out.println("Kết nối đến CSDL thành công.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Lỗi phần mềm: Không tìm thấy driver JDBC.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi kết nối đến máy chủ CSDL.");
        }
    }
    
    public Connection getConnection() {
        return this.conn;
    }
    
    public boolean isConnected() {
        try {
            return this.conn != null && !this.conn.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static DBConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DBConnection();
        }
        return instance;
    }
}