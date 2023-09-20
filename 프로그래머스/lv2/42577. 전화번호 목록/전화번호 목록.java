import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
 boolean answer = true;
    // 전화번호 배열을 정렬합니다.
    Arrays.sort(phone_book);

    // 인접한 두 번호만을 비교하면 됩니다.
    for (int i = 0; i < phone_book.length - 1; i++) {
        String current = phone_book[i];
        String next = phone_book[i + 1];
        
        // 다음 번호가 현재 번호로 시작하면 false를 반환합니다.
        if (next.startsWith(current)) {
            return false;
        }
    }
    
    return answer;
    }
}