package Solution;

public class Q12_IntegerToRoman {
    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

//    greedy approach
    public String intToRoman(int num) {
        StringBuilder ans=new StringBuilder();
//stopping condition in for loop can have multiple conditions
        for(int i=0;i<values.length && num>=0;i++){
            while(values[i]<=num){
                num=num-values[i];
                ans.append(symbols[i]);
            }
        }
        return ans.toString();
    }

}
