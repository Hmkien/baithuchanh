package ngay2804;

import java.util.Map;
import java.util.Scanner;

public class SinhVien {
	public String maSV;
	public String HoTen;
	public String Lop;
	public SinhVien(String maSV, String hoTen, String lop) {
		this.maSV = maSV;
		this.HoTen = hoTen;
		this.Lop = lop;
	
	}
	public static void Add(Map<String,SinhVien> abc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên:");
		int n=sc.nextInt();sc.nextLine();
		for(int i =0;i<n;i++) {
			System.out.println("Nhập mã sinh viên:");
			String Ma=sc.nextLine();
			System.out.println("Nhập họ và tên:");
			String FullName=sc.nextLine();
			System.out.println("Nhập lớp:");
			String lop=sc.nextLine();
			SinhVien sinhVien= new SinhVien(Ma,FullName,lop);
			abc.put(Ma, sinhVien);
		}
	}
	public static void hienThi(Map<String,SinhVien> abc  ) {
		for(Map.Entry<String,SinhVien>std :abc.entrySet()){
			System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s\n",std.getValue().HoTen,std.getValue().maSV,std.getValue().Lop);
		}
	}
	public static void findLop(Map<String,SinhVien> abc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên lớp:");
		String lop=sc .nextLine();
		boolean a= false;
		for(SinhVien m:abc.values()) {
			if(m.Lop.equals(lop)) {
				System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s",m.HoTen,m.maSV,m.Lop);
				a=true;
			}
		}
		if(!a)
			System.out.println("Không tìm thấy");
	}
	public static void findMa(Map<String,SinhVien> abc)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên:");
		String MA=sc .nextLine();
		boolean a= false;
		for(Map.Entry<String,SinhVien> std:abc.entrySet()) {
			if(std.getKey().equals(MA)) {
				System.out.printf("sinh viên:%s - mã sinh viên:%s - lớp:%s\n",std.getValue().HoTen,std.getValue().maSV,std.getValue().Lop);
				a=true;
			}
			}
		if(!a)
			System.out.println("Khong tim thấy");
		}
		
	}

