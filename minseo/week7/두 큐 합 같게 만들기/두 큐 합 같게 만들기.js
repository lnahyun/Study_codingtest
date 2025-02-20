function solution(queue1, queue2) {
    let queue = [...queue1, ...queue2]
    let cnt = 0;
    let Queue1 = queue1.reduce((pre, num) => pre + num, 0),
        Queue2 = queue2.reduce((pre, num) => pre + num, 0);
    let idx1 = 0, idx2 = queue2.length;
    let len = queue1.length + queue2.length
    let temp;

    if ((Queue1 + Queue2) % 2 != 0)
        return -1

    while(cnt <= len * 3) {
        if (Queue1 === Queue2)
            return cnt;

        if(Queue1 > Queue2){
            temp = queue[idx1];
            idx1 = (idx1 + 1) % len;
            Queue1 -= temp; 
            Queue2 += temp;
            cnt++;
        }
        if(Queue1 < Queue2){
            temp = queue[idx2];
            idx2 = (idx2 + 1) % len;
            Queue1 += temp; 
            Queue2 -= temp;
            cnt ++;
        }

        if (cnt === len * 3)
            break ;
    }
    return -1;
    
}
