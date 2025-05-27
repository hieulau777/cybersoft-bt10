package bt10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bt10.model.NhanVienSanXuat;
import bt10.model.NhanVienVanPhong;
import bt10.model.Oto;
import bt10.model.PhanSo;
import bt10.model.PhuongTienGiaoThong;
import bt10.model.VanDongVien;

public class Main {

	public static void main(String[] args) {
		
		bai1();
		bai2();
		bai3();
		bai4();
		
	}
	
	public static void bai1() {
		System.out.println("===== TÍNH PHÂN SỐ =====");
		PhanSo ps1 = new PhanSo();
		ps1.setTuSo(5);
		ps1.setMauSo(10);
		
		PhanSo ps2 = new PhanSo();
		ps2.setTuSo(3);
		ps2.setMauSo(9);
		
		PhanSo cong = ps1.cong(ps2);
		System.out.println(ps1.toString() + " + " + ps2.toString() + " = " + cong);
		
		PhanSo tru = ps1.tru(ps2);
		System.out.println(ps1.toString() + " - " + ps2.toString() + " = " + tru);

		PhanSo nhan = ps1.nhan(ps2);
		System.out.println(ps1.toString() + " x " + ps2.toString() + " = " + nhan);

		PhanSo chia = ps1.chia(ps2);
		System.out.println(ps1.toString() + " : " + ps2.toString() + " = " + chia);
		System.out.println("===========================================\n");

	}
	
	public static void bai2() {
		VanDongVien vdv1 = new VanDongVien();
		vdv1.setHoTen("A");
		vdv1.setTuoi(19);
		vdv1.setCanNang(80.0);
		vdv1.setChieuCao(180.0);
		vdv1.setMonThiDau("Bong da");
		
		VanDongVien vdv2 = new VanDongVien("B", 20, "Bong da", 90.0, 180.0);
		
		vdv1.soSanh(vdv2);

	}
	
	public static void bai3() {
		System.out.println("===== TÍNH LƯƠNG NHÂN VIÊN SẢN XUẤT =====");
		NhanVienSanXuat nv1 = new NhanVienSanXuat(2000, 50);
		System.out.println("Lương cơ bản: " + nv1.getLuongCanBan());
		System.out.println("Số sản phẩm: " + nv1.getSoSanPham());
		nv1.calculateLuong();
		System.out.println("Lương: " + nv1.getLuong());
		
		System.out.println("===== TÍNH LƯƠNG NHÂN VIÊN VĂN PHÒNG =====");
		NhanVienVanPhong nv2 = new NhanVienVanPhong(15);
		System.out.println("Số ngày làm việc: " + nv2.getSoNgayLamViec());
		nv2.calculateLuong();
		System.out.println("Lương: " + nv2.getLuong());
		System.out.println("===========================================\n");

	}
	
	public static void bai4() {
		System.out.println("===== HIỂN THỊ PHƯƠNG TIỆN GIAO THÔNG =====");
		PhuongTienGiaoThong xe1 = new PhuongTienGiaoThong("Honda", "AirBlade", 1999, 120);
		xe1.inThongTin();
		System.out.println("===========================================\n");

		List<Oto> listOto = new ArrayList<>();
		listOto.add(new Oto("Nissan", "GT-R R35", 2007, 315, 4, "VR38DETT"));
		listOto.add(new Oto("Toyota", "Supra MK4", 1998, 280, 2, "2JZ-GTE"));
		listOto.add(new Oto("Honda", "Civic Type R", 2020, 315, 4, "K20C1"));
		listOto.add(new Oto("BMW", "M3 G80", 2021, 250, 5, "S58"));
		listOto.add(new Oto("Mercedes-Benz", "C63 AMG", 2019, 250, 4, "M177"));
		listOto.add(new Oto("Audi", "RS5", 2018, 250, 4, "2.9L V6 Twin-Turbo"));
		listOto.add(new Oto("Lamborghini", "Huracan EVO", 2020, 325, 2, "V10"));

		System.out.println("===== DANH SÁCH TOÀN BỘ XE Ô TÔ =====");
		int index = 1;
		for (Oto n : listOto) {
		    System.out.println(">> Xe số " + (index++) + ":");
		    n.inThongTin();
		    System.out.println();
		}
		System.out.println("=====================================\n");

		// Nhóm các xe có cùng vận tốc
		Map<Integer, List<Oto>> map = new HashMap<>();
		for (Oto xe : listOto) {
		    map.computeIfAbsent(xe.getVanTocToiDa(), k -> new ArrayList<>()).add(xe);
		}

		System.out.println("===== CÁC XE Ô TÔ CÓ CÙNG VẬN TỐC =====");
		for (Entry<Integer, List<Oto>> entry : map.entrySet()) {
		    List<Oto> group = entry.getValue();
		    if (group.size() > 1) {
		        System.out.println(">>> Vận tốc: " + entry.getKey() + " km/h (" + group.size() + " xe)");
		        int count = 1;
		        for (Oto n : group) {
		            System.out.println("- Xe " + (count++) + ":");
		            n.inThongTin();
		            System.out.println();
		        }
		        System.out.println("--------------------------------------");
		    }
		}
	}
}
