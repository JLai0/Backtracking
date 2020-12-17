import java.util.ArrayList;

public class AnagramExplorer {

	public static void main(String[] args) {
		ArrayList<String> dictionary = new ArrayList<String>();
		dictionary.add("go");
		dictionary.add("shrug");
		dictionary.add("gush");
		dictionary.add("bee");
		anagramExplorer(dictionary, "George Bush");
	}
	
	public static void anagramExplorer(ArrayList<String> dictionary, String chosen) {
		ArrayList<String> anagramList = new ArrayList<String>();
		anagramExplorer();
	}
	
	private static void anagramExplorer() {
		
	}

}
