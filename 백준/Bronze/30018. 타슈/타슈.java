import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next()); //N개 대여소
		
		
		int [] aArr = new int[N];
		int [] bArr = new int[N];
		
		
		for(int i= 0 ; i < N ; i++) {
			aArr[i] = Integer.parseInt(sc.next());
		}
		
		for(int i= 0 ; i < N ; i++) {
			bArr[i] = Integer.parseInt(sc.next());
		}
		
		int cnt = 0;
		for(int i =0  ; i <N ; i++) {
			int num = bArr[i] - aArr[i] ;
			if( num > 0) {
				cnt = cnt + num;
			}
		}
		
		System.out.println(cnt);
	}

}
