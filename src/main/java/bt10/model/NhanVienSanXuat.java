package bt10.model;

public class NhanVienSanXuat extends NhanVien {
	private Integer luongCanBan;
	private Integer soSanPham;
	// Tao java doc
	/**
	 * Khởi tạo một nhân viên sản xuất với lương cơ bản và số sản phẩm đã sản xuất.
	 *
	 * @param luongCanban Lương cơ bản của nhân viên.
	 * @param soSanPham   Số lượng sản phẩm nhân viên đã sản xuất.
	 */
	public NhanVienSanXuat(Integer luongCanban, Integer soSanPham) {
		this.luongCanBan = luongCanban;
		this.soSanPham = soSanPham;
	}
	public void calculateLuong() {
		this.setLuong(luongCanBan + soSanPham * 5000);
	}
	public Integer getSoSanPham() {
		return soSanPham;
	}
	public void setSoSanPham(Integer soSanPham) {
		this.soSanPham = soSanPham;
	}
	public Integer getLuongCanBan() {
		return luongCanBan;
	}
	public void setLuongCanBan(Integer luongCanBan) {
		this.luongCanBan = luongCanBan;
	}
	
}
