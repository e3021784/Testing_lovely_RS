package anotherbrowser.anotherbrowsertesting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class hashCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		LinkedList<Integer> hs=new LinkedList<Integer>();
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(40);
		hs.add(50);
		
		for(Integer i: hs) {
			System.out.println(i);
		}
	}

}
