import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		Integer [] arr = new Integer[n];
		
		for(int i= 0 ; i < arr.length ; i++ ) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		int answer = 0 ; 
		mainFor:for(int i= 0; i < arr.length-2;i++) {
			for(int j = i+1 ; j < arr.length-1 ; j++) {
				for(int k = j+1 ; k < arr.length; k ++ ) {
					if( arr[i]+arr[j]+arr[k] ==  m ) {
						answer = arr[i]+arr[j]+arr[k];
						break mainFor ; 
					}
					
					if( answer < arr[i]+arr[j]+arr[k] && arr[i]+arr[j]+arr[k] <m ) {
						answer = arr[i]+arr[j]+arr[k] ; 
					}
				}
			}
			
		}
		System.out.println(answer);
		
	}

}
