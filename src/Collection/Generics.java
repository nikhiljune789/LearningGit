package Collection;

import java.util.ArrayList;

class Gener<T >
{
	ArrayList<T> list=new ArrayList<>();
	
	public void insert(T a)
	{
		list.add(a);
	}
	
	public void remove(T b)
	{
		list.remove(b);
	}
	
	public String toString()
	{
		return list.toString();
	}
	
}


public class Generics {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gener<String> ob=new Gener<>();
		
		ob.insert("Nikhil");
		ob.insert("Rooney");
		System.out.println(ob);
		
		Gener<Integer> ob2=new Gener<>();
		ob2.insert(1);
		ob2.insert(2);
		
		System.out.println(ob2);
		
			}

}
