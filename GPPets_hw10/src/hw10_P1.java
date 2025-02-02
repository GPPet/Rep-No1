import java.util.HashMap;
import java.util.Scanner;


public class hw10_P1 {

	public static void main(String[] args) {
		// Напишете програма, която приема 20 думи и показва по колко пъти се среща всяка една от тях.
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please, enter the words:");
//		String text = input.nextLine();
		
		String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day.";
		text = text.toLowerCase();
		
		String[] splitText = text.split("[ ,.!]");
//		for (String word : splitText) {
//			System.out.print(word + " | ");
//		}
		
		int count = 0;
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word : splitText){
			wordCount.putIfAbsent(word, count);
		}

//		System.out.println(wordCount);
		
		for(String word : wordCount.keySet()){
			count = 0;
			for(int i = 0; i < splitText.length; i++){
				if(splitText[i].equals(word)) count++;
			}
			wordCount.put(word, count);
			System.out.println(word + " : " + wordCount.get(word));
		}

		
	}

}
