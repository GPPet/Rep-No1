package may08th;

public class Problem1a {
	//Fills in symmetric array elements

	public static void main(String[] args) {
		
		int[] symm = new int[13];
		int n = symm.length;
		
		if(n % 2 == 0){
			for(int i = 0; i < (n/2); i++){
					symm[i] = i;
					symm[n-i-1] = i;
				}
				
			} else {
				for(int i = 0; i < ((n/2)+1); i++){
					symm[i] = i;
					symm[n-i-1] = i;
				}
			}
			
			for(int i = 0; i< symm.length; i++){
				System.out.print(symm[i] + " ");
			}
			
	}	
}