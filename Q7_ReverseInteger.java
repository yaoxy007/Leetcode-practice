package Solution;

public class Q7_ReverseInteger {
    
    // using String and build-in methods to manipulate the pattern:
    // public int reverse(int x) {
    //     int y=Math.abs(x);
    //     String s=Integer.toString(y);
    //     StringBuilder sb=new StringBuilder(s);
    //     sb.reverse();
    //     int ans=0;
    //     try{
    //         ans=Integer.parseInt(sb.toString());
    //     }catch (NumberFormatException e){
    //         ans=0;
    //     }
    //     if(x<0){
    //         return -ans;
    //     }else{
    //         return ans;
    //     }
    // }

    public int reverse(int x) {
        int result=0;
        while(x!=0){
            int digit=x%10;
            x=x/10;
            if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10 ||(result==Integer.MIN_VALUE/10 && digit<-8)){
                return 0;
            }
            result = result*10+digit;
        }
        return result;
    }
}