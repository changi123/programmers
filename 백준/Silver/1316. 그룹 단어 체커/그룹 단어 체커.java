import java.util.*;


public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		boolean flag = true;
		int cnt = 0 ;
		for(int t= 0 ; t < n ; t++) {
			String s = sc.next();
			if( oneCheck(s) ) { 
				cnt++;
				continue;
			} else {
				for(int i = 0 ; i < s.length() ; i++) {
					char c= s.charAt(i);
					if( indexCheck(c, s)) {
						continue;
					} else {
						flag = false;
						break;
					}
					
				}
				if( flag ) {
					cnt++;
				}else {
					flag = true;
					continue;
				}
				
			}

			
		}
		
		System.out.println(cnt);
	}
public static boolean oneCheck(String s ) {
		char c = s.charAt(0);
		
		s = s.replaceAll(c+"", "");
		if( s.length() == 0 ) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean indexCheck(char c, String s ) {
		int indexFirst = s.indexOf(c);
		int indexLast = s.lastIndexOf(c);
		
		s = s.substring(indexFirst,indexLast+1);
		s = s.replaceAll(c+"", "");
		if( s.length() == 0) {
			return true;
		}else {
			return false;
		}
		
	}
}
