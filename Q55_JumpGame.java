package Solution;

public class Q55_JumpGame {
    //greedy:
    public boolean canJump(int[] nums) {
        int position=nums.length-1;

        for(int i= nums.length-1;i>=0;i--){
            if(i+nums[i]>=position){
                position = i;
            }
        }
        return position == 0;
    }

//    Backtracking method, all possible jumps, time limit exceeded:
//    public boolean canJump(int[] nums) {
//        return getPos(0,nums);
//    }
//
//    private boolean getPos(int position,int[] nums){
//        if(position==nums.length-1){
//            return true;
//        }
//        int jump=position+nums[position];
//        for(int i=position+1;i<=jump;i++){
//            if(getPos(i,nums)){
//                return true;
//            }
//        }
//        return false;
//    }

}
