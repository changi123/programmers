function solution(n) {
    var answer = 0;
    var sqrt = Math.round( Math.sqrt(parseInt(n)) , 2) ;
    
    if( Math.pow(sqrt,2) == n ){
        return Math.pow( ( sqrt+1) , 2 );
    } else{
        return -1 ; 
    }
    
    return answer;
}