package Xecon;

public class Xecon {
	
	int giaxe;
	
	public void tenXe(String name) {
		System.out.println("Ten xe la: " +name);
		
	}
	
	public void setGia(int gia) {
		giaxe = gia;
	}
	
	public void getGia() {
		System.out.println("Gia mua xe la: "+ giaxe);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xecon myCar = new Xecon();
		myCar.tenXe("lexus");
		myCar.setGia(10000000);
		myCar.getGia();

	}

}
