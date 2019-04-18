public class Kucing {
	private int size;
	private String breed;
	private String Name;
	public String bahasa;
	
	public void meow(int jumlah) {
		while (jumlah > 0) {
			if (size >20) {
				System.out.println("Meooow! Meooow!");
			} else if ( size > 10) {
				System.out.println("Meooow!");
			} else {
				System.out.println("Meow?");
			}
		jumlah = jumlah - 1;
		}
	}
	
	public void setSize(int nm){
		if (nm > 5) {
			size = nm;
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public String bicara() {
	return "Bahasa Kucing";
	}
}