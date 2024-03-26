import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int [][] arr = new int[n][2];
		
		
		for(int i = 0; i < arr.length;i++) {
			
			for(int j = 0 ; j <arr[i].length;j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) return e1[1] - e2[1];
			else return e1[0] - e2[0];
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length;i++) {
			
			for(int j = 0 ; j <arr[i].length;j++) {
				if( j == 1) {					
					sb.append(arr[i][j]+"\n");
				}else {
					sb.append(arr[i][j]+" ");					
				}
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
