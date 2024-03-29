package quanlydanhba;

import java.util.HashMap;

public class DanhBaDienThoai implements danhba {
    private HashMap<String, String> danhBa = new HashMap<>();

    public void themMoi(String ten, String soDienThoai) {
        danhBa.put(ten, soDienThoai);
    }

    public void capNhat(String ten, String soDienThoai) {
        if (danhBa.containsKey(ten)) {
            danhBa.put(ten, soDienThoai);
        }
    }

    public void xoa(String ten) {
        if (danhBa.containsKey(ten)) {
            danhBa.remove(ten);
        }
    }

    public void  timKiem(String ten) {
        if (danhBa.containsKey(ten)) {
            System.out.println(danhBa.get(ten)); 
        }else {
        	System.out.println("Không tìm thấy!");
        }
        	
    }
   
}
