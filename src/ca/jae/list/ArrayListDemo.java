package ca.jae.list;

import java.util.*;

/*
 * 	List is an ordered collection, and it contain duplicate elements
 * 
*	List has collection implement
*		 -> ArrayList (Vector) : base on array structure
*		 -> LinkedList		   : base on link structure	
*
*
*	ArrayList has add() addAll() size() clear() isEmpty()
*				  remove() removeAll() retainAll()
*				  equals() contains() containsAll()
*				  hashcode()
*				  iterator() toArray()
*/

public class ArrayListDemo {
	
	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		//add object(elements) in arraylist
		al.add("java");
		al.add(3);
		al.add(new Date());
		al.add("c");
		al.add(new Date());
		
		// check having element in arraylist
		System.out.println(al.contains(3));
		
		// check arraylist empty or not
		System.out.println(al.isEmpty());
		
		// add object in the index position
		al.add(0, "C#");
		
		// modify element in the index position
		al.set(3, "modify");
		
		System.out.println(al);
		
		// remove element at position 1
		al.remove(1);
		
		// arraylist length
		System.out.println(al.size());
		
		// loop and print out element using iterator
		// iterator is a inner class in the arraylist
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());			
		}
		System.out.println("#####");
		
		// in the collection for is better than while
		// cuz after loop, gc will clear this iterator in the memory 
		for(Iterator i = al.iterator(); i.hasNext();  ){
			System.out.println(i.next());			
		}
		System.out.println("#####");
		
		// ListIterator interface
		// iterator only has remove and add
		// but listliterator has more method like add and set
		ListIterator li = al.listIterator();
		while(li.hasNext()){
			Object obj = li.next();
			if(obj.equals("C#")){
				li.add("add");
				//li.set("2");
			}
		}
		System.out.println(al);
		
		// get element to index position		
		String information = (String)al.get(0);
		System.out.println(information);
		
		// clear all element in this arraylist
		al.clear();
		System.out.println(al);
	}

}
