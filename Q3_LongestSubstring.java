package Solution;

import java.util.HashMap;

public class Q3_LongestSubstring {
    // put index value in the map values, instead of keeping count in values, make it easier to slide windows
    public int lengthOfLongestSubString(String s){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        int ans=0,i=0;
        
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);
            }
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }   

    // below solution accepted, but slow:
    // public int lengthOfLongestSubstring(String s) {
    //     int max=0;
    //     HashMap<Character, Integer> map=new HashMap<Character,Integer>();
        
    //     for(int i=0;i<s.length();i++){
    //         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    //         for(int j=i+1;j<s.length();j++){
    //             map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
    //             if(map.get(s.charAt(j))>1){
    //                 if(max<map.size()){
    //                     max=map.size();
    //                 }
    //                 map.clear();
    //                 break;
    //             }
    //         }
    //     }
    //     if(map.size()>max){max=map.size();}
    //     return max;
    // }

    // below solution doesn't pass 'dfdv' type of test case (expect: 3, return: 2):
    // public int lengthOfLongestSubstring(String s) {
    //     int count=0;
    //     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
    //     for(int i=0;i<s.length();i++){
    //         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
    //         if(map.get(s.charAt(i))>1){
    //             if(count<map.size()){
    //                 count=map.size();
    //                 map.clear();
    //             }
    //         }
    //         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    //     }
    //     if(map.size()>count){count=map.size();}        
    //     return count;
    // }
}