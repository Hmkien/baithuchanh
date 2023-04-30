package baitaplab2;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String chuoi;
		System.out.print("nhap vao chuoi\n");
		chuoi=sc.nextLine();
		int thuong=0;
		int hoa=0;
		int so=0;
		for(int i=0;i<chuoi.length();i++) {
			if(chuoi.charAt(i)<='a'&& chuoi.charAt(i)<='z') {
				thuong++;
			}
			if(chuoi.charAt(i)<='A'&& chuoi.charAt(i)<='Z') {
				hoa++;
			}
			if(chuoi.charAt(i)<='9'&& chuoi.charAt(i)>='0') {
				so++;
			}
		}
			System.out.println("so ki tu hoa la:"+hoa);
			System.out.println("so ki tu thuong la:"+thuong);
			System.out.println("so ki tu so la:"+so);
	}

}
