import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int cnt = 0;
		int cnt2 = 0 ;
		String [] arr = s.split("");
		for(int i= 0; i < s.length(); i++) {
			if( s.length() -1 == i) {
				break;
			}
			if( !arr[i].equals(arr[i+1])) {
				cnt++;
			}
		}

		System.out.println((cnt+1) / 2);
	}

}
