function solution(X, Y) {
    let newX = X.split("");
    let newY = Y.split("");

    let countY = {};
    for (let num of newY) {
        countY[num] = (countY[num] || 0) + 1;
    }

    let common = [];
    for (let num of newX) {
        if (countY[num] > 0) {
            common.push(num);
            countY[num]--;
        }
    }

    if (common.length === 0) 
        return "-1";

    else if (common.every(num => num === "0")) { 
        return "0";
    }

    let result = common.sort((a, b) => b - a).join("");

    return result;
}
