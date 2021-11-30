package anotherbrowser.anotherbrowsertesting;

import java.util.HashMap;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(12, "Lovely");
hm.put(1, "pankaj");
hm.put(14, "lucky");
hm.put(16, "Samarth");
hm.put(11, "class");
Set<Integer> allvalue=hm.keySet();
for(Integer i: allvalue) {
	System.out.println("key is"+i);
	System.out.println("value is "+hm.get(i));
}

	}

}
