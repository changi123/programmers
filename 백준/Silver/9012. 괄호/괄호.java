import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		


		int j = 1 ;
		while(n > 0) {
			String s = sc.next();

			int cnt1 = 0;
			int cnt2 = 0 ;
			for(int i= 0 ; i <s.length() ;i++) {
				
				if( s.charAt(i) == '(') {
					cnt1++;
				}else {
					cnt2++;
				}
				if( cnt2 > cnt1 ) {
					System.out.println("NO");
					break;
				}
				
				if( cnt1 == cnt2 && i == s.length()-1) {
					System.out.println("YES");
					break;
				} else if( s.charAt(s.length()-1) == '(') {
					System.out.println("NO");
					break;
				} else if( cnt1 != cnt2 && s.length()-1 ==i) {
					System.out.println("NO");
					
				}
			}
			
			n--;
			
		}
	}

}
