package MapPM;

import java.util.Iterator;
import java.util.TreeMap;

public class MojaMapa {
	private TreeMap<String, Rekord> map = null;
	private Iterator<String> iter;

	public MojaMapa() {
		if (map == null)
			map = new TreeMap<String, Rekord>();					
	}

	public int size() {
		return map.size();
	}
	
	public Rekord get(String klucz) {
		return map.get(klucz);
	}
	
	public boolean hasNext() {
		return iter.hasNext();
	}
	
	public String next() {
		return iter.next();
	}
	
	public void put(String klucz, Rekord rekord) {
		map.put(klucz, rekord);
		iter = map.keySet().iterator();
	}

}
