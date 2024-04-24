import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] arr = new int [n];
		int cnt = 0 ;
		int sum = 0 ; 
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		int i = 0 ; 
		while(true) {
			if( i == arr.length-1) {
				break;
			}
			if( arr[i] >= arr[i+1]) {
				cnt+=arr[i]-arr[i+1]+1;
				arr[i] -= cnt;
				sum+=cnt;
				cnt = 0 ; 
				i=0;
				continue;
			}else {
				i++;
			}
		}
		
		System.out.println(sum);
	}

}
