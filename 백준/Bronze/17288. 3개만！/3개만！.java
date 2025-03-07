import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String s = sc.next();


		String [] arr = new String [s.length()];
		for(int i = 0; i < s.length();i++) {
			arr[i] = s.charAt(i)+"";
		}
		int cnt = 0 ;
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		for(int i = 1 ; i< arr.length;i++) {
			if( s.charAt(i-1) ==  s.charAt(i)-1 || sb.length()==0) {
				sb.append(s.charAt(i));
			} else {
				if( sb.length() == 3 ) {
					cnt++;
					sb = new StringBuilder();
					sb.append(s.charAt(i));
				}  else if( sb.length() > 3 ) {
					sb = new StringBuilder();
					sb.append(s.charAt(i));
				}
			}

			


		}
		if( sb.length() == 3  ) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt);
		}
	}

}
