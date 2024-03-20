import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		for(int i= 0 ; i < n; i++) {
			
			int r = Integer.parseInt(sc.next());
			String s[] = sc.next().split("");
			
			for(int j = 0 ; j < s.length;j++) {
				
				for(int k = 0 ; k <r ; k++) {
					System.out.print(s[j]);
				}
			}
			System.out.println();
		}
	}

}
