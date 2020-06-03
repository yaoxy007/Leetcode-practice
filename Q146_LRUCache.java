package Solution;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q146_LRUCache {

    Map<Integer,Integer> map;
    int cap;

    public Q146_LRUCache(int capacity) {

        this.cap=capacity;
        map=new LinkedHashMap<>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return map.size() > cap;
            }
        };
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key,value);
    }

}
