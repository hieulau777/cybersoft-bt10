package bt10;

import bt10.model.NhanVienSanXuat;
import bt10.model.NhanVienVanPhong;
import bt10.model.PhanSo;

public class Main {

	public static void main(String[] args) {
		
//		tinhPhanSo();
		NhanVienSanXuat nv1 = new NhanVienSanXuat(2000, 50);
		nv1.calculateLuong();
		System.out.println(nv1.getLuong());
		
		NhanVienVanPhong nv2 = new NhanVienVanPhong(15);
		nv2.calculateLuong();
		System.out.println(nv2.getLuong());

	}
	
	public static void tinhPhanSo() {
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
	}
}
