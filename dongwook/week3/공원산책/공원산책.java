package Study_codingtest.dongwook.week2;

import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;
        int parkHeight = park.length;
        int parkWidth = park[0].length();

        for (int i = 0; i < parkHeight; i++) {
            for (int j = 0; j < parkWidth; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        int x = startX;
        int y = startY;

        for (String route : routes) {
            char direction = route.charAt(0);
            int steps = Integer.parseInt(route.substring(2));

            int newX = x;
            int newY = y;

            boolean validMove = true;
            for (int i = 1; i <= steps; i++) {
                switch (direction) {
                    case 'N':
                        newX--;
                        break;
                    case 'S':
                        newX++;
                        break;
                    case 'W':
                        newY--;
                        break;
                    case 'E':
                        newY++;
                        break;
                }

                if (newX < 0 || newX >= parkHeight || newY < 0 || newY >= parkWidth || park[newX].charAt(newY) == 'X') {
                    validMove = false;
                    break;
                }
            }

            if (validMove) {
                x = newX;
                y = newY;
            }
        }

        return new int[]{x, y};

    }
}