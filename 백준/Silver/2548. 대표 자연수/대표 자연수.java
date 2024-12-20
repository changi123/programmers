import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
	
		List<Integer> list = new ArrayList<Integer>();
		for(int i= 0 ; i < n ; i ++) {
			list.add(Integer.parseInt(sc.next()));
		}
		
		list.sort(null);
		int min = 0 ;
		int indexNum = 0 ; 
		for(int i = 0 ; i < list.size();i++) {
			int sum = 0 ; 
			for(int j = 0 ; j < list.size();j++) {
				int num = Math.abs(list.get(j)-list.get(i));
				sum+=num;
			}
			if( i== 0 ) {
				min = sum;
				indexNum = list.get(i) ; 
				continue;
			}
			
			if( min > sum) {
				min = sum ; 
				indexNum = list.get(i) ; 
			}			
		}
		System.out.println(indexNum);
		
	}

}
