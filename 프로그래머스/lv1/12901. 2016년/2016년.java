import java.util.*;
class Solution {
    public String solution(int a, int b) {
       String answer = "";
        String [] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Date today = new Date(2016-1900,a-1,b);
        int to_day = today.getDay();
        answer = week[to_day];
        return answer;
    }
}