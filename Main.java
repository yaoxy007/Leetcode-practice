package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] a=new Integer[]{2,5,1,2,3,4};
        Arrays.sort(a);
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}