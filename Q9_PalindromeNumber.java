package Solution;

public class Q9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0;
        int input=x;
        while(x>0){
            int digit=x%10;
            x=x/10;
            if(reverse<Integer.MAX_VALUE || !(reverse==Integer.MAX_VALUE && digit>7)){
                reverse=reverse*10+digit;
            }else{
                return false;
            }

        }
        return input==reverse;
    }
}
