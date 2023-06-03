package baikiemtra;

import java.util.Scanner;
import java.util.Set;

public class HMK149QuanLySinhVien implements HMK149Student {

	public void NhapThongTin(Student std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten sinh vien:");
		std.FullName = sc.nextLine();
		do {
			try {
				System.out.println("Nhap vao tuoi sinh vien:");
				std.Tuoi = Integer.parseInt(sc.nextLine());
			} catch (Exception ex) {
				std.Tuoi = 152;
			}
		} while (std.Tuoi < 0 || std.Tuoi > 150);
		do {
			try {
				System.out.println("Nhap vao diem cua sinh vien:");
				String diem1 = sc.nextLine();
				std.Diem = Float.parseFloat(diem1);
			} catch (Exception exx) {
				std.Diem = 15;
			}
		} while (std.Diem > 10 || std.Diem < 0);
	}

	public void ThemThongTin(Set<Student> a) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			try {
				System.out.println("Nhap vao so luong sinh vien:");
				n = Integer.parseInt(sc.nextLine());
			} catch (Exception ex) {
				n = 0;
			}
		} while (n < 1 || n > 10000);
		for (int i = 0; i < n; i++) {
			Student std = new Student();
			NhapThongTin(std);
			a.add(std);
		}
	}

	public void SuaThongTin(Set<Student> a) {
		Scanner sc = new Scanner(System.in);
		boolean t = false;
		System.out.println("Nhap ten sinh vien can sua");
		String Name = sc.nextLine();
		for (Student std : a) {
			if (std.FullName.equals(Name)) {
				Student newstd = new Student();
				NhapThongTin(newstd);
				a.remove(std);
				a.add(newstd);
				t = true;
			}
		}
		if (!t)
			System.out.println("Khong tim thay thong tin");

	}

	public void XoaThongTin(Set<Student> a) {
		Scanner sc = new Scanner(System.in);
		boolean t = false;
		System.out.println("Nhap ten sinh vien can xoa");
		String Name = sc.nextLine();
		for (Student std : a) {
			if (std.FullName.contains(Name)) {
				a.remove(std);
				t = true;
			}
		}
		if (!t)
			System.out.println("Khong tim thay thong tin");

	}

	public void HienThi(Set<Student> a) {
		System.out.println("danh sach sinh vien la:");
		for (Student std : a) {
			System.out.printf("sinh vien:%s - %d tuoi - %.2fdiem\n ", std.FullName, std.Tuoi, std.Diem);
		}

	}

}
