import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		int oneDSize = n*n;
//		int[] oneD = new int[oneDSize];
		int[][] twoD = new int[n][n];
		
//		Scanner input = new Scanner(System.in);
		for(int i = 0; i < oneDSize; i++){
			System.out.println("Please enter a number:");
//			oneD[i] = input.nextInt();
		}
		
		int[] oneD = {5,3,2,0,6,1,2,4,4};
		
//		for(Integer num : oneD)
//		System.out.println(num + " ");
		
		
		int i = 0;
		while(i < oneDSize){
			for(int col = 0; col < twoD[0].length; col++){
				for(int row = 0; row < twoD.length; row++){
					twoD[row][col] = oneD[i]*i ;
					i++;
				}
			}
		}
		
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[0].length; col++){
				System.out.print(twoD[row][col] + "\t| ");
			}
			System.out.println();
			for(int col = 0; col < twoD[0].length; col++){
				System.out.print("____" + "\t| ");
			}
			System.out.println();
		}
		
		
		
		
//		try {
//			
//			FileWriter fileStream = new FileWriter(filePath);
////			FileWriter fileStream = new FileWriter(filePath, true);
//			
//			for(int row = 0; row < twoD.length; row++){
//				for(int col = 0; col < twoD[0].length; col++){
//					System.out.print(twoD[row][col] + " | ");
//				}
//				System.out.println();
//			}
//			
//			System.out.print((int)'a');
//			writer.close();
//			
//		} catch (Exception e) {
//			System.out.println("Error while writing a file.");
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
//		
//		System.out.println("The file is succes.");
//	}
//
	}

}
