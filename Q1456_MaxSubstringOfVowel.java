package Solution;

public class Q1456_MaxSubstringOfVowel {

    public int maxVowels(String s, int k) {
        int max=0;
        for(int i=0;i<k;i++){
            if(check(s.charAt(i)))max++;
        }
        int tmp=max;

        for(int i=k;i<s.length();i++){
            if(check(s.charAt(i))){
                tmp++;
            }
            if(check(s.charAt(i-k))){
                tmp--;
            }
            max=Math.max(tmp,max);
        }
        return max;
    }

    private boolean check(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
//    stupid solution:
//    public int maxVowels(String s, int k) {
//        int max=0;
//        for(int i=0;i<s.length()-k+1;i++){
//            if(s.substring(i,i+k).contains("a") || s.substring(i,i+k).contains("e") || s.substring(i,i+k).contains("i")||s.substring(i,i+k).contains("o")||s.substring(i,i+k).contains("u")){
//                int tmp=count(s.substring(i,i+k));
//                if(tmp>max){
//                    max=tmp;
//                }
//            }
//
//        }
//        return max;
//    }
//
//    private int count(String ss){
//        int count=0;
//        for(int i=0;i<ss.length();i++){
//            if(ss.charAt(i)=='a' || ss.charAt(i)=='e'|| ss.charAt(i)=='i'||ss.charAt(i)=='o'||ss.charAt(i)=='u'){
//                count++;
//            }
//        }
//        return count;
//    }
}
