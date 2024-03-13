import java.util.*;


public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		String s = sc.next();
		
		int len = s.length();
		s = s.replace("LL", "S");
		int cnt = 0;
		if( len == s.length()) {
			for(int i= 0 ; i <s.length();i++) {
				cnt++;
			}
			System.out.println(cnt);
		} else {
			
			for(int i= 0 ; i <s.length();i++) {
				cnt++;
			}
			System.out.println(cnt+1);
		}
		
		
	}

}
