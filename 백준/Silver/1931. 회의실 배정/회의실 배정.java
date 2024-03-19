import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int [][] arr = new int[N][2];
		
		
		
		for(int i= 0 ; i < N ; i++) {
			arr[i][0] = Integer.parseInt(sc.next());
			arr[i][1] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr, (a1,a2)->a1[1] == a2[1]? a1[0] - a2[0] : a1[1] -a2[1]);
		int cnt = 0 ; 
		int end = -1;
//		System.out.println(Arrays.deepToString(arr));
		for(int i= 0 ; i < N ; i++) {
			if( arr[i][0] >=end) {
				end = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
