import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int answer= 0 ; 
		int [] minMil = new int [n]; 
		int index = 0 ; 
		while(n--> 0) {
	
			int p = Integer.parseInt(sc.next());
			int l = Integer.parseInt(sc.next());
			
			int [] miles = new int[p];
			
			for(int i = 0 ; i <miles.length;i++) {
				miles[i] = Integer.parseInt(sc.next());
			}
			
			Arrays.sort(miles);
			
			if( l > p) {
				minMil[index++]++;
			} else {
				minMil[index++]+=miles[p-l];
			}
			
		}
		
		Arrays.sort(minMil);
		
		int sum = 0 ; 
		for(int i = 0 ; i < minMil.length; i++) {
			sum+=minMil[i];
			if( sum > m) {
				break;
			}else {
				answer++;
			}
			
		}
		
		System.out.println(answer);
		sc.close();
	}

}
