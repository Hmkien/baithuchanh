package baithuchanh0303;

import java.util.Scanner;

public class slide47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,tong=0;
		String kk="";
	do {
		System.out.println("nhap vao so nguyen n:");
		n= sc.nextInt();
		tong+=n;
		kk=n+"+"+ kk;
	}while(tong<=100);
		System.out.println("tong cac so da nhap:"+kk.substring(0, kk.length()-1) + "= " +tong);
	}}
