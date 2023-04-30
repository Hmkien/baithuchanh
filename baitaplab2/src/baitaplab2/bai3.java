package baitaplab2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("nhap vao ten va tuoi:");
		String ten = sc.nextLine();
		System.out.println("nhap vao tuoi");
		int tuoi=sc.nextInt();
	if(tuoi<16) {
		System.out.printf("ban %s o do tuoi vi thanh nien",ten);
	}
	else if((tuoi>=16)&&(tuoi<18))
	{
		System.out.printf("ban %s o do tuoi truong thanh ",ten);
	}else
		if(tuoi>=18) {
			System.out.printf("ban %s da gia ",ten);
		}

	}
}
