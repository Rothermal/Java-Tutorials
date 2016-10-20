package advanced;

import java.util.*;
// note java ArrayLists/Hashmaps?TreeSets only store objects, not primitive types
public class ArrayList {
	private static java.util.ArrayList<Integer> v = new java.util.ArrayList<Integer>();
	
    static HashMap<String, String> map = new HashMap<String, String>();
    String [] keys = map.keySet().toArray(new String[map.size()]);
    
    public static void mapsomestuff(){
    	// adding something to the map
    	map.put("Me","Password");
    	// removing something from the map
    	map.remove("Me");
    	
    }
    
	public static void insert(){
		// add a 1 into the array
		v.add(1);
	}
	
	public static void remove(){
		// remove the 0 index from the array
		v.remove(0);
	}
}
