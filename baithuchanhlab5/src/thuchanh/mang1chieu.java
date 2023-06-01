package thuchanh;

import java.util.Scanner;

public class mang1chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int n ;
		do {
			try {
				System.out.println("Nhập vào số lượng phần tử của mảng:");
				String str=sc.nextLine();
				n=Integer.parseInt(str);
			}
			catch(Exception ex) {
				System.out.println("Lỗi:"+ex);
				n=0;
		}
		}while(n<1);
		int a[]= new int[n];
		for(int i=0;i<a.length;i++) {
			do {
				try {
					System.out.printf("nhập vào phần tử thứ %d:",i+1);
					String b=sc.nextLine();
					a[i]=Integer.parseInt(b);
				}
				catch(Exception ex) {
					a[i]=-200000001;
				}
			}while(a[i]<-20000000||a[i]>200000000);
					}
		System.out.println("các phần tử có trong mảng là:");
		for(int i=0;i<n;i++) {
			System.out.printf("%d\t",a[i]);
		}

}
}