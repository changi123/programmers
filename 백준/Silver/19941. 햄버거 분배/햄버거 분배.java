import java.util.*;


public class Main {
static String [] arr = new String[20000];
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String s = sc.next();
		arr = s.split("");
		for(int i= 0 ; i < n ;i++) {

			if( arr[i].equals("P")) {
					check(arr,i,k);				
			}

		}
		System.out.println(cnt);
	}
public static void check(String [] arr , int index, int k ) {
	
		for(int i= index-k ; i <= index +k ;i++) {
			if( i > arr.length-1) {
				return ;
			}
			if( i < 0 ) {
				continue;
			}
			if( arr[i].equals("H")) {
				cnt++;
				arr[i] = "X";
				return ;
			}
		}		
	}


}
