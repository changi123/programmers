import java.util.*;
import java.io.*;


class Solution {
    public int solution(int n, int m, int[] section) {
		int answer = 0;
		int com = 0;	
		for(int i= 0;i<section.length;i++) {
			
			if(section[i] >= com) {
				com = section[i] + m;
				answer++;
			}
		}
		return answer;
    }
}