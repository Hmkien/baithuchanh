package baitaplab2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,tong =0;
		while(tong <100) {
		System.out.print("nhap vao so nguyen:");
		 a =sc.nextInt();
		 tong +=a;
	}
		System.out.println("tong cac so vua nhap la:"+tong);

}
}
