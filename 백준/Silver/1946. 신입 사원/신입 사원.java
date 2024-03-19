import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.next()); // 테스크 케이스 수

		for(int i = 0 ; i < T ; i++) {

			int N = Integer.parseInt(sc.next()); // 지원자 수
			int [][] arr = new int [N][2];
			for(int j= 0 ; j < N ; j++) {				
				int grade = Integer.parseInt(sc.next()); // 성적
				int rank = Integer.parseInt(sc.next()); // 순위

				arr[j][0] = grade;
				arr[j][1] = rank;


			}

			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}

			});


			int cnt = 0;
			int max = arr[0][1];
			for(int j = 0 ; j <N ; j++) {
					if( max<arr[j][1]) {
						cnt++;
						continue;
					}
					max = arr[j][1];

			}
			System.out.println(N-cnt);
		}
	}

}
