package baithuchanhlab3;

import java.util.Scanner;

public class hinhtron {
	 public float banKinh;
	 public float chuVi;
	 public float dienTich;
	final public float Pi= (float)3.14;
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.print("nhap vao ban kinh hinh tron");
		banKinh=sc.nextFloat();	
	}
	public void dientich() {
		dienTich=Pi*(banKinh*banKinh);
		
	}
	public void hienthi() {
		System.out.printf("dien tich hinh tron la %.3f",dienTich);
		
	}
	public static void main(String[] args) {
		hinhtron a1= new hinhtron();
		a1.nhap();
		a1.dientich();
		a1.hienthi();
	}
}
