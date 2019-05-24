import java.util.HashMap;

public class Morse {
	
	
	static String rawMorse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
	
	static HashMap <String, Character> morseToChar = new HashMap<>();

	public static void main(String[] args) {
	
	
		
	morseToChar.put(".-",'A');
	morseToChar.put("-...", 'B');
	morseToChar.put("-.-.", 'C');
	morseToChar.put("-..", 'D');
	morseToChar.put(".", 'E');
	morseToChar.put("..-.", 'F');
	morseToChar.put("--.", 'G');
	morseToChar.put("....", 'H');
	morseToChar.put("..", 'I');
	morseToChar.put(".---", 'J');
	morseToChar.put("-.-", 'K');
	morseToChar.put(".-..", 'L');
	morseToChar.put("--", 'M');
	morseToChar.put("-.", 'N');
	morseToChar.put("---", 'O');
	morseToChar.put(".--.", 'P');
	morseToChar.put("--.-", 'Q');
	morseToChar.put(".-.", 'R');
	morseToChar.put("...", 'S');
	morseToChar.put("-", 'T');
	morseToChar.put("..-", 'U');
	morseToChar.put("...-", 'V');
	morseToChar.put(".--", 'W');
	morseToChar.put("-..-", 'X');
	morseToChar.put("-.--", 'Y');
	morseToChar.put("--..", 'Z');
	morseToChar.put(".----", '1');
	morseToChar.put("..---", '2');
	morseToChar.put("...--", '3');
	morseToChar.put("....-", '4');
	morseToChar.put(".....", '5');
	morseToChar.put("-....", '6');
	morseToChar.put("--...", '7');
	morseToChar.put("---..", '8');
	morseToChar.put("----.", '9');
	morseToChar.put("-----", '0');
	morseToChar.put(".-.-.-", '.');
	morseToChar.put("--..--", ',');
	morseToChar.put("..--..", '?');
	morseToChar.put("/", ' ');
	
	morseToAlpha(rawMorse);
	
	}
	
	public static String morseToAlpha(String rawMorse) {
	
		String[] getchars =  rawMorse.split(" ");
	
		String translated = "";
	
		for(String letter:getchars) {
		translated += (morseToChar.get(letter));
		}
	
		System.out.println(translated);
		
		return translated;
	
	}
	
	

}
