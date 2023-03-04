package baithuchanh2402;

import java.util.Scanner;

public class slide34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap he so: ");
		float a= sc.nextFloat();
		System.out.println("nhap he so: ");
		float b= sc.nextFloat();
		System.out.println("nhap he so: ");
		float c= sc.nextFloat();
		float delTa=0,x1=0,x2=0;
		delTa=b*b-4*a*c;
		if(delTa<0) {
			System.out.println("phuong trinh vo nghiem");	
	}
		if(delTa==0)
		{
			x1=(-b/2*a);
			System.out.println("phuong trinh co nghiem kep x1=x2="+x1);
		}
		if(delTa>0) {
			x1=(float) ((-b + Math.sqrt(delTa)) / (2*a));
			x2=(float) ((-b - Math.sqrt(delTa)) / (2*a));
			System.out.println("nghiem thu nhat:"+x1);
			System.out.println("nghiem thu 2:"+x2);

		}
}


}
//x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));