import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] arr = sc.next().split("");
		
		String [] d = {"0","0","0","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			
			String s = arr[i];
			
			for(int j = 0 ; j < d.length;j++) {
				
				if( d[j].contains(s)) {
					sum+=j;
					break;
				}
				
			}
			
		}
		
		System.out.println(sum);
	}

}
