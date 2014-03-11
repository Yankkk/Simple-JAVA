//UIUC CS125 SPRING 2014 MP. File: KeyValueMap.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000
/**
 * @author yangeng2
 */

import java.awt.Color;
import java.util.HashMap;

public class KeyValueMap { // aka Dictionary or Map

	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */

	private HashMap<String, Color> map;
	private HashMap<String, Color> mapList = new HashMap<String, Color>();
	
	
	public void add(String key, Color value) {
		mapList.put(key, value);
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		return mapList.get(key);
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		return mapList.containsKey(key);
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		mapList.remove(key);
	}

}
