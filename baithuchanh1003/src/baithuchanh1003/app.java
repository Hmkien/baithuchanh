package baithuchanh1003;

import java.util.Scanner;

public class app {
	public static void main(String [] args) {
		int kichthuoc;
	Scanner sc = new Scanner(System.in); 
	do {
	  
		System.out.println("nhap kich thuoc  ");
	  	kichthuoc = sc.nextInt();
	  	if(kichthuoc<=0) System.out.println("gia tri khong dung vui long nhap lai");
	}while(kichthuoc<0);
	int arrT[] = new int[kichthuoc];
 for(int i=0;i< kichthuoc;i++) {
	 System.out.printf("a[%d] =",i);
	 arrT[i] = sc.nextInt();
 }
 System.out.println("mang ban dau: \n");
 for(int i=0;i<arrT.length;i++){

	 System.out.print("\t"+arrT[i]);
 }
	 
	int tg =arrT[0];
	for (int i = 0; i < arrT.length - 1; i++) {
      
        for (int j = i + 1; j < arrT.length; j++) {
            if (arrT[i] > arrT[j]) {
                tg = arrT[i];
                arrT[i] = arrT[j];
                arrT[j] = tg;
            }
        }
    }
    System.out.println("\nMẢng sau khi sắp xếp:");
    for (int i = 0; i < arrT.length; i++) {
        System.out.printf("\t " + arrT[i]);
    }
	}
}
 

