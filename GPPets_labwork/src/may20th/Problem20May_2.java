package may20th;

import java.util.Scanner;

public class Problem20May_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter the size of the array, n:");
		int n = input.nextInt();
		char[] charArr = new char[n];
		
		inputCharArray(charArr);

		printArray(charArr);
		
		reverseArray(charArr);
		
		char[] revArr = reverseArray(charArr);
		printArray(revArr);

	}
	
	
	
	public static void inputCharArray(char[] arr){
		for (int i = 0; i < arr.length; i++){
			arr[i] = (char)(i+61);
		}
		System.out.println();
	}

	public static void printArray(char[] arr){
		System.out.println("Array:");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static char[] reverseArray(char[] arr){
		char[] revArr = new char[arr.length];
		for (int i = 0; i < arr.length; i++){
			revArr[i] = arr[arr.length -1 -i];
		}
		return revArr;
	}

}
