package map_interface.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapExample {
    public static void main(String[] args) {
    	
    	HashMap<String, Integer> map = new HashMap<>();
    	map.put("yash", 101);
    	map.put("krish", 102);
    	map.put("ish", 103);
    	
    	
    	//iterate map using for:each
    	for(Entry<String, Integer> entry:map.entrySet()) {
    		System.out.println(entry.getKey()+"->"+ entry.getValue());
    	}
    	
    	//iterate only keys
    	for(String key: map.keySet()) {
    		System.out.println("key:"+key);
    	}
    	
    	//iterate only keys
    	for(int value: map.values()) {
    		System.out.println("value:"+value);}
    }
  }
