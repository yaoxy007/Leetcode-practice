package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q1366_RankTeamsByVotes {
    public String rankTeams(String[] votes) {
        int numOfTeams = votes[0].length();

        if(votes.length==1){
            return votes[0];
        }

        //put all votings into a form of hashmaps:
        //for example: [abc,acb,cba] would result in:
        // Team : rating(No1,No2,No3)
        // 'a' : 2,0,1
        // 'b' : 0,2,1
        // 'c' : 1,1,1
        //     ...
        Map<Character,int[]> scoreBoard = new HashMap();

        for(String vote:votes){
            for(int i=0;i<vote.length();i++){
                char team = vote.charAt(i);

                if(!scoreBoard.containsKey(team)){
                    scoreBoard.put(team,new int[vote.length()]);
                }
                int[] scores = scoreBoard.get(team);

                scores[i]++;
                scoreBoard.put(team,scores);
            }
        }

        PriorityQueue<Pair<Character,int[]>> q = new PriorityQueue<>(new Comparator<Pair<Character,int[]>>(){
            @Override
            public int compare(Pair<Character,int[]> o1, Pair<Character,int[]> o2){
                int[] o1Values = o1.getValue();
                int[] o2Values = o2.getValue();
                for(int i=0;i<o1Values.length;i++){
                    if(o1Values[i] != o2Values[i]){
                        return o2Values[i] - o1Values[i];
                    }
                }

                return o1.getKey() - o2.getKey();
            }
        });

        for(Character key:scoreBoard.keySet()){
            q.add(new Pair(key,scoreBoard.get(key)));
        }

        StringBuilder ans = new StringBuilder();
        while(!q.isEmpty()){
            ans.append(q.remove().getKey());
        }
        return ans.toString();

    }

}
