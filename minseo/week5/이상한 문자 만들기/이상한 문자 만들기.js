function solution(s) {
    var words = s.split(' ');
    let result = [];
    for(let i = 0; i<words.length; i++){
        let newWord = ''; // 변환된 단어 저장용
        for(let ii = 0; ii<words[i].length; ii++){
            if( ii % 2 === 0)
                newWord += words[i][ii].toUpperCase();
            else{
                newWord += words[i][ii].toLowerCase();
            }
        }
        result.push(newWord);
    }
    return result.join(' ');
}
