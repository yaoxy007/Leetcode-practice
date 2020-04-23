package Solution;

public class Q14_LongestCommonPrefix {
//    this problem can be solved by many other advanced methods. need to revisit

    public String longestCommonPrefix(String[] strs) {
        // Vertical comparison
        if(strs==null || strs.length==0){
            return "";
        }

        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
