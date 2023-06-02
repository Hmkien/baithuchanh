package bai3;

import java.util.List;
import java.util.Scanner;

public class SinhVien {
	public String FullName;
	public float Diem;

	public static void Add(List<SinhVien> abc) {
		Scanner sc = new Scanner(System.in);
		int a=1;
		while (a==1) {
			System.out.println("Nhap vao ten sinh vien");
			String ten = sc.nextLine();
			if (ten != "") {
				System.out.println("Nhap vao diem:");
				float diem = Float.parseFloat(sc.nextLine());
				SinhVien sv = new SinhVien();
				sv.FullName = ten;
				sv.Diem = diem;
				abc.add(sv);

			} else {
				break;
			}
		}
	}

	public static void HienThi(List<SinhVien> abc) {
		System.out.println("danh sach sinh vien la:");
		for (SinhVien ab : abc) {
			System.out.printf("sinh vien: %s- - %f diem\n", ab.FullName, ab.Diem);
		}
	}
}
