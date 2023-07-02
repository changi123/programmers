import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        ArrayList list = new ArrayList();
      
        list.add(arr[0]);
        
        int i =0;
        int j= 1;
        int check = 0;
        while(j<arr.length) {
        	check = arr[i];
        	if(check != arr[j]) {
        		list.add(arr[j]);
        		i++;
        		j++;
        	} else {
        		i++;
        		j++;
        		continue;
        	}
        	
        }
        
        int[] answer = new int [list.size()];
        for(int k= 0; k<answer.length; k++) {
        	answer[k] = (int) list.get(k);
        }
        
        
        
        return answer;
    }
}