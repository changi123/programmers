class Solution {
    public int solution(int[][] sizes) {
    	int answer = 0;
		
		int [] x = new int [ sizes.length];
		int [] y = new int [ sizes.length];
		for(int i= 0 ; i < sizes.length;i++) {
			int com = sizes[i][0];
			for(int j= 1 ; j<sizes[i].length;j++) {
				if(com < sizes[i][j]) {
					sizes[i][0] = sizes[i][j];
					sizes[i][j] = com;
				}
			}
			
		}

		int xmax = 0;
		for(int i= 0; i <sizes.length;i++) {
			
			if(sizes[i][0] > xmax) {
				xmax = sizes[i][0];
			}
			
		}
		
		int ymax = 0;
		for(int i= 0; i <sizes.length;i++) {
			
			if(sizes[i][1] > ymax) {
				ymax = sizes[i][1];
			}
			
		}
		
		
		answer = xmax * ymax;
		
		return answer;
    }
}