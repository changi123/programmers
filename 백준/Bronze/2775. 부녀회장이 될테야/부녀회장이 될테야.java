import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);




		int T = Integer.parseInt(sc.next());

		while(T >0) {

			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());


			int [][] arr = new int[n+1][m];


			//		System.out.println(Arrays.deepToString(arr));

			int answer = 0;
			for(int i= 0 ; i < arr.length; i++) {
				for(int j = 0 ;  j< arr[i].length; j++) {
					if( i == 0) {
						arr[i][j] = j+1 ;
					} else {
						int sum = 0 ; 
						for(int k = 0 ; k <=j ; k++) {
							sum+=arr[i-1][k];
						}
						arr[i][j] = sum;
						if( j == m-1) {
							answer= arr[i][j];
							break;
						}
					}
				}
				if( i == n) {
					System.out.println(answer);
					break;
				}
			}


			T--;
		}

	}

}
