package baithuchanh1003;

import java.util.Scanner; 

public class slide74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kichthuoc;
	do {
		System.out.println("nhap vao kich thuoc mang:");
		kichthuoc = sc.nextInt();
		if(kichthuoc<=0) System.out.println("-----khong hop le, vui long nhap lai-----");
	}while(kichthuoc<=0);
	int arrL[] = new int[kichthuoc];
	for(int i=0;i<kichthuoc;i++) {
		System.out.printf("a[%d}=",i);
		arrL[i]= sc.nextInt();
	}
	System.out.println("cac gia tri da nhap");
	for(int i=0;i<kichthuoc;i++) {
		System.out.print("\t"+arrL[i]);
		
	}
	int sum =0;
	for(int i=0;i<arrL.length;i++) {
		if(arrL[i]%2==0){
		sum+=arrL[i];
		}
	}
	System.out.println("\ntong cac so chan la "+sum);
}
}
