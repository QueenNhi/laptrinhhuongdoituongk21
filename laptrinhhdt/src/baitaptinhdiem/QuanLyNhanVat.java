package baitaptinhdiem;

public class QuanLyNhanVat {
    public static void main(String[] args) {
        BoBinh boBinh = new BoBinh("Nguyen Van A", "NV001", (byte) 1, 100.0, 5, 200.0);
        KiemKhach kiemKhach = new KiemKhach("Nguyen Van B", "NV002", (byte) 0, 100.0, 10, 5);
        KyBinh kyBinh = new KyBinh("Phuoc", "IT2005", (byte) 1, 10, "giao", 5, true, false, false, false);
        PhuThuy phuThuy = new PhuThuy("Nguyen Van D", "NV004", (byte) 0, 150.0, "Basic", 15, true, true);

        // Sử dụng các phương thức của từng đối tượng
        System.out.println(boBinh);
        System.out.println(kiemKhach);
        System.out.println(kyBinh);
        System.out.println(phuThuy);
    }
}