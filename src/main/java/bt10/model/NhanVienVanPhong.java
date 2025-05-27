 package bt10.model;

public class NhanVienVanPhong extends NhanVien {
	private Integer soNgayLamViec;
	
	public NhanVienVanPhong(Integer soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public void calculateLuong() {
		this.setLuong(soNgayLamViec * 100000);
	}

	public Integer getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(Integer soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
}
