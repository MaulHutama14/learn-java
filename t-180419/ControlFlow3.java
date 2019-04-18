package folder1;
import java.util.Arrays;



public class ControlFlow3 {
	static int[][] matrix = {{5,4,3},{1,1,1}};
	int x = 1;
	public static void main(String[] args) {
		ControlFlow3 maul = new ControlFlow3();
		maul.pencariAngka(3);
	}

	
	public void pencariAngka(int pencari) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (pencari == matrix[i][j]) {
					System.out.println(pencari + " berada pada " + i + "," + j);
					break;
				}
			}
		}
	}
}

