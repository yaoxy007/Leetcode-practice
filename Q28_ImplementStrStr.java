package Solution;

public class Q28_ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        if(haystack.length()<needle.length() || !haystack.contains(needle)){
            return -1;
        }
        int l=needle.length();
        int ans=0;
        for(int i=0;i<haystack.length()-l+1;i++){
            String test=haystack.substring(i,i+l);
            if(test.equals(needle)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
