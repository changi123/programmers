import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner( System.in );

		
		
			while(true) {
				try {
					int A = Integer.parseInt(sc.next());
					int B = Integer.parseInt(sc.next());
					int C = Integer.parseInt(sc.next());
					int max = Math.max(B-A, C-B);
					System.out.println(max-1);
										
				}catch(Exception e){
					break;
					
				}
				
				
			}
		
		
	}
		
	

}
