import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String s= sc.next();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if( i == 0 ) {
				System.out.print(s.charAt(i));
				continue;
			}
			if( i % 10 == 0) {
				System.out.println();
				
				
			}
			
			System.out.print(s.charAt(i));
		}
	}

}
