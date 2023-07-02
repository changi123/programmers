
import java.util.*;
import java.io.*;


class Solution {
    public int solution(int n) {
		double answer = 0;

		ArrayList list = new ArrayList();



		int sh = n/3;	
		int re = n%3;		
		list.add(re);

		while(sh>0) {
			re = sh%3;
			sh = sh/3;
			list.add(re);
		}

		
		Collections.reverse(list);
		
		int [] m = new int[list.size()];

		for(int i= 0; i<m.length;i++) {
			m[i] = (int) list.get(i);

		}
		
		for(int i=0; i<m.length;i++) {

			if(m[i] != 0 && i == 0) {
				answer+= m[i];
				continue;
			}
			
			answer+= m[i]*Math.pow(3, i);
		}

		


		return (int) answer;


    }
}