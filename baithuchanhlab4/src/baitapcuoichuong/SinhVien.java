package baitapcuoichuong;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
	public String Ten;
	public float Diem;

	public static void ThemSinhVien(List<SinhVien> arr) {
		Scanner sc = new Scanner(System.in);
		String Name;
		float score;
		do {
			System.out.println("Nhập vào tên sinh viên:");
			Name = sc.nextLine();
			if (!Name.isEmpty()) {
				System.out.println("Nhập điểm của sinh viên:");
				score=Float.parseFloat(sc.nextLine());
				SinhVien sv = new SinhVien();
				sv.Diem = score;
				sv.Ten = Name;
				arr.add(sv);
				System.out.println("Thành công");
			} else
				break;
		} while (true);
	}

	public static void DemSinhVien(List<SinhVien> arr) {
		int dem = 0;
		for (SinhVien number : arr) {
			if (number.Diem <= 5) {
				dem++;
				System.out.printf("Sinh viên: %s  %f điểm: Thi Lại\n", number.Ten, number.Diem);
			}
		}
		System.out.println("số sinh viên thi lại là:" + dem);
	}

	public static void HienThi(List<SinhVien> sv) {
		for (int i = 0; i < sv.size(); i++) {
			System.out.printf("Sinh viên: %s %.2f điểm\n", sv.get(i).Ten, sv.get(i).Diem);
		}
	}

	public static void maxcore(List<SinhVien> arr) {
		List<SinhVien> temp = new LinkedList<>();
		double DiemMax = 0;
		for (SinhVien vk : arr) {
			if (vk.Diem > DiemMax) {
				DiemMax = vk.Diem;
				temp.clear();
				temp.add(vk);
			} else {
				if (vk.Diem == DiemMax)
					temp.add(vk);
			}
		}
		HienThi(temp);

	}

	public static void TimKiem(List<SinhVien> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên cầng tìm kiếm");
		String ten = sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).Ten.equals(ten)) {
				System.out.printf("Sinh viên: %s %.2f điểm\n", arr.get(i).Ten, arr.get(i).Diem);
			}
		}
	}
}
