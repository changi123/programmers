import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> playHm = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> keyVal = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            playHm.put(genres[i], playHm.getOrDefault(genres[i], 0) + plays[i]);

            keyVal.putIfAbsent(genres[i], new HashMap<>());
            keyVal.get(genres[i]).put(i, plays[i]);
        }

        TreeMap<Integer, String> sortPlay = new TreeMap<>(Collections.reverseOrder());
        for (String s : playHm.keySet()) {
            int num = playHm.get(s);
            sortPlay.put(num, s);
        }

        HashMap<String, List<Map.Entry<Integer, Integer>>> sortedKeyVal = new HashMap<>();
        for (String genre : keyVal.keySet()) {
            List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(keyVal.get(genre).entrySet());
            entries.sort((a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return a.getKey().compareTo(b.getKey());
                } else {
                    return b.getValue().compareTo(a.getValue());
                }
            });
            sortedKeyVal.put(genre, entries);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : sortPlay.keySet()) {
            String g = sortPlay.get(num);
            List<Map.Entry<Integer, Integer>> m = sortedKeyVal.get(g);
            int cnt = 0;
            for (int i = 0; i < m.size(); i++) {
                if (cnt == 2) {
                    break;
                }
                cnt++;
                list.add(m.get(i).getKey());
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
