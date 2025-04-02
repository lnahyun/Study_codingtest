function solution(n) {
    let N = n.toString(3);
    let change = "";
    for(let i = N.length - 1; i >= 0; i--){
        change += N[i];
    }
    return parseInt(change, 3);
}
