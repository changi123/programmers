function solution(my_string, n) {
    var answer = '';
    
    for(var i = my_string.length - n ; i < my_string.length; i++){
        answer+=my_string[i];
    }
    return answer;
}