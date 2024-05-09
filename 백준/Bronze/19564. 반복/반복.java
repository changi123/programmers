import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int cnt = 1 ;  
        	if( s.length() == 1) {
			System.out.println(cnt);
			return ;
		}
		for(int i= 0 ; i <s.length();i++) {

			if( i == s.length()-1) {

				if(s.charAt(i)-'a' > s.charAt(i-1)-'a') {
					break;
				}else {
					break;
				}
			}

			if( s.charAt(i)-'a' < s.charAt(i+1)-'a') {
				continue;
			}else {
				cnt++;
			}
		}


		System.out.println(cnt);
	}

}
