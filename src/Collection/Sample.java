package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	Collection al=new ArrayList<Integer>(n);
	
	for (int i = 1; i <= n; i++) {
		al.add(i);
	}
	
	System.out.println(al);
	
	Iterator it=al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println(al.isEmpty());
	
	
	}

}
