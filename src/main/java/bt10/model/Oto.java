package bt10.model;

public class Oto extends PhuongTienGiaoThong {
	private Integer soChoNgoi;
	private String kieuDongCo;
	
	public Oto(String hangSanXuat, String ten, Integer namSanXuat, Integer vanTocToiDa, Integer soChoNgoi, String kieuDongCo) {
		super(hangSanXuat, ten, namSanXuat, vanTocToiDa);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	
	public Integer getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(Integer soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
	    System.out.println("Số chỗ ngồi: " + getSoChoNgoi());
	    System.out.println("Kiểu động cơ: " + getKieuDongCo());
	}
}
