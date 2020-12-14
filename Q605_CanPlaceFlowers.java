package Solution;

public class Q605_CanPlaceFlowers {

    //run time should be O(n/2) with following solution. beats 100%
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int start = 0;

        while(start<flowerbed.length){
            if(flowerbed[start] == 1){
                start=start+2;
            }else{
                if(start == flowerbed.length-1 || flowerbed[start+1] == 0 ){
                    n--;
                    start = start+2;
                }else if(flowerbed[start+1] == 1){
                    start++;
                }
            }

            if(n <= 0){
                return true;
            }
        }
        return false;
    }
}
