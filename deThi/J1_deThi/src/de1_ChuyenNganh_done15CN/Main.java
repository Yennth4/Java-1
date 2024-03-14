package de1_ChuyenNganh_done15CN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ChuyenNganh> listChuyenNganh = new ArrayList<>();
        ArrayList<UDPM> list = new ArrayList<>();
        QLChuyenNganhService chuyenNganhService = new QLChuyenNganhService();
        chuyenNganhService.fakeData(listChuyenNganh);
        int chon;
        do {
            System.out.println("1. Thêm chuyên ngành");
            System.out.println("2. Hiển thị danh sách chuyên ngành");
            System.out.println("3. Tìm kiếm chuyên ngành bắt đầu bằng \"c\"");
            System.out.println("4. Hiển thị danh sách chuyên ngành ở vị trí chẵn");
            System.out.println("5. Sắp xếp danh sách chuyên ngành tăng dần theo tên");
            System.out.println("6. Hiển thị danh sách chuyên ngành có năm thành lập trong khoảng");
            System.out.println("7. Hiển thị danh sách chuyên ngành có tên kết thúc là \"e\"");
            System.out.println("8. Hiển thị danh sách chuyên ngành chứa chữ \"a\" trong tên");
            System.out.println("9. Tìm kiếm chuyên ngành theo mã");
            System.out.println("10. Xoá chuyên ngành theo mã");
            System.out.println("11. Tìm và in ra vị trí của chuyên ngành có năm thành lập sớm nhất");
            System.out.println("12. Tìm kiếm chuyên ngành theo tên chủ nhiệm");
            System.out.println("13. Hiển thị danh sách chuyên ngành đang hoạt động");
            System.out.println("14. Hiển thị danh sách chuyên ngành ngừng hoạt động");
            System.out.println("15. Nhap UDPM và in ra màn hình");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            chon = Integer.valueOf(sc.nextLine());
            switch (chon) {
                case 1: {
                    chuyenNganhService.nhap(listChuyenNganh);
                    break;
                }
                case 2: {
                    chuyenNganhService.xuat(listChuyenNganh);
                    break;
                }
                case 3: {
                    chuyenNganhService.timBatDauBangE(listChuyenNganh);
                    break;
                }
                case 4: {
                    chuyenNganhService.hienThiDanhSachChuyenNganhViTriChan(listChuyenNganh);
                    break;
                }
                case 5: {
                    chuyenNganhService.sapXepTheoTen(listChuyenNganh);
                    chuyenNganhService.xuat(listChuyenNganh);
                    break;
                }
                case 6: {
                    chuyenNganhService.timTheoNamThanhLapMaxMin(listChuyenNganh);
                    break;
                }
                case 7: {
                    chuyenNganhService.timKiemTenKetThucE(listChuyenNganh);
                    break;
                }
                case 8: {
                    chuyenNganhService.timTenChuaChuA(listChuyenNganh);
                    break;
                }
                case 9: {
                    ChuyenNganh kq = chuyenNganhService.timKiemMaNhap(listChuyenNganh);
                    if (kq != null) {
                        kq.inThongTin();
                    } else {
                        System.out.println("Khong tim thay ma can tim");
                    }
                    break;
                }
                case 10: {
                    chuyenNganhService.xoaMaNhap(listChuyenNganh);
                    chuyenNganhService.xuat(listChuyenNganh);
                    break;
                }
                case 11: {
                    chuyenNganhService.timNamThanhLapMin(listChuyenNganh);
                    break;
                }
                case 12: {
                    ChuyenNganh kq = chuyenNganhService.timTheoChuNhiemNhap(listChuyenNganh);
                    if (kq != null) {
                        kq.inThongTin();
                    } else {
                        System.out.println("Khong tim thay chuNhiem can tim");
                    }
                    break;
                }
                case 13: {
                    chuyenNganhService.hienThiDanhSachTrue(listChuyenNganh);
                    break;
                }
                case 14: {
                    chuyenNganhService.hienThiDanhSachFalse(listChuyenNganh);
                    break;
                }
                case 15: {
                    chuyenNganhService.nhapUDPMCoThamSoInRaManHinhThongTinVuaNhap(list);
                    break;
                }
                case 0: {
                    System.out.println("Ban da thoat");
                    break;
                }
                default:
                    System.out.println("Ban nhap sai Moi nhap lai!!!");
                    break;
            }

        } while (chon != 0);
    }
}
