import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int [] wArr = new int[10];
		int [] kArr = new int[10];
		int w = 0 ;
		int k = 0 ;
		for(int i= 0 ; i  < 20 ; i++) {
			if( i <10 ) {
				wArr[w++] = Integer.parseInt(sc.next());
			} else {
				kArr[k++]= Integer.parseInt(sc.next());
			}
		}
		
		
		Arrays.sort(wArr);
		Arrays.sort(kArr);
		
		System.out.print(wArr[wArr.length-1]+wArr[wArr.length-2]+wArr[wArr.length-3] + " ");
		System.out.print(kArr[kArr.length-1]+kArr[kArr.length-2]+kArr[kArr.length-3] + " ");
	}

}
