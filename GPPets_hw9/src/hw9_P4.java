import java.util.Scanner;


public class hw9_P4  {
	
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please, enter the sentence:");
//		String text = input.nextLine();
		String text = "This is an apple. This is an orange. I love apples and oranges.";
		
		String[] splittedText = text.split("(?<=[a-z])\\.\\s+");
		
//		for (String part : splittedText) {
//			System.out.println(part);
//		}
		
//		System.out.println("Please, enter a word to search:");
//		String word = input.nextLine();
		
		String word = "apple";
		String wordPl = "apples";
		
		for (String part : splittedText) {
			part = part.replaceAll("\\.", "");
			if ( part.toLowerCase().contains(word)){
				System.out.print(part + ". ");
			} else if ( part.toLowerCase().contains(wordPl) ){
				System.out.println(part + ".");
			}
		}
				
	}
}
