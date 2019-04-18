package folder1;

public class ControlFlow2 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
			int umur = (int) (Math.random() * 5 );
/*			if (i == 2) {
				break;
			}
*/
			System.out.println(umur);
		switch (umur) {
		case 1: System.out.println("Umur anda adalah 1 tahun");
				break;
		case 3: System.out.println("Umur anda adalah 3 tahun");
				break;
		case 5: System.out.println("Umur anda adalah 5 tahun");
				break;
		default: System.out.println("Umur anda tidak ditemukan");
				break;
		}
	}

}
}