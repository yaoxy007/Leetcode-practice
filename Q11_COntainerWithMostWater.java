package Solution;

public class Q11_COntainerWithMostWater {

//    two pointer approach,O(n) time, O(1) speed
    public int maxArea(int[] height) {
        int maxArea=0;
        int i=0;
        int j=height.length-1;
        while(i!=j){
            int tempArea=Math.min(height[i],height[j])*(j-i);
            if(tempArea>maxArea){
                maxArea=tempArea;
            }
            if(height[i]<height[j]){
                i++;
            } else{
                j--;
            }
        }
        return maxArea;
    }
//    brutal force solution:
//    public int maxArea(int[] height) {
//        int max=0;
//
//        for(int i=0;i<height.length;i++){
//            for(int j=0;j<height.length;j++){
//                int tempArea=Math.min(height[i],height[j])*(j-i);
//                if(tempArea>max){
//                    max=tempArea;
//                }
//            }
//        }
//        return max;
//    }

}
