package com.evaitcs.notes;

public class leaderbord {

    public void resultscore() {

        int ranked1[] = {100, 100, 50, 40, 40, 20, 10};
        int player1[] = {5, 25, 50, 120};
        int result1[] = {};
        for (int i = 0; i < ranked1.length; i++) {
            if (ranked1[i] != ranked1[i + 1]) {
                if (ranked1[i] > player1[i]) {
                    result1[i] = ranked1[i + 1];
                } else {
                    ranked1[i]++;
                }
            }

        }

    }
    // public class Main {
        public static void main (String[] args){
            leaderbord leader = new leaderbord();
            leader.resultscore();
        }
}
//}
