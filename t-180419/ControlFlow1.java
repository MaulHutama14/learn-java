package folder1;


public class ControlFlow1 {
/* Penggunaan continue pada FOR statement
 * 
 * input : 
 * 			int batas => sebagai batas increment i
 * proses :
 * 			melakukan looping sebanyak 11 kali dimana ketika syarat
 *			i % 2 != 0, akan continue (tidak menjalankan script dibawahnya)
 *			Apabila syarat tidak terpenuhi, maka dilakukan penulisan i adalah angka Genap
 * output :
 * 			println (i + adalah angka genap)
 * 			eg:
 * 			0 adalah Angka Genap
 * 			2 adalah Angka Genap
 * 			...
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int batas = 11;
		for (int i = 0; i < batas; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i + " adalah Angka genap");
		}
	}

}
