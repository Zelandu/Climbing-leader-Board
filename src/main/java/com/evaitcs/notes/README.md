import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

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
            result.add(0, place+1);
        }

        return result;
    }
}

public class Solution {
public static void main(String[] args) throws IOException {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
        String[] rankedTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ranked = new ArrayList<>();
        for (String s : rankedTemp) {
            ranked.add(Integer.parseInt(s));
        }

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
        String[] playerTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> player = new ArrayList<>();
        for (String s : playerTemp) {
            player.add(Integer.parseInt(s));
        }

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
