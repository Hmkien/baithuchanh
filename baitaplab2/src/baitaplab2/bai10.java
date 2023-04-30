package baitaplab2;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String chuoi;
		do {
		System.out.println("nhap vao chuoi");
		chuoi=sc.nextLine();
		if(chuoi.length()>80) {
			System.out.print("\nVUI LONG NHAP KHONG QUA 80 KI TU\n");
		}
		}while(chuoi.length()>80);
		System.out.println("\nnhap ki tu can dem\n");
		String i=sc.nextLine();
		char c=i.charAt(0);
		int dem=0;
		for(int j=0;j<chuoi.length();j++) {
			if(chuoi.charAt(j)==c) {
				dem++;
			}
		}
		System.out.println("so ki tu"+c+"la"+dem);
}
}
