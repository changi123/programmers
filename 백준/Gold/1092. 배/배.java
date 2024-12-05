import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		
		List<Integer> cranes = new ArrayList<>();
		List<Integer> boxs = new ArrayList<>();
		
		for(int i= 0 ; i < n ; i++) {
			cranes.add(Integer.parseInt(sc.next()));
		}
		
		int m = Integer.parseInt(sc.next());
		
		for(int i= 0 ; i < m ; i++) {
			boxs.add(Integer.parseInt(sc.next()));
		}
		
		cranes.sort(Collections.reverseOrder());
		boxs.sort(Collections.reverseOrder());
		
		
		
		if( cranes.get(0) < boxs.get(0)) {
			System.out.println(-1);
			return ;
		}
		int answer = 0 ;
		while(!boxs.isEmpty()) {
			for(int i= 0 ; i < n ; i++) {
			
				for(int j = 0 ; j < boxs.size() ; j++) {
					if( cranes.get(i) >= boxs.get(j)) {
						boxs.remove(j);
						break;
					} 
				}
				
			}
			answer++;
			
		}
		System.out.println(answer);
		
	}

}
