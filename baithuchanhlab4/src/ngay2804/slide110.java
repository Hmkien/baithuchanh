package ngay2804;

import java.util.ArrayList;
import java.util.Scanner;

public class slide110 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng:");
		int n = sc.nextInt();
		int a;
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập số nguyên cần thêm:", i + 1);
			a = sc.nextInt();
			intList.add(a);
		}
		int b = 1;
		while (b == 1) {
			System.out.println("\n1.Thêm  số");
			System.out.println("2.hiển thi");
			System.out.println("3.Tìm số lớn nhất");
			System.out.println("4.xóa 1 số ");
			System.out.println("5.sắp xếp");
			int luachon;
			do {
				System.out.println("Nhập vào lựa chọn:");
				luachon = sc.nextInt();
			} while ((luachon < 0) || (luachon > 5));
			switch (luachon) {
			case 1:
				add(intList);
				break;
			case 2:
				hienthi(intList);
				break;
			case 3:
				Max(intList);
				break;
			case 4:
				Delete(intList);
				break;
			case 5:
				sapxep(intList);
				break;
			}

		}

	}

	public static void add(ArrayList<Integer> a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng:");
		int n = sc.nextInt();
		int e;
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập số nguyên cần thêm:", i + 1);
			e = sc.nextInt();
			a.add(e);
		}
	}

	public static void hienthi(ArrayList<Integer> a) {
		for (int b : a) {
			System.out.print(b + "\t");
		}
	}

	public static void Max(ArrayList<Integer> a) {
		a.sort((o1, o2) -> o1 - o2);
		int max = a.get(a.size() - 1);
		System.out.printf("Số lớn nhất là:%d", max);
	}

	public static void Delete(ArrayList<Integer> a) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (a.contains(n)) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).equals(n)) {
					a.remove(i);
				}
			}
		}
		System.out.println("danh sach sau khi xóa");
		hienthi(a);
	}

	public static void sapxep(ArrayList<Integer> a) {
		System.out.print("Sắp xếp tăng dần là:");
		a.sort((o1, o2) -> o1 - o2);
		hienthi(a);
		System.out.print("sắp xếp gỉam dần là:");
		a.sort((o1, o2) -> o2 - o1);
		hienthi(a);
	}

}
