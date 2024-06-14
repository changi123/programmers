import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		if( k >= n ) {
			System.out.println(0);
			return ; 
		}
		int [] arr = new int[n];
		for(int i = 0; i < n ;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		
		int [] indexArr = new int[n-1];
		int index = 0 ; 
		for(int i= 0 ; i < arr.length -1 ;i++) {
			indexArr[index++] = arr[i+1]-arr[i];
		}
		
		Arrays.sort(indexArr);
		int sum = 0 ; 
		for(int i= 0 ; i < n - k ; i++) {
			sum+=indexArr[i];
		}
		
		System.out.println(sum);
	}

}
