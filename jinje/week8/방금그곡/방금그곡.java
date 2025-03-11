package week8;

public class song {
	public static String solution(String m, String[] musicinfos) {
		String answer = "(None)";
		m = convert(m);
		int maxtime = 0;
		int flag = Integer.MAX_VALUE;
		
		for (int i = 0; i < musicinfos.length; i++) {
            String[] parts = musicinfos[i].split(",");
            int playTime = getplaytime(parts[0], parts[1]);
            String title = parts[2];
            String melody = convert(parts[3]);
            
            String fullMelody = fullmelody(melody, playTime);
            
            if (fullMelody.contains(m)) {
                if (playTime > maxtime || (playTime == maxtime && i < flag)) {
                    answer = title;
                    maxtime = playTime;
                    flag = i;
                }
            }
        }
        return answer;
	}
	
	private static String fullmelody(String melody, int playtime) {
		StringBuilder fullMelody = new StringBuilder();
        for (int i = 0; i < playtime; i++) {
            fullMelody.append(melody.charAt(i % melody.length()));
        }
        return fullMelody.toString();
	}
	
	private static int getplaytime(String start, String end) {
		String[] starttime = start.split(":");
		String[] endtime = end.split(":");
		int time = (Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0])) * 60 + (Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]));
		return time;
	}
	
	private static String convert(String m) {
		return m.replace("C#", "c")
				.replace("D#", "d")
				.replace("F#", "f")
				.replace("G#", "g")
				.replace("A#", "a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "CC#BCC#BCC#BCC#B";
		String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		System.out.println(solution(m, musicinfos));
	}
}
