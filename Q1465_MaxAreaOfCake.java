package Solution;

import java.util.Arrays;

public class Q1465_MaxAreaOfCake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // int max=0;

        if(horizontalCuts == null && verticalCuts == null) return 0;

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hLen=horizontalCuts.length;
        int maxheight=0;
        int vLen=verticalCuts.length;
        int maxwidth=0;

        for(int i=hLen-1;i>0;i--){
            if(maxheight<horizontalCuts[i]-horizontalCuts[i-1]){
                maxheight=horizontalCuts[i]-horizontalCuts[i-1];
            }
        }
        maxheight= Math.max(maxheight, (h - horizontalCuts[hLen - 1]));
        maxheight= Math.max(maxheight, (horizontalCuts[0]));

        for(int i=vLen-1;i>0;i--){
            if(maxwidth<verticalCuts[i]-verticalCuts[i-1]){
                maxwidth=verticalCuts[i]-verticalCuts[i-1];
            }
        }
        maxwidth= Math.max(maxwidth, (w - verticalCuts[vLen - 1]));
        maxwidth= Math.max(maxwidth, (verticalCuts[0]));

        System.out.println(maxheight);
        System.out.println(maxwidth);
        return maxheight*maxwidth;

//         ArrayList<Integer> heights=new ArrayList<>();
//         heights.add(h-horizontalCuts[horizontalCuts.length-1]);
//         for(int i=horizontalCuts.length-1;i>0;i--){
//             heights.add(horizontalCuts[i]-horizontalCuts[i-1]);
//         }
//         heights.add(horizontalCuts[0]-0);

//         ArrayList<Integer> width = new ArrayList<>();
//         width.add(w-verticalCuts[verticalCuts.length-1]);
//         for(int i=verticalCuts.length-1;i>0;i--){
//             width.add(verticalCuts[i]-verticalCuts[i-1]);
//         }
//         width.add(verticalCuts[0]-0);

//         for(int i=0;i<heights.size();i++){
//             // System.out.println("h is:"+heights.get(i));
//             for(int j=0;j<width.size();j++){
//                 // System.out.println("w is:"+width.get(j));
//                 if(max<heights.get(i)*width.get(j)){
//                     max=heights.get(i)*width.get(j);
//                 }
//             }
//         }
        // return max;
    }
}
