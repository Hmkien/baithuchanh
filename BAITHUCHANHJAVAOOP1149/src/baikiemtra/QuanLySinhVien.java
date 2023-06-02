package baikiemtra;

import java.util.Scanner;
import java.util.Set;

public  class QuanLySinhVien implements HMK149Student{

	@Override
	public void NhapThongTin(Student std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten sinh vien:");
		std.FullName = sc.nextLine();
		System.out.println("Nhap vao tuoi sinh vien:");
		std.Tuoi = sc.nextInt();
		System.out.println("Nhap vao diem cua sinh vien:");
		std.Diem = sc.nextFloat();
	}

	@Override
	public void ThemThongTin(Set<Student> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong sinh vien:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student std = new Student();
			NhapThongTin(std);
			a.add(std);
		}
	}

	@Override
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

	@Override
	public void XoaThongTin(Set<Student> a) {
		Scanner sc = new Scanner(System.in);
		boolean t = false;
		System.out.println("Nhap ten sinh vien can xoa");
		String Name = sc.nextLine();
		for (Student std : a) {
			if (std.FullName.equals(Name)) {
				a.remove(std);
				t = true;
			}
		}
		if (!t)
			System.out.println("Khong tim thay thong tin");

	}

	@Override
	public void HienThi(Set<Student> a) {
		System.out.println("danh sach sinh vien la:");
		for (Student std : a) {
			System.out.printf("sinh vien:%s - %d tuoi - %.2fdiem ", std.FullName, std.Tuoi, std.Diem);
		}

	}


}
