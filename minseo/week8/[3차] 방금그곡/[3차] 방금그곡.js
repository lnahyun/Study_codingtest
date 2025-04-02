function solution(m, musicinfos) {
    // #이 붙은 음을 소문자 한 글자로 치환
    function replaceStr(str) {
        return str
            .replace(/C#/g, 'c')
            .replace(/D#/g, 'd')
            .replace(/F#/g, 'f')
            .replace(/G#/g, 'g')
            .replace(/B#/g, 'b')
            .replace(/A#/g, 'a');
    }

    // 기억한 멜로디도 변환
    m = replaceStr(m);

    let answer = "(None)";
    let maxTime = 0;

    for (let i = 0; i < musicinfos.length; i++) {
        const [start, end, title, melody] = musicinfos[i].split(",");

        // 재생시간 (끝나는 시간 - 시작시간)
        const [startH, startM] = start.split(":").map(Number);
        const [endH, endM] = end.split(":").map(Number);
        const playTime = (endH * 60 + endM) - (startH * 60 + startM);

        
        const newMelody = replaceStr(melody);

        // 재생된 멜로디 생성
        let playMelody = "";
        if (playTime > newMelody.length) {
            playMelody = newMelody.repeat(Math.ceil(playTime / newMelody.length)).slice(0, playTime);
        } else {
            playMelody = newMelody.slice(0, playTime);
        }
        
        if (playMelody.includes(m)) {
            // 이미 찾은 곡  > 재생시간일 때 다시 갱신
            if (playTime > maxTime) {
                maxTime = playTime;
                answer = title;
            }
        }
    }

    return answer;
}
