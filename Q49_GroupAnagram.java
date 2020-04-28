package Solution;

import java.util.*;

public class Q49_GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group=new HashMap<>();

        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            if(!group.containsKey(key)){
                group.put(key,new ArrayList<String>());
            }
            group.get(key).add(s);
        }
        return new ArrayList(group.values());
    }


    //brutal force approach, but can't pass test case ["",""], expected answer is [["",""]], why treat null String differently?
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<HashMap<Character,Integer>> count=new ArrayList<>();
//
//        Set<List<String>> ans=new HashSet<>();
//
//        for(String s:strs){
//            HashMap<Character,Integer> tmp=new HashMap<>();
//            for(int i=0;i<s.length();i++){
//                tmp.put(s.charAt(i),tmp.getOrDefault(s.charAt(i),0)+1);
//            }
//            count.add(tmp);
//        }
//
//        for(int j=0;j<strs.length;j++){
//            Set<String> list=new HashSet();
//
//            for(int k=0;k<strs.length;k++){
//                if(count.get(j).equals(count.get(k))){
//                    list.add(strs[k]);
//                }
//            }
//            List<String> l=new ArrayList(list);
//            ans.add(l);
//        }
//        return new ArrayList(ans);
//    }
}
