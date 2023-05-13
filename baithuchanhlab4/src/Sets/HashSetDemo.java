package Sets;
import java.util.HashSet;
import java.util.Scanner;
import Demo.Student;
import Demo.Student1;
public class HashSetDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Student1> stdList = new HashSet<>();
		int a=1;
		while(a==1) {
		System.out.println("\n1.Thêm Thông Tin.");
		System.out.println("2.Hiển Thị Thông Tin.");
		System.out.println("3.Sửa Thông Tin.");
		System.out.println("4.Xóa Thông Tin");
		int luachon;
		do {
			System.out.println("Nhập vào lựa chọn:");
			luachon=sc.nextInt();
			
		}while((luachon<=0)||(luachon>4));
		switch(luachon) {
		case 1: 
			Student1.ThemMoi(stdList);
				break;
		case 2: Student1.HienThi(stdList);
				break;
		case 3: Student1.Update(stdList);
				break;
		case 4: Student1.Delete(stdList);
				break;
		}
	}
	}
}
