import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());

		int [] bArr = new int[b];
		int [] cArr = new int[c];
		int [] dArr = new int[d];
		int prePrice = 0;
		int nextPrice = 0;

		for(int i= 0 ; i < b; i++) {
			int price = Integer.parseInt(sc.next());
			prePrice += price;
			bArr[i]= price;
		}
		for(int i= 0 ; i < c; i++) {
			int price = Integer.parseInt(sc.next());
			prePrice += price;
			cArr[i]= price;
		}
		for(int i= 0 ; i < d; i++) {
			int price = Integer.parseInt(sc.next());
			prePrice += price;
			dArr[i]= price;
		}
		System.out.println(prePrice);

		Arrays.sort(bArr);
		Arrays.sort(cArr);
		Arrays.sort(dArr);

		int [] lenArr = {bArr.length,cArr.length,dArr.length};

		Arrays.sort(lenArr);
		int minLen = lenArr[0];

		for(int i = 0 ; i < minLen ; i++) {
			nextPrice+= (bArr[bArr.length-1-i] + cArr[cArr.length-1-i] + dArr[dArr.length-1-i]) * 0.9;
			bArr[bArr.length-1-i]  = 0 ;
			cArr[cArr.length-1-i]  = 0 ;
			dArr[dArr.length-1-i]  = 0 ;
			
		}
		for(int i= 0 ; i < b; i++) {
			nextPrice += bArr[i];
		}
		for(int i= 0 ; i < c; i++) {
			nextPrice += cArr[i];
		}
		for(int i= 0 ; i < d; i++) {
			nextPrice += dArr[i];
		}
		
		
		
		
		System.out.println(nextPrice);

	}

}
