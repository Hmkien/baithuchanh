package ngay2804;

import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> abcList = new LinkedList<>();
		System.out.println("Nhập vào số lương phần tử:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập vào phần tử thứ %d:", i + 1);
			int phanTu = sc.nextInt();
			abcList.add(phanTu);
		}
		int sum = 0;
		int dem = 0;
		for (int i1 = 0; i1 < abcList.size(); i1++) {
			if (abcList.get(i1) % 2 == 0) {
				dem++;
				sum += abcList.get(i1);
			}
		}
		System.out.printf("trung bình cộng của các số chẵn là :%.2f", (float) sum / dem);

	}
}
