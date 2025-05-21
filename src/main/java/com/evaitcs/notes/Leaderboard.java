package com.evaitcs.notes;


import java.util.*;

public class Leaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();
        int rInd = 0;
        int place = 0;

        for (int i = player.size() - 1; i >= 0; i--) {
            int oldRanked = -1;
            while (rInd < ranked.size() && ranked.get(rInd) > player.get(i)) {
                if (oldRanked != ranked.get(rInd)) {
                    place++;
                }
                oldRanked = ranked.get(rInd);
                rInd++;
            }

           //result.add(place);
           // result.add(place + 1);
           result.add(0, place + 1);
         //   result.add(rInd);
        }

        return result;
    }

public static List<Integer>secondresult(List<Integer> ranked, List<Integer> player){
        List<Integer> result = new ArrayList<>();
        int rInd = 0;
        int place = 0;

        for (int i = player.size() - 1; i >= 0; i--) {
            int oldRanked = -1;
            while (rInd < ranked.size() && ranked.get(rInd) > player.get(i)) {
                if (oldRanked != ranked.get(rInd)) {
                    place++;
                }
                oldRanked = ranked.get(rInd);
                rInd++;
            }

           // result.add(place);
            result.add(place + 1);
            // result.add(0, place + 1);
            //   result.add(rInd);
        }

        return result;




}
    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);

        System.out.println(climbingLeaderboard(ranked, player));
        System.out.println(secondresult(ranked, player));
    }
}
