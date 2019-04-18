public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListoOne = {"14/04","date-Born","Maulana","name",
		"85","weight","167","tall"};
		
		String[] wordListTwo = {"basket","program","geofisika","java",
		"python"};
		
		String[] wordListThree = {"facebook","linkedin","twitter",
		"line"};
		
		int oneLength = wordListoOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListoOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("Jadi semuanya menjadi " + phrase);
	}
}