import java.io.*;
import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        for(int i = 0; i<musicinfos.length; i++) {
            String[] music = new String[4];
            music = musicinfos[i].split(",");
            
            //재생된 시간 구하기
            String[] clock = new String[2];
            clock = music[0].split(":");
            int hour1 = Integer.parseInt(clock[0]);
            int min1 = Integer.parseInt(clock[1]);
            int clock1 = hour1*60 + min1;
            
            clock = new String[2];
            clock = music[1].split(":");
            int hour2 = Integer.parseInt(clock[0]);
            int min2 = Integer.parseInt(clock[1]);
            int clock2 = hour2*60 + min2;
            
            int playTime = clock2 - clock1;
            
            int index = 0;
            String musicSheet = convertMelody(music[3]);
            StringBuilder fullMelody = new StringBuilder();
            for(int j = 0; j<playTime; j++) {
                index = index % musicSheet.length();
                fullMelody.append(musicSheet.charAt(index++));
            }
            
            String M = convertMelody(m); //찾을 멜로디
            
            if (fullMelody.toString().contains(M)) {
                list.add(new AbstractMap.SimpleEntry<>(music[2], playTime));
            }
            
        }
        if(list.isEmpty()) {
            return "(None)";
        }
        else {
            String result = "";
            int maxTime = 0;

            for(int i = 0; i<list.size(); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                if(entry.getValue() > maxTime) {
                    result = entry.getKey();
                    maxTime = entry.getValue();
                }
            }
            return result;
        }
    }
    public String convertMelody(String melody) {
        return melody.replace("C#", "c")
                     .replace("D#", "d")
                     .replace("F#", "f")
                     .replace("G#", "g")
                     .replace("A#", "a")
                     .replace("B#", "b"); //추가 ㅠㅠ
    }
}
출처: https://llhyun.tistory.com/entry/JAVA-level-2-3차-17683-방금그곡 [ID llhyun:티스토리]
