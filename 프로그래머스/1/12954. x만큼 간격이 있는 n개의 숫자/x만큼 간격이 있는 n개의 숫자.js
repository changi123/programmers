function solution(x, n) {
    var answer = new Array(n);
    answer[0] = x ;
    var sum = x ; 
    for(var i = 1 ; i < n ; i++){
        answer[i] = answer[i-1] + sum ; 
    }
    
    return answer;
}