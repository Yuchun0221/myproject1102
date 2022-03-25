package com.yu.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Hank", "Jack", "Vivi", "Lynna"};
        int[] maths = {90, 52, 60, 75};
        int[] english = {65, 80, 52, 60};
        for (int i = 0; i < 4; i++) {
            if (i != 3) {
                System.out.println(names[i] + "  " + maths[i] + "  " + english[i] + "  " + (maths[i] + english[i]) / 2);
            }
        }
    }
}