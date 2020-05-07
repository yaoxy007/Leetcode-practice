package Solution;

import java.util.ArrayList;
import java.util.List;

public class Q66_PlusOne {

    //O(n) solution:
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // move along the input array starting from the end
        for (int idx = n - 1; idx >= 0; --idx) {
            // set all the nines at the end of array to zeros
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            // here we have the rightmost not-nine
            else {
                // increase this rightmost not-nine by 1
                digits[idx]++;
                // and the job is done
                return digits;
            }
        }
        // we're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
    //slow and lots of space wasted:
//    public int[] plusOne(int[] digits) {
//        List<Integer> ans=new ArrayList<Integer>();
//        int n=digits.length;
//
//        digits[n-1]=digits[n-1]+1;
//        int carry=0;
//        for(int i=digits.length-1;i>=0;i--){
//            if(digits[i]+carry==10){
//                ans.add(0);
//                carry=1;
//            }else{
//                ans.add(digits[i]+carry);
//                carry=0;
//            }
//        }
//        if(carry==1){
//            ans.add(1);
//        }
//        int[] ret=new int[ans.size()];
//        Collections.reverse(ans);
//        for(int i=0;i<ans.size();i++){
//            ret[i]=ans.get(i);
//        }
//        return ret;
//    }
}
