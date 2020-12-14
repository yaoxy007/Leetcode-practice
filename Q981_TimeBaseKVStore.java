package Solution;

import java.util.*;
import javafx.util.*;

public class Q981_TimeBaseKVStore {
    Map<String,List<Pair<Integer,String>>> data;
    /** Initialize your data structure here. */
    public Q981_TimeBaseKVStore() {
        data= new Map<String, List<Pair<Integer, String>>>();
    }

    public void set(String key, String value, int timestamp) {
        if(!data.containsKey(key)){
            data.put(key,new ArrayList<Pair<Integer,String>>());
        }
        data.get(key).add(new Pair(timestamp,value));
    }

    public String get(String key, int timestamp) {
        if(!data.containsKey(key)){
            return "";
        }
        List<Pair<Integer,String>> holder = data.get(key);

        int i= Collections.binarySearch(holder,new Pair<Integer,String>(timestamp,""),(a, b) -> Integer.compare(a.getKey(),b.getKey()));


        if(i>=0) return holder.get(i).getValue();
        else if(i==-1) return "";
        else return holder.get(-i-2).getValue();
    }
}
