import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int [][] cakeList = new int [n][2];

		for(int i = 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			cakeList[i][0] = num;
			cakeList[i][1] = num % 10 ;
		}

		Arrays.sort(cakeList, new Comparator<int[]>() {
			@Override
			public int compare(int [] o1, int[] o2) {
				return o1[0]-o2[0]; 
			}
		});

		int index =0 ; 
		int answer = 0 ;

		while (index < n && m > 0) {
			int num = cakeList[index][0]; 
			int remainder = cakeList[index][1];
			index++;

			if (num < 10) continue; 

			int pieces = num / 10; 
			int cutsNeeded = pieces - 1; 

			if (remainder == 0) {
				if (m >= cutsNeeded) { 
					answer += pieces;
					m -= cutsNeeded;
				} else { 
					answer += m;
					m = 0;
				}
			}
		}

		index = 0;
		while (index < n && m > 0) {
			int num = cakeList[index][0];
			int remainder = cakeList[index][1];
			index++;

			if (num < 10 || remainder == 0) continue; 

			int pieces = num / 10;
			int cutsNeeded = pieces; 

			if (m >= cutsNeeded) { 
				answer += pieces;
				m -= cutsNeeded;
			} else {
				answer += m;
				m = 0;
			}
		}

		System.out.println(answer);
	}

}
