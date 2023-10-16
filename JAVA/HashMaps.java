import java.util.*;
import java.util.Map.Entry; 

class HashMaps { 

    public static void main(String[] args) 
    { 
        HashMap<Integer, String> map = new HashMap<>(); 
        map.put(1, "A"); 
        map.put(2, "B"); 
        map.put(3, "C"); 
        map.put(4, "D"); 
        map.put(5, "E"); 
        if (map.containsKey(3)) { 
            System.out.println("Key 3 is present with value: "+ map.get(3)); 
        } 
        else { 
            System.out.println("Key 3 is not present"); 
        } 
        if (map.containsValue("A")) { 
            System.out.println("Value A is present"); 
        } 
        else{
            System.out.println("Value A is absent"); 
        }
        
	Set<Integer> keys = map.keySet(); 

	for (Integer key : keys) 
		System.out.println(key); 

	Set<Entry<Integer, String>> entries 
							= map.entrySet(); 

	for (Entry<Integer, String> entry : entries) 
		System.out.println(entry.getKey() + " : "
						+ entry.getValue()); 
} 
} 