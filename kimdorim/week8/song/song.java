public class song {
    class Solution {
        // #이 포함된 음을 변환하는 함수
        private String convertSharpNotes(String melody) {
            return melody.replace("C#", "c")
                    .replace("D#", "d")
                    .replace("F#", "f")
                    .replace("B#", "b")
                    .replace("G#", "g")
                    .replace("A#", "a");
        }

        // HH:MM 형식의 시간을 분 단위로 변환
        private int getPlayTime(String start, String end) {
            String[] startSplit = start.split(":");
            String[] endSplit = end.split(":");

            int startMinutes = Integer.parseInt(startSplit[0]) * 60 + Integer.parseInt(startSplit[1]);
            int endMinutes = Integer.parseInt(endSplit[0]) * 60 + Integer.parseInt(endSplit[1]);

            return endMinutes - startMinutes;
        }

        // 재생된 멜로디 생성
        private String getFullMelody(String melody, int playTime) {
            StringBuilder fullMelody = new StringBuilder();
            int melodyLength = melody.length();

            for (int i = 0; i < playTime; i++) {
                fullMelody.append(melody.charAt(i % melodyLength));
            }
            return fullMelody.toString();
        }

        public String solution(String m, String[] musicinfos) {
            m = convertSharpNotes(m);
            String answer = "(None)";
            int maxTime = 0;

            for (String info : musicinfos) {
                String[] details = info.split(",");
                String start = details[0], end = details[1], title = details[2], melody = details[3];

                int playTime = getPlayTime(start, end);
                melody = convertSharpNotes(melody);
                String fullMelody = getFullMelody(melody, playTime);

                if (fullMelody.contains(m) && playTime > maxTime) {
                    maxTime = playTime;
                    answer = title;
                }
            }
            return answer;
        }
    }
}
