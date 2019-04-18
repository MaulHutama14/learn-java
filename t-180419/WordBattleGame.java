package folder1;

public class WordBattleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBattle game = new WordBattle();
		int[] a = {1,2,3};
		game.setLoc(a);
		game.setMaxLog(20);
		
		while (game.isAlive == true) {
			String guess = String.valueOf((int) (Math.random() * 5));
			game.takeGuess(guess);
			System.out.println("Player guessed " + guess);
			System.out.println(game.result);
		}
		
	}

}

class WordBattle {
	int[] loc;
	int NumOfHit = 0;
	int NumOfGuess = 0;
	int log;
	String result;
	Boolean isAlive = true;
	
	void setLoc(int[] a) {
		loc = a;
	}
	
	void setMaxLog(int a) {
		log = a;
	}
	
	String takeGuess(String a) {
		int b = Integer.parseInt(a);
		for (int i : loc) {
			if (i == b) {
					result = "Hit!";
					NumOfHit = NumOfHit + 1;
					NumOfGuess = NumOfGuess + 1;
					break;
			} else if (log == b){
				result = "Already Guess That Number";
				break;
			} else {
				result = "Miss!";
			}
			
		}
		
		if (NumOfHit == loc.length) {
			result = "Kill!";
			isAlive = false;
		} 
		
		log = b;
		return result;
	}
}
