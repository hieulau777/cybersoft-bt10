package bt10.model;

public class VanDongVien {
	private String hoTen;
	private Integer tuoi;
	private String monThiDau;
	private Double canNang;
	private Double chieuCao;
	
	public VanDongVien() {}
	
	public VanDongVien(String hoTen, Integer tuoi, String monThiDau, Double canNang, Double chieuCao) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.monThiDau = monThiDau;
		this.canNang = canNang;
		this.chieuCao = chieuCao;
	}
	
	public void soSanh(VanDongVien vdv) {
		
		int result = this.compareTo(vdv);
		
		if(result > 0) {
			System.out.println("Vđv " + this.hoTen + " lớn hơn vận động viên " + vdv.hoTen);
		} else if(result < 0) {
			System.out.println("Vđv " + vdv.hoTen + " lớn hơn vận động viên " + this.hoTen);
		} else System.out.println("Vđv " + this.hoTen + " bằng vận động viên " + vdv.hoTen);
		
	}
	
	private int compareTo(VanDongVien vdv) {
		if(this.chieuCao > vdv.chieuCao) return 1;
		if(this.chieuCao < vdv.chieuCao) return -1;
		
		if(this.canNang > vdv.canNang) return 1;
		if(this.canNang < vdv.canNang) return -1;
		
		return 0;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Integer getTuoi() {
		return tuoi;
	}
	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}
	public String getMonThiDau() {
		return monThiDau;
	}
	public void setMonThiDau(String monThiDau) {
		this.monThiDau = monThiDau;
	}
	public Double getCanNang() {
		return canNang;
	}
	public void setCanNang(Double canNang) {
		this.canNang = canNang;
	}
	public Double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(Double chieuCao) {
		this.chieuCao = chieuCao;
	}
	
}
