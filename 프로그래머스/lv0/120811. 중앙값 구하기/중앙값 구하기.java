import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len  =array.length;
        int index = 0;
        Arrays.sort(array);
        index =  (len-1)/2;
        
        answer = array[index];
        return answer;
    }
}