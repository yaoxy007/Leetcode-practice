package Solution;

public class Q1071_GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        while(str1.length() >= str2.length()){
            if(!(str1.substring(0,str2.length())).equals(str2)){
                return "";
            }

            str1 = str1.substring(str2.length(), str1.length());

            if(str1.length()<1){
                return str2;
            }
        }
        return gcdOfStrings(str2, str1);
    }

}
