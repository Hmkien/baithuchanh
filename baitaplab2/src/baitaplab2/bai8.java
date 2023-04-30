package baitaplab2;

import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do {
			System.out.print("nhap vao so luong phan tu");
			n=sc.nextInt();
			if(n<=0) {
				System.out.println("YEU CAU NHAP LAI");
			}
		}while(n<=0);
		int A[]=new int [n];
		System.out.println("nhap cac so:");
		for(int i=0;i<n;i++) {
			System.out.printf("A[%d]=",i);
			A[i]=sc.nextInt();
			
		}
		int tong=A[0];
		for(int i=1;i<n;i++) {
			tong+=A[i];
		}
	int tbc;
	tbc=tong/n;
	System.out.println("trung binh cong cua cac so vua nhap la:"+tbc);
	}

}
