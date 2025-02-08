function solution(s) {
    var answer = new Array(s.length);
    for(var i = 0 ; i < s.length ; i++){
        var index = s.indexOf(s.charAt(i));
        if( i != index){   
            answer[i] = Math.abs(index-i);
            s = s.replace(s.charAt(index), "0");
        } else{
            answer[i] = -1;
        }
    }
    return answer;
}