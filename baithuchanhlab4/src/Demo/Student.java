package Demo;

import java.util.List;
import java.util.Scanner;

public class Student {
	public String FullName;
	public int Age;
	public void setFullName(String FullName) {
		this.FullName=FullName;
	}
	public  String getFullName() {
		return FullName;
	}
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên:");
		FullName= sc.nextLine();
		System.out.println("Nhập vào tuổi sinh viên:");
		Age = sc.nextInt();
	}
	public static void HienThi(List<Student>stdList) {
		for(int i=0;i<stdList.size();i++) {
			System.out.printf("Sinh viên: %s,%d tuổi\n",stdList.get(i).FullName,stdList.get(i).Age);
		}
	}
	public static void ThemMoi(List<Student> stdList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số sinh viên cần thêm:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			Student std = new Student();
			std.NhapThongTin();
			stdList.add(std);
			System.out.println("Thành công");
		}
	}
	public static void Update(List<Student> stdList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên cần sửa:");
		String ten = sc.nextLine();
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).FullName.equals(ten)) {
				Student std = new Student();
				std.NhapThongTin();
				stdList.set(i, std);
				System.out.println(" Thay Đổi Thành công");
			}
		}
	}
	public static void Delete (List<Student>stdList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên cần xóa");
		String ten=sc.nextLine();
		for(int i=0;i<stdList.size();i++) {
			if(stdList.get(i).FullName.contains(ten)) {
				stdList.remove(i);
				System.out.println(" Xóa Thành công");
			}
		}
		}
}
