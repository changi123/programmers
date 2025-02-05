function solution(n)
{
    var answer = 0;
    
    var arr = n.toString().split("");

    for(var i = 0 ; i < arr.length ; i++){
        answer+= parseInt(arr[i]);
    }
    
    return answer;
}