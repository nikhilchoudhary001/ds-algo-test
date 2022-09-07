package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(Math.pow(2, 31) - 1));
		System.out.println(46341 * 46341);
		HashMap<Integer, HashSet<Integer>> map = new HashMap();
		HashSet<Integer> s = new HashSet<>();
		 s.add(50);
		 System.out.println(s.size());
		 
		 map.put(1, s);
		 map.get(1).add(51);
		 
		 for(Map.Entry<Integer, HashSet<Integer>> m : map.entrySet()) {
			 System.out.println(m.getKey() + "  " + m.getValue());
		 }
		 System.out.println(s.size());
		 
		 List<Integer> l = new ArrayList<>();
		 
		 l.add(3);
		 l.add(5);
		 l.add(7);
		 System.out.println(l.size());
		 System.out.println(l.indexOf(59));
		 
		 System.out.println(l);
//		int temp =  l.get(0);
//		l.set(0, l.get(l.size() - 1));
//		l.set(l.size() - 1, temp);
		 l.set(0, l.get(l.size() - 1));
		 l.remove(l.size() - 1);
		
		System.out.println(l);
		
		Map<Integer,Integer> m = new HashMap<>();
		
		m.put(1, 50);
		m.put(2, 51);
		
		
		System.out.println(m);
	}

}
