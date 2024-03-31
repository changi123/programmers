import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int [] arr = new int[n];

		int j = 0 ; 
		while(n > 0 ) {
			int [] arr2 = new int [2];
			int [] arr3 = new int [5];
			for(int i=0 ; i < 2 ; i ++) {
				arr2[i] = Integer.parseInt(sc.next());
			}
			for(int i=0 ; i < 5 ; i ++) {
				arr3[i] = Integer.parseInt(sc.next());
			}
			
			Arrays.sort(arr2);
			Arrays.sort(arr3);
			
			arr[j++] = arr2[arr2.length-1]+arr3[arr3.length-1]+arr3[arr3.length-2]; 
			n--;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);

	}

}
