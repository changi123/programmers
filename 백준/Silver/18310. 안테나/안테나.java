import java.util.*;


public class Main {

	public static void main(String[] args) {
	
			
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		sc.nextLine();
		int [] arr = new int [N];
		for(int i= 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		Arrays.sort(arr);
		
		if( arr.length % 2 ==0) {			
			int a = arr[arr.length/2];
			int b = arr[arr.length/2-1];
			System.out.println(Math.min(a,b));
		} else {
			System.out.println(arr[arr.length/2]);
		}
		
	}

}
