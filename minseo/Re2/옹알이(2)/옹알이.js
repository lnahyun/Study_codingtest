function solution(babbling) {
    const answer = ['aya','ye','woo','ma'];
    let cnt = 0;
    
    for(let i = 0; i < babbling.length; i++){
        let babbling2 = babbling[i];
        
        for(let j = 0; j < answer.length; j++){
            if(babbling2.includes(answer[j].repeat(2))){
                break
            }
            babbling2 = babbling2.split(answer[j]).join(" ");
        }
        
        if(babbling2.split(" ").join("").length === 0){
            cnt++
        }
    }
    
    return cnt
}
