//UIUC CS125 SPRING 2014 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * 
 * @author yangeng2
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];
	private int size = 0;

	public Geocache getGeocache(int i) {
		return data[i];
	}

	public int getSize() {
		return data.length;
	}

	public GeocacheList() {
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		data = new Geocache[other.data.length];
		size = other.size;
		if(deepCopy){
			for(int i = 0; i < data.length; i++){
				data[i] = new Geocache(other.data[i].getX(),other.data[i].getY());
			}
		}
		else{
			for (int j = 0; j < data.length; j++){
				data[j] = other.data[j];
				}
		}
			
	}

	public void add(Geocache p) {
		size++;
		if (size > data.length) {
			Geocache[] old = data;
			data = new Geocache[size];
			for (int i = 0; i < old.length; i++)
				data[i] = old[i];
		}
		data[size-1] = p;
	}

	public Geocache[] removeFromTop() {
		size--;
		Geocache[] old = data;
		data = new Geocache[size];
		for(int i = 0; i < data.length; i++){
			data[i] = old[i+1];
		}
		return data;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < size; i++) {
			if (i > 0)
				s.append(',');
			s.append(data[i]);
		}
		return s.toString();
}	}
