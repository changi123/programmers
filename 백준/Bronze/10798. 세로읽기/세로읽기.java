import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
//		int n = Integer.parseInt(sc.next());
		
		String [][] arr = new String[5][15];
		
		
		for(int i= 0 ; i < arr.length; i++) {
			String s = sc.nextLine();
			
			int len = s.length();
			for(int j = 0 ; j < len;j++) {
				arr[i][j]= s.charAt(j)+"";
			}
		}
		
		for(int i = 0 ; i <arr[0].length ;i++) {
			for(int j = 0 ; j <arr.length;j++) {
				if( arr[j][i] != null) {
					System.out.print(arr[j][i]);
				}
			}
			
		}
	}

}
