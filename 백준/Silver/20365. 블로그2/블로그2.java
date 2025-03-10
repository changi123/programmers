import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int rCnt = 0 ; 
		int bCnt = 0 ;
		String [] rArr = s.split("B");
		String [] bArr = s.split("R");

		for(int i = 0 ; i < rArr.length;i++) {
			if( !rArr[i].equals("")) {
				rCnt++;
			}
		}

		for(int i = 0 ; i < bArr.length;i++) {
			if( !bArr[i].equals("")) {
				bCnt++;
			}
		}
		System.out.println(Math.min(rCnt,bCnt)+1);
	}

}
