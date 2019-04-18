package folder1.a1;

public class KelasKondisiDinamis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kota = "Jakarta";
		String status = "Tetap";
		if (kota.equals("Papua") || status.equals("Tetap")) {
			System.out.println("Terima");
		} else {
			System.out.println("Tolak");
		}
	}

}
