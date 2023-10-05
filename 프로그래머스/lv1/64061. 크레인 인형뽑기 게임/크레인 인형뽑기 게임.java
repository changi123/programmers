import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
  int answer = 0;
        
        
//        for(int i= 0; i  < board.length;i++) {
//        	
//        	for(int j = 0 ; j <board[i].length;j++) {
//        		System.out.print(board[i][j]);
//        	}
//        	System.out.println();
//        }
        
        
        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> list2 = new ArrayList<Integer>();
        
        
//        int index = 0 ;
        for(int i= 0; i <moves.length;i++) {
        	
        	int 뽑기 = moves[i]-1;
        	
        	뽑기 :for(int j = 0; j <board.length;j++) {
        		
        		for(int k = 0 ; k <board[j].length;k++) {
        
        			if(k == 뽑기 && board[j][k] !=0) {
        				list.add(board[j][k]);
        			
        				if(list.size()>=2 && list.get(list.size()-1) == list.get(list.size()-2)) {
        					answer++;
        					list.remove(list.size()-1);
        					list.remove(list.size()-1);  					
        				}
//        				list2.add(board[j][k]);
        				board[j][k] = 0 ;
        				break 뽑기;
        			}
        		}
        
     
        	}
        	
        }
        
        
//      for(int i= 0; i  < board.length;i++) {
//    	
//    	for(int j = 0 ; j <board[i].length;j++) {
//    		System.out.print(board[i][j]);
//    	}
//    	System.out.println();
//    }
    
//      System.out.println(list2);
     
        return answer*2;
    }
}