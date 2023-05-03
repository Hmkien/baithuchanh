package ngay2804;

import java.util.HashSet;
import java.util.Scanner;

public class slide53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs=new HashSet<>();
		hs.add("Ha");
		hs.add("Manh");
		hs.add("Kien");
		System.out.println(hs);
		System.out.println("Nhap phan tu can them:");
		String number = sc.nextLine();
		if(!hs.contains(number)) {
			hs.add(number);
		}
		else 
		{
			System.out.println("đã tồn tại");
		}
		System.out.println(" Kết quả sau khi thêm");
		System.out.println(hs);
	}
}
