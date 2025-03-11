function solution(n, k) {
    let N = n.toString(k);
    let answer = N.split('0');
    let cnt = 0;
    
    for(let i = 0; i< answer.length; i++){
        let num = answer[i];
        if(isPrime(Number(num)))
            cnt++;
    }
   
    return cnt;
}

function isPrime(num){
    if(num === 2) return true;
    if(num < 2) return false;
    if(num % 2 === 0) return false;
    
    let sqrt = Math.sqrt(num); // 제곱근 계산
    for (let i = 3; i <= sqrt; i += 2) {
        if (num % i === 0) return false;
    }
    return true;
}
