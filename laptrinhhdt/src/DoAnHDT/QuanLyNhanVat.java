package DoAnHDT;

import DoAnHDT.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QuanLyNhanVat {
    private List<NhanVat> danhSachNhanVat;

    public QuanLyNhanVat() {
        this.danhSachNhanVat = new ArrayList<>();
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân vật:");
        String ten = scanner.nextLine();
        System.out.println("Nhập ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập năng lượng:");
        double nangLuong = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        NhanVat nhanVat = new NhanVat(ten, id, gioiTinh, nangLuong);
        danhSachNhanVat.add(nhanVat);
        System.out.println("Nhân vật đã được thêm.");
    }

    public void xuatDuLieu() {
        if (danhSachNhanVat.isEmpty()) {
            System.out.println("Danh sách nhân vật trống.");
            return;
        }
        System.out.println("\nDanh sách nhân vật:");
        for (NhanVat nhanVat : danhSachNhanVat) {
            System.out.println(nhanVat);
        }
    }

    public void sapXepTheoID() {
        Collections.sort(danhSachNhanVat, Comparator.comparingInt(NhanVat::getId));
    }

    public void sapXepTheoTen() {
        Collections.sort(danhSachNhanVat, Comparator.comparing(NhanVat::getTen));
    }

    public NhanVat timKiemTheoID(int id) {
        return danhSachNhanVat.stream()
                              .filter(nv -> nv.getId() == id)
                              .findFirst()
                              .orElse(null);
    }

    public NhanVat timKiemTheoTen(String ten) {
        return danhSachNhanVat.stream()
                              .filter(nv -> nv.getTen().equalsIgnoreCase(ten))
                              .findFirst()
                              .orElse(null);
    }

    public void suaNhanVat(int id) {
        Scanner scanner = new Scanner(System.in);
        NhanVat nhanVat = timKiemTheoID(id);
        if (nhanVat != null) {
            System.out.println("Nhập tên nhân vật mới:");
            nhanVat.setTen(scanner.nextLine());
            System.out.println("Nhập giới tính mới:");
            nhanVat.setGioiTinh(scanner.nextLine());
            System.out.println("Nhập năng lượng mới:");
            nhanVat.setNangLuong(scanner.nextDouble());
            scanner.nextLine(); // consume newline
            System.out.println("Thông tin nhân vật đã được cập nhật.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void xoaNhanVat(int id) {
        NhanVat nhanVat = timKiemTheoID(id);
        if (nhanVat != null) {
            danhSachNhanVat.remove(nhanVat);
            System.out.println("Nhân vật đã được xóa.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void themVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên vũ khí:");
            String ten = scanner.nextLine();
            System.out.println("Nhập loại vũ khí:");
            String loaiVuKhi = scanner.nextLine();
            System.out.println("Nhập màu mã:");
            String mauMa = scanner.nextLine();
            System.out.println("Nhập sức mạnh:");
            double sucManh = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            VuKhi vuKhi = new VuKhi(ten, loaiVuKhi, mauMa, sucManh);
            nhanVat.themVuKhi(vuKhi);
            System.out.println("Vũ khí đã được thêm.");
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void xoaVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên vũ khí cần xóa:");
            String ten = scanner.nextLine();
            VuKhi vuKhiCanXoa = nhanVat.getDanhSachVuKhi().stream()
                .filter(vuKhi -> vuKhi.getTen().equalsIgnoreCase(ten))
                .findFirst()
                .orElse(null);

            if (vuKhiCanXoa != null) {
                nhanVat.xoaVuKhi(vuKhiCanXoa);
                System.out.println("Vũ khí đã được xóa.");
            } else {
                System.out.println("Không tìm thấy vũ khí.");
            }
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public void hienThiDanhSachVuKhi(int idNhanVat) {
        NhanVat nhanVat = timKiemTheoID(idNhanVat);
        if (nhanVat != null) {
            List<VuKhi> danhSachVuKhi = nhanVat.getDanhSachVuKhi();
            if (danhSachVuKhi.isEmpty()) {
                System.out.println("Nhân vật không có vũ khí.");
                return;
            }
            System.out.println("Danh sách vũ khí của nhân vật " + nhanVat.getTen() + ":");
            for (VuKhi vuKhi : danhSachVuKhi) {
                System.out.println(vuKhi);
            }
        } else {
            System.out.println("Không tìm thấy nhân vật.");
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVat quanLy = new QuanLyNhanVat();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n╔══════════════════════════════════════════════╗");
            System.out.println("║                  Menu                          ║");
            System.out.println("╠════════════════════════════════════════════════╣");
            System.out.println("║ 1. Nhập nhân vật                               ║");
            System.out.println("║ 2. Hiển thị danh sách nhân vật                 ║");
            System.out.println("║ 3. Sắp xếp nhân vật theo ID                    ║");
            System.out.println("║ 4. Sắp xếp nhân vật theo tên                   ║");
            System.out.println("║ 5. Tìm kiếm nhân vật theo ID                   ║");
            System.out.println("║ 6. Tìm kiếm nhân vật theo tên                  ║");
            System.out.println("║ 7. Sửa thông tin nhân vật                      ║");
            System.out.println("║ 8. Xóa nhân vật                                ║");
            System.out.println("║ 9. Quản lý vũ khí                              ║");
            System.out.println("║ 10. Thoát                                      ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            System.out.print("Chọn một tùy chọn (1-10): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 10: ");
                scanner.next(); // consume invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    quanLy.nhapDuLieu();
                    break;
                case 2:
                    quanLy.xuatDuLieu();
                    break;
                case 3:
                    quanLy.sapXepTheoID();
                    System.out.println("Danh sách nhân vật sau khi sắp xếp theo ID:");
                    quanLy.xuatDuLieu();
                    break;
                case 4:
                    quanLy.sapXepTheoTen();
                    System.out.println("Danh sách nhân vật sau khi sắp xếp theo tên:");
                    quanLy.xuatDuLieu();
                    break;
                case 5:
                    System.out.print("Nhập ID nhân vật cần tìm: ");
                    int idTimKiem = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    NhanVat nhanVatTimKiem = quanLy.timKiemTheoID(idTimKiem);
                    if (nhanVatTimKiem != null) {
                        System.out.println("Tìm thấy nhân vật: " + nhanVatTimKiem);
                    } else {
                        System.out.println("Không tìm thấy nhân vật.");
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên nhân vật cần tìm: ");
                    String tenTimKiem = scanner.nextLine();
                    NhanVat nhanVatTimTheoTen = quanLy.timKiemTheoTen(tenTimKiem);
                    if (nhanVatTimTheoTen != null) {
                        System.out.println("Tìm thấy nhân vật: " + nhanVatTimTheoTen);
                    } else {
                        System.out.println("Không tìm thấy nhân vật.");
                    }
                    break;
                case 7:
                    System.out.print("Nhập ID nhân vật cần sửa: ");
                    int idSua = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    quanLy.suaNhanVat(idSua);
                    break;
                case 8:
                    System.out.print("Nhập ID nhân vật cần xóa: ");
                    int idXoa = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    quanLy.xoaNhanVat(idXoa);
                    break;
                case 9:
                    quanLy.quanLyVuKhi();
                    break;
                case 10:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 10);

        scanner.close();
    }

    private void quanLyVuKhi() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n╔══════════════════════════════════════════════╗");
            System.out.println("║          Menu Quản Lý Vũ Khí                   ║");
            System.out.println("╠════════════════════════════════════════════════╣");
            System.out.println("║ 1. Thêm vũ khí vào nhân vật                    ║");
            System.out.println("║ 2. Xóa vũ khí khỏi nhân vật                    ║");
            System.out.println("║ 3. Hiển thị danh sách vũ khí của nhân vật      ║");
            System.out.println("║ 4. Quay lại                                    ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            System.out.print("Chọn một tùy chọn (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 4: ");
                scanner.next(); // consume invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID nhân vật để thêm vũ khí: ");
                    int idThemVuKhi = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    themVuKhi(idThemVuKhi);
                    break;
                case 2:
                    System.out.print("Nhập ID nhân vật để xóa vũ khí: ");
                    int idXoaVuKhi = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    xoaVuKhi(idXoaVuKhi);
                    break;
                case 3:
                    System.out.print("Nhập ID nhân vật để hiển thị danh sách vũ khí: ");
                    int idHienThiVuKhi = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    hienThiDanhSachVuKhi(idHienThiVuKhi);
                    break;
                case 4:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
    }
}
