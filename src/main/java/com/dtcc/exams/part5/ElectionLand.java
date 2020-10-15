package com.dtcc.exams.part5;

import java.util.Map;
import java.util.TreeMap;

public class ElectionLand {

    public static Map<String, Integer> result;

    public ElectionLand() {
        result = new TreeMap<>();
    }

    public static String electionWinner(String[] votes) {
        int totalNum = 0;
        String winner = null;

        for (String person : votes) {
            if (result.keySet().contains(person)) {
                result.replace(person, result.get(person) + 1);
            } else
                result.put(person, 1);
        }

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= totalNum){
                totalNum = value;
                winner = key;
            }
//            else if(value == totalNum && winner.compareTo(key) > 0)
//                winner = key;
        }
        return winner;
    }
}
