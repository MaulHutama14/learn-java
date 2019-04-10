public class KucingTestDrive {
	public static void main (String[] args) {
		Kucing[] k = new Kucing[3];
		for ( int i = 0; i < 3; i++) {
			k[i] = new Kucing();
			k[i].size = i*7+9;
			k[i].meow(3);
			k[i].bahasa = k[i].bicara();
			System.out.println(k[i].bahasa);
		}
	}
}