function solution(num_str) {
    var arr = num_str.split("");
    var sum = 0 ;
    for(var i = 0 ; i < arr.length ; i++ ){
        sum+= parseInt(arr[i]);        
    }
    return sum;
}