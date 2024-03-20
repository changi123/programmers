import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		String s = sc.next();
		
		
		int [] answer = new int [26];
		
		for(int i = 0 ; i < answer.length; i++) {
			answer[i] = -1;
		}
		
		
		for(int i= 0; i < s.length();i++) {
			char c= s.charAt(i);
			if( answer[c-97]==-1) {				
				answer[c-97] = i ;
			}
			
		}
		
		for(int i= 0 ; i < answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
		
	}

}
