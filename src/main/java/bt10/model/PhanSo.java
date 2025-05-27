package bt10.model;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public PhanSo cong(PhanSo phanSo) {
		int tuSo1 = this.tuSo * phanSo.mauSo;
		int tuSo2 = phanSo.tuSo * this.mauSo;
		int tuSo = tuSo1 + tuSo2;
		int mauSo = this.mauSo * phanSo.mauSo;
		return rutGon(tuSo, mauSo);
	}
	
	public PhanSo tru(PhanSo phanSo) {
		int tuSo1 = this.tuSo * phanSo.mauSo;
		int tuSo2 = phanSo.tuSo * this.mauSo;
		int tuSo = tuSo1 - tuSo2;
		int mauSo = this.mauSo * phanSo.mauSo;
		return rutGon(tuSo, mauSo);
	}
	
	public PhanSo nhan(PhanSo phanSo) {
		int tuSo = this.tuSo * phanSo.tuSo;
		int mauSo = this.mauSo * phanSo.mauSo;
		return rutGon(tuSo, mauSo);
	}
	
	public PhanSo chia(PhanSo phanSo) {
		int tuSo = this.tuSo * phanSo.mauSo;
		int mauSo = this.mauSo * phanSo.tuSo;
		return rutGon(tuSo, mauSo);
	}
	
	private PhanSo rutGon(int tuSo, int mauSo) {
		int ucln = 1;
		for(int i = 1; i <= tuSo; i++) {
			if (tuSo % i == 0 && mauSo % i == 0) {
				ucln = i;
			}
		}
		PhanSo result = new PhanSo();
		result.setTuSo(tuSo / ucln);
		result.setMauSo(mauSo / ucln);
		return result;
	}
	
	public String toString() {
		return tuSo + "/" + mauSo;
	}
}
