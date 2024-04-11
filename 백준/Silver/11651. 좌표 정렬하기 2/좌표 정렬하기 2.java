import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int [][] arr = new int[n][2];
		for(int i= 0 ; i < arr.length;i++) {
			
			for(int j = 0;  j < arr[i].length;j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		Arrays.sort(arr,(a1,a2)-> a1[1]==a2[1]? a1[0]-a2[0] : a1[1]-a2[1]);
		
		
		for(int i= 0 ; i < arr.length;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0;  j < arr[i].length;j++) {
				sb.append(arr[i][j] + " ");
			}
			System.out.println(sb.toString());
		}
	}

}
