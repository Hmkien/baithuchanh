package baithuchanh2402;

import java.util.Scanner;

public class slide35 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap so a:");
	int a = sc.nextInt();
	System.out.println("nhap so b");
	int b = sc.nextInt();
	if(a>b) {
		System.out.println("so lon hon :"+a);
	}
	if(a<b) {
		System.out.println("so lon hon:"+b);
	}if(a==b) {
	System.out.println("hai so bang nhau");
	}
	
}
}
