#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

// cards1_len은 배열 cards1의 길이입니다.
// cards2_len은 배열 cards2의 길이입니다.
// goal_len은 배열 goal의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int ft_strcmp(char* s1, char* s2)
{
    int i = 0;
    while (s1[i] && s2[i])
    {
        if (s1[i] != s2[i])
            return 1;
        i++;
    }
    if (s1[i] || s2[i])
        return 1;
    return 0;
}

char* solution(char* cards1[], size_t cards1_len, char* cards2[], size_t cards2_len, char* goal[], size_t goal_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    
    int flag = 1;
    int len = 0;
    int i = 0, j = 0;
    while (len < goal_len && (i < cards1_len || j < cards2_len))
    {
        flag = 1;
        //printf("card1:%s\ncard2:%s\ngoal:%s\n", cards1[i], cards2[j], goal[len]);
        if (i < cards1_len && ft_strcmp(cards1[i], goal[len]) == 0) {
            flag = 0;
            len++;
            i++;
        }  
        else if (j < cards2_len && ft_strcmp(cards2[j], goal[len]) == 0) {
            flag = 0;
            len++;
            j++;
        }
        if (flag)
        {
            if (i < cards1_len)
                i++;
            if (j < cards2_len)
                j++;
        }
        //printf("i : %d\nj : %d\nlen : %d\n", i, j, len);
    }

    if (len == goal_len)
    {
        //printf("here1\n");
        char* answer = (char*)malloc(4);
        answer[0] = 'Y';
        answer[1] = 'e';
        answer[2] = 's';
        answer[3] = '\0';
        return answer;
    }
    else
    {
        //printf("here2\n");
        char* answer = (char*)malloc(3);
        answer[0] = 'N';
        answer[1] = 'o';
        answer[2] = '\0';
        return answer;
    }
}

int main()
{
    char* cards1[] = {"i", "water", "drink"};
    char* cards2[] = {"want", "to"};
    char* goal[] = {"i", "want", "to", "drink", "water"};

    char* answer = solution(cards1, 3, cards2, 2, goal, 5);
    printf("answer : %s\n", answer);

    return 0;
}
