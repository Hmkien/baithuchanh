package ngay2804;

import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
	public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Ha");
		arr.add("Manh");
		arr.add("Kien");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
}
}
