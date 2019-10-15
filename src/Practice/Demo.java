package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Integer> ob=new ArrayList<Integer>();
			ob.add(1);
			ob.add(6);
			ob.add(3);
			ob.add(32);
			ob.add(null);
			
			Iterator itr=ob.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
			LinkedList ll=new LinkedList();
			
			ll.add("Nikhil");
			ll.add(1);
			ll.add("Rooney");
			ll.add(2);
			ll.add(null);
			ll.add(null);
			
			Iterator it=ll.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			
			
			
		
	}

}
