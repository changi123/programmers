import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Integer [] arr = new Integer[n];
		
		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		
		int answer = 0 ; 
		
		for(int i=  0 ; i <arr.length;i++) {
			
			int s = 0;
			
			int e = arr.length-1;
			
			int findNum = arr[i];
			int sum = 0 ; 
			
			while(s < e) {
				sum = arr[s]+arr[e];
				if( sum == findNum) {					
					if( i == s) {
						s++;
					} else if( e == i ) {
						e--;
					} else {
						answer++;
						break;
					}
				}
				if( arr[s] + arr[e] > findNum) {
					e--;
				} else if( arr[s] +arr[e] < findNum) {
					s++;
				}
			}
			
		}
		
		System.out.println(answer);
	}

}
