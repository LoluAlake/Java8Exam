package com.dtcc.exams.part6;

public class LoveLetter {
    public Integer[] mystery(String[] input) {
        int len = input.length;
        Integer[] letter = new Integer[input.length];

        for(int i = 0; i < len; i++) {
            String str = input[i];
            int count = 0;

            int j = 0;
            int charLen = str.length() -1;

            while (j < charLen) {
                count += Math.abs(str.charAt(j) - str.charAt(charLen));
                j++;
                charLen--;
            }
            letter[i] = count;
        }
        return letter;
    }
}
