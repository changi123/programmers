import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [] arr1 = new int[n];
		int [] arr2 = new int[m];
		
		int [] arr3 = new int[n+m];
		
		
		for(int i= 0 ; i < n ; i++) {
			arr1[i] =Integer.parseInt(sc.next());
		}
		for(int i= 0 ; i < m ; i++) {
			arr2[i] =Integer.parseInt(sc.next());
		}
		
		if( arr1.length> arr2.length) {
			System.arraycopy(arr1, 0, arr3, 0,arr1.length);
			System.arraycopy(arr2, 0, arr3, arr1.length,arr2.length);
		}else {
			System.arraycopy(arr2, 0, arr3, 0,arr2.length);
			System.arraycopy(arr1, 0, arr3, arr2.length,arr1.length);
		}
		
		
		Arrays.sort(arr3);
		StringBuilder sb = new StringBuilder();
		for(int num : arr3) {
			sb.append(num + " ");
		}
		
		System.out.println(sb.toString());
		
	}

}
