package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_LetterCombOfPhoneNumber {
    private Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    private ArrayList<String> ans=new ArrayList<>();

    public void backtrack(String comb,String input){
        if(input.isEmpty()){
            ans.add(comb);
        }else{
            String tmp=input.substring(0,1);

            String s=phone.get(tmp);
            for(int i=0;i<s.length();i++){
                String letter=s.substring(i,i+1);
                backtrack(comb+letter,input.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()!=-0){
            backtrack("",digits);
        }
        return ans;
    }
}
