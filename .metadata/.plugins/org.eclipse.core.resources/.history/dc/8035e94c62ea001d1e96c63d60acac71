package quanlydanhba;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        DanhBaDienThoai danhBa = new DanhBaDienThoai();
        Scanner sc = new Scanner(System.in);
        boolean check = true;

      while(check==true) {
            System.out.println("=====MENU=====");
            System.out.println("1. Thêm mới contact");
            System.out.println("2. Cập nhật số điện thoại của contact");
            System.out.println("3. Xoá contact");
            System.out.println("4. Tìm kiếm contact theo tên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String soDienThoai = sc.nextLine();
                    danhBa.themMoi(ten, soDienThoai);
                    break;
                case 2:
                    System.out.print("Nhập tên cần cập nhật: ");
                    ten = sc.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    soDienThoai = sc.nextLine();
                    danhBa.capNhat(ten, soDienThoai);
                    break;
                case 3:
                    System.out.print("Nhập tên cần xoá: ");
                    ten = sc.nextLine();
                    danhBa.xoa(ten);
                    break;
                case 4:
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    ten= sc.nextLine();
                    System.out.println(danhBa.timKiem(ten));
                case 0 : check = false;
                default : System.out.println("lua chon khong hop le! vui long thu lai");
                
                	
 }}}}