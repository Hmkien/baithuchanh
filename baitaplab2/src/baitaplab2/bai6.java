package baitaplab2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("nhap vao so a");
		a =sc.nextInt();
		if(a==1) {
			System.out.println("gia thua cua a la :1");
		}
		int gt=1, i=1;
		do {
			gt*=i;
			i++;

		}while(i<=a);
		System.out.printf("gia thua cua a la %d",gt);
	}
}
