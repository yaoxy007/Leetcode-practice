package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] a=new Integer[]{2,5,1,2,3,4};

        Collections.sort(Arrays.asList(a));
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}