package baitaplab2;

import java.util.Scanner;

public class bai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.print("nhap vao n");
		n=sc.nextInt();
		if(n<=0) {
			System.out.println("nhap lai");
		}
		}while(n<0);
		int A[]= new int[n];
		for(int i=0;i<n;i++) {
		System.out.printf("nhap phan tu mang A[%d]=",i);
		A[i]=sc.nextInt();
	}
	System.out.println("mang ban dau");
	for(int i=0;i<n;i++) {
		System.out.printf("%d\t",A[i]);
	}
	int temp;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(A[i]>A[j]) {
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				
			}
		}
	}
	System.out.println("\nmang sap xep tang dan");
	for(int i=0;i<n;i++) {
		System.out.printf("%d\t",A[i]);
	}
}
	
}
