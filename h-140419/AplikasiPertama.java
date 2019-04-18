public class AplikasiPertama{
	public static void main (String[] args) {
		int x = 3;
		String nama = "Maulana";
		x = x*14;
		System.out.println("x is " + x);
		double d = Math.random();
		// comment line
		
		while (x > 12)	{
			x = x - 1;
			System.out.print(x);
		}
		
		for (x = 0; x < 10; x = x+1) {
			System.out.println("x is now "+x);
			if (x == 5) {
				System.out.println("I declared that i am MAULANA");
			}
		}
	}
}