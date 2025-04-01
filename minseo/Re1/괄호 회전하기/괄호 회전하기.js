function solution(s) {
    let cnt = 0;
    
    for(let i = 0; i < s.length; i++){
        let tmp = s
        while (tmp.includes("()") || tmp.includes("[]") || tmp.includes("{}"))
            tmp = tmp.replace(/\(\)|\[\]|\{\}/g, "")
        if(tmp === "") cnt++
        s = s.slice(1) + s[0]
    }
    return cnt
}
