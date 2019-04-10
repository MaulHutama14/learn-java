public class Kucing {
	int size;
	String breed;
	String Name;
	String bahasa;
	
	void meow(int jumlah) {
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
	
	void setSize(int nm){
		if (nm > 5) {
			size = nm;
		}
	}
	
	String bicara() {
	return "Bahasa Kucing";
	}
}