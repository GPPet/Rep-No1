import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Enter n");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++){
			System.out.println(i);
		}
		
	}

}
