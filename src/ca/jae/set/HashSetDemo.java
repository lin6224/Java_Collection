package ca.jae.set;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
/* 
 * set ia a collection, and it cannot contain duplicate elements
 * 
 * set -> HashSet, TreeSet LinkedHashSet
 *
*/	
	
	public static void main(String[] args){
		HashSet<String> set = new HashSet<String>();
		set.add("Tom");
		set.add("Jack");
		set.add("Jae");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(String item : set){
			System.out.println(item);
		}
		

	}
}
