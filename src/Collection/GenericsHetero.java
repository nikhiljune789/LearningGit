package Collection;

import java.util.ArrayList;

class Xyz<T>
{
	ArrayList<T> al=new ArrayList<>();
	
	
	public void addElement(T a)
	{
		al.add(a);
	}
	public void removeElement(T b)
	{
		al.remove(b);
	}
	
	public String toString()
	{
		return al.toString();
	}
	
}



public class GenericsHetero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz<Integer> ob=new Xyz<>();
		
		ob.addElement(Integer.valueOf(1));
		ob.addElement(Integer.valueOf(2));
		System.out.println(ob);
		Xyz<String> ob2=new Xyz<>();
		
		ob2.addElement(String.valueOf("Nikhil"));
		System.out.println(ob2);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println(al.size());
		//System.out.println(al.trimToSize());
	}

}
