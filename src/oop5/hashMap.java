package oop5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("Shreya",2);
	map.put("Joey",23);
	map.put("Jay",6);
	System.out.println(map);
	map.put("Shreya", 50);
	System.out.println(map);
	System.out.println("is shreya present ?"+map.containsKey("Shreya"));
	System.out.println("Roll no is: "+map.get("Joey"));
	System.out.println("All keys: "+map.keySet());
	System.out.println("All values: "+map.values());
	Set<String> names = map.keySet();
	for(String name:names) {
		System.out.println("Names: "+name+" Roll no: "+map.get(name));
	}
	
	Map<String,Map<String,Object>> userprofile = new HashMap<String,Map<String,Object>>();
	Map<String,Object> profile = new HashMap<String,Object>();
	profile.put("Age", 25);
	profile.put("dept","Admin");
	profile.put("city", "NY");
	userprofile.put("John", profile);
	//System.out.println(userprofile);
	profile.put("Age", 30);
	profile.put("dept","Security");
	profile.put("city", "DXB");
	userprofile.put("Joey", profile);
	System.out.println(userprofile);
	
	
	
}
}
