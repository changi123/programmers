import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		char [][] arr = new char[n][m];
		for(int i= 0 ; i < arr.length;i++) {
			
			String s = sc.next();
			for(int j=  0;  j< arr[i].length ;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int hCnt = 0 ; 
		for(int i= 0; i < arr[0].length;i++) {
			int [] cnt = new int[26];
			for(int j = 0 ; j <arr.length;j++) {
				if( arr[j][i] == 'A') {
					cnt['a'-97]++;
				}else if( arr[j][i] == 'T') {
					cnt['t'-97]++;
				}else if( arr[j][i] == 'G') {
					cnt['g'-97]++;
				}else {
					cnt['c'-97]++;
				}
				
			}
			int index = 0 ;
			int max = 0 ;
			
			
			for(int j = 0 ; j <cnt.length;j++) {
				if(cnt[j] > max) {
					index = j;
					max = cnt[j];
				}
			}	
			hCnt+=n-cnt[index];
			System.out.print(Character.toUpperCase((char) (97+index)) );
			
		}
		System.out.println();
		System.out.println(hCnt);

		
	}

}
