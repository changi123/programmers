import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int [][]arr = new int [n][2];
		
		for(int i= 0 ; i <arr.length;i++) {
			
			for(int j= 0 ; j< arr[0].length ; j++) {
				if( j == 0 ) {					
					arr[i][j] = Integer.parseInt(sc.next());
				}else {
					arr[i][j] = i+1;
				}
			}
		}
		
		Arrays.sort(arr,(a1,a2) ->a2[0]-a1[0] );
//		System.out.println(Arrays.deepToString(arr));
		for(int i= 0 ; i < arr.length;i++) {
				arr[i][1] = i+1;
		}
		long sum = 0 ; 
		for(int i= 0 ; i < arr.length;i++) {
			if( arr[i][0] -( arr[i][1]-1) > 0 ) {				
				sum+=arr[i][0] -( arr[i][1]-1);
			}
			
		}
		System.out.println(sum);
		
	}

}
