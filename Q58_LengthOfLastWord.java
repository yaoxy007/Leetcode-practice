package Solution;

public class Q58_LengthOfLastWord {
    //neater way:
    public int lengthOfLastWord(String s) {
        s = s.trim();  // trim the trailing spaces in the string
        return s.length() - s.lastIndexOf(" ") - 1;
    }

//    my approach
//    public int lengthOfLastWord(String s) {
//        s=s.trim();
//        if(s.length()==0 || s.equals(null) || s.equals(" ")){
//            return 0;
//        }
//        String[] ss = s.split(" ");
//
//        String last=ss[ss.length-1];
//
//        int count=0;
//        for(char c:last.toCharArray()){
//            count++;
//        }
//        return count;
//    }
}
