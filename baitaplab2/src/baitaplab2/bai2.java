package baitaplab2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("nhap vao so:");
		a = sc.nextInt();
		if(a%2==0) {
			System.out.println("so vua nhap la so chan");
		}
		else 
			System.out.println("so vua nhap la so le");
	}
}
