package baithuchanhlab3;

import java.util.Scanner;

public class hinhtrutron {
	public float chieuCao,dienTichday,dienTichxungquanh,dienTichtoanphan;
	final public float Pi=(float)3.14;
	public float BanKinh;
	Scanner sc= new Scanner(System.in) ;
	public void nhap() {
		System.out.println("Nhap ban kinh:");
		BanKinh =sc.nextFloat();
		System.out.println("nhap vao chieu cao:");
		chieuCao=sc.nextFloat();
	}
	public void dientichday() {
		dienTichday=Pi*(BanKinh*BanKinh);
		
	}
	public void dientichxungquanh() {
		dienTichxungquanh=2*Pi*chieuCao*BanKinh;
		
	}
	public void dientichtoanphan() {
		dienTichtoanphan=((2*Pi*chieuCao*BanKinh)+(2*Pi*(BanKinh*BanKinh)));
		
	}
	public void in() {
		System.out.println("dien tich day la"+dienTichday+"dien tich xung quanh la"+dienTichxungquanh+"dien tich toan phan la"+dienTichtoanphan);
		
	}
	public static void main(String[] args) {
		hinhtrutron a1= new hinhtrutron();
		a1.nhap();
		a1.dientichday();
		a1.dientichxungquanh();
		a1.dientichtoanphan();
		a1.in();
	}
}
