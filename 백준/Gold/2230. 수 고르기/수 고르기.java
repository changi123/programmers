import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		int i = 0 ; 
		int j = 0 ; 
		int answer = Integer.MAX_VALUE ; 
		
		while(i < n ) {
			
			if( arr[i] - arr[j] < m ) {
				i++;
				continue;
			}
			
			if( arr[i] - arr[j] == m ) {
				answer = m ; 
				break;
			}
			
			answer = Math.min(answer, arr[i]-arr[j]);
			
			j++;
			
			
			
		}
		System.out.println(answer);
		
	}

}
