package bt10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
