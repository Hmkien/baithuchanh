package baikiemtra;

import java.util.HashSet;
import java.util.Set;

public class main {
public static void main(String[] args) {
	HMK149QuanLySinhVien qlsv= new HMK149QuanLySinhVien();
	Set<Student > stdSet= new HashSet<>();
	qlsv.ThemThongTin(stdSet);
	qlsv.SuaThongTin(stdSet);
	qlsv.XoaThongTin(stdSet);;
	qlsv.HienThi(stdSet);
}
}
