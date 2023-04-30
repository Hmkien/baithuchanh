package ngay2804;

import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
	public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Ha");
		arr.add("Manh");
		arr.add("Kien");
		ListIterator<String> it = arr.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
}
}
