package baitaplab2;

import java.util.Scanner;

public class bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soDong,soCot;
		do {
			System.out.println("nhap vao so dong ");
			soDong=sc.nextInt();
			System.out.println("nhap vao so cot");
			soCot=sc.nextInt();
		}while((soDong<=0)||(soCot<=0));
		int A[][]=new int [soDong][soCot];
		System.out.println("nhap vao phan tu cua ma tran");
		for(int i=0;i<soDong;i++) {
			for(int j=0;j<soCot;j++) {
				System.out.printf("A[%d][%d]",i,j);
				A[i][j]=sc.nextInt();
		}
		}
		
		int max=A[0][0];
		for(int i=0;i<soDong;i++) {
			for(int j=0;j<soCot;j++) {
				if(A[i][j]>max) {
					max=A[i][j];
				}
			}
		}
		System.out.println("so lon nhat trong mang la:"+max);
		
	}
}
