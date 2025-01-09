import java.util.*;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());


		int [] arr = new int [n];

		for(int i= 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		int i = 0 ; 
		int j = 0 ;
		int sum = 0 ;

		int len = Integer.MAX_VALUE;

		while(  j < n ) {
			if (sum < s) {
				sum += arr[j++];
			}
			while (sum >= s) {
				len = Math.min(j - i, len);
				sum -= arr[i++];
			}

		}
		if( len == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(len);
		}
	}

}
