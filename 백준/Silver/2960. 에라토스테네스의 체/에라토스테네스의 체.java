import java.util.*;


public class Main {
static int [] arr ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k =Integer.parseInt(sc.next());
		arr = new int[n+1];
		for(int i= 2 ; i < arr.length;i++) {
			arr[i] = i;
		}
		int cnt = 0 ; 
		
		
		int i = 1 ; //  곱하는 수
		
		
		int num = 2; // 처음 가장 작은 수 
		
		int index = num ; // 지울 인덱스
		
		while(true) {
		
			
			

			if( (num * i) <= n ) {
				int answer  = 0 ;
				if( arr[index] !=0) {										
					cnt++;
					answer = arr[index];
					arr[index] = 0 ;
				}
				if( cnt == k ) {
					System.out.println(answer);
					break;
				}
				
				i++;
				index = num *i ; 
			}else {				
				int min = checkMin();
				num = min ; 
				i = 1; 
				index = num ; 
			}
			
		}
	}
	public static int checkMin() {
		for(int i = 2;  i < arr.length;i++) {
			if( arr[i] != 0) {
				return arr[i];
			}
		}
		return 1;
	}
	
}
