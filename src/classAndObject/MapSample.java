package classAndObject;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a hash map
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashmAP: "+ languages);
		
		//get() method to get value
		String value = languages.get(1);
		System.out.println("value: "+value);
		
		//using keySet
		System.out.println("Keys: "+ languages.keySet());
		
		
		//return set view of values
		//using values()
		
		System.out.println("Values: "+languages.values());
		
		//return set view of key/value pairs
		// using entrySet()
		
		System.out.println("Key/Value mapping:" + languages.entrySet());
		
		//Remove elements from the map
		
		String valueRam = languages.remove("two");
		System.out.println("Removes valued: "+ valueRam);

	}

}
