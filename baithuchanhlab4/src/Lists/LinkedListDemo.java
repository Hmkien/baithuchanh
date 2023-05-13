package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Demo.Student;

public class LinkedListDemo{
	public static void main(String[] args) {
		Scanner	 sc = new Scanner(System.in);
		LinkedList<Student> lkList = new LinkedList<>();
		int a=1;
		while(a==1) {
		System.out.println("\n1.Thêm Thông Tin.");
		System.out.println("2.Hiển Thị Thông Tin.");
		System.out.println("3.Sửa Thông Tin.");
		System.out.println("4.Xóa Thông Tin");
		int luachon;
		do {
			System.out.println("Nhập vào lựa chọn:");
			luachon=sc.nextInt();
			
		}while((luachon<=0)||(luachon>4));
		switch(luachon) {
		case 1: Student.ThemMoi(lkList);
				break;
		case 2: Student.HienThi(lkList);
				break;
		case 3: Student.Update(lkList);
				break;
		case 4: Student.Delete(lkList);
				break;
		}
	}
		}

}
