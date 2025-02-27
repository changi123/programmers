import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		
		for(int i = 0 ; i < t; i++) {
			int p = Integer.parseInt(sc.next());
			String [][] arr = new String[p][2];
			
			for(int j = 0 ; j < p ; j++) {
				
				arr[j][0] = sc.next();
				arr[j][1] = sc.next();
				
			}
			
			Arrays.sort(arr, (a1,a2)->{
				return Integer.compare(Integer.parseInt(a2[0]), Integer.parseInt(a1[0]));
			});
			
	
			System.out.println(arr[0][1]);
		}	
		
		
		
		
		
		
		
		
	}

}
