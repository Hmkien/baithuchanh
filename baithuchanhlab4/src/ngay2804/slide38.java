package ngay2804;

import java.util.LinkedList;

public class slide38 {
	public static void main(String[] args) {
		LinkedList<String> Lk= new LinkedList<>();
		Lk.add("Ha");
		Lk.add("Manh");
		Lk.add("Kien");
	System.out.println(Lk);
		System.out.println(Lk.contains("Manh"));
		LinkedList<String> Lk1 = new LinkedList<>();
		Lk1.addAll(Lk);
		Lk1.add("Mo");
		Lk1.add("Dia");
		Lk1.add("Chat");
		
		System.out.println(Lk1);
		Lk1.retainAll(Lk);
		System.out.println(Lk1);
	}
}

