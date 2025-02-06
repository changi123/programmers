function solution(n) {
    var answer = '';
    var arr = n.toString().split("");
    
    arr.sort( (a,b) => b-a);
    for(var i = 0 ; i < arr.length ; i++ ){
        answer+=arr[i];
    }
  
    return parseInt(answer);
}