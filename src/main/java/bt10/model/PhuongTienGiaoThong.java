package bt10.model;

public class PhuongTienGiaoThong {
	private String hangSanXuat;
	private String ten;
	private Integer namSanXuat;
	private Integer vanTocToiDa;
	
	public PhuongTienGiaoThong(String hangSanXuat, String ten, Integer namSanXuat, Integer vanTocToiDa) {
		this.hangSanXuat = hangSanXuat;
		this.ten = ten;
		this.namSanXuat = namSanXuat;
		this.vanTocToiDa = vanTocToiDa;
	}
	
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Integer getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(Integer namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public Integer getVanTocToiDa() {
		return vanTocToiDa;
	}
	public void setVanTocToiDa(Integer vanTocToiDa) {
		this.vanTocToiDa = vanTocToiDa;
	}
	
	public void inThongTin() {
		System.out.println("Hãng sản xuất: " + getHangSanXuat());
		System.out.println("Tên phương tiện: " + getTen());
		System.out.println("Năm sản xuất: " + getNamSanXuat());
		System.out.println("Vận tốc tối đa: " + getVanTocToiDa() + "km/h");
	}
	
}
