import java.util.Scanner;

public class Problem2 {
	//List of Fibonacci numbers in an array

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter array length n:");
		int n = input.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Seeds 0 & 1:");
		array[0] = 0;
		array[1] = 1;
		
		for(int i = 2; i < array.length; i++){
			array[i] = array[i-1] + array[i-2];
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Seeds 1 & 1:");
		array[0] = 1;
		array[1] = 1;
		
		for(int i = 2; i < array.length; i++){
			array[i] = array[i-1] + array[i-2];
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}

}
