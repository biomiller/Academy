
public class Runner {

	public static void main(String[] args) {

		String test = "this is a sentence";

		capitalWords(test);
	}

	public static String capitalWords(String s) {
		String[] splitS = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String word : splitS) {
			sb.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
		}

		return sb.toString().trim();
	}
	


}
