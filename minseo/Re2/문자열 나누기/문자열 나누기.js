function solution(s) {
    let result = 0
    let first = s[0]
    let cnt = 0
    
    for(let i = 0; i<s.length; i++){
        if(s[i] === first)
            cnt++
        else
            cnt--
        
        
        if(cnt === 0){
            result++
            first = s[i+1]
        }
    }
    if(cnt !== 0) result++
    return result
}
