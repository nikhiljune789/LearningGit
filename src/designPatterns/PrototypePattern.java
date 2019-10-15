package designPatterns;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable
{
	private List<String> vehiclelist;
	
	public List<String> getVehiclelist() {
		return vehiclelist;
	}

	

	public Vehicle()
	{
		this.vehiclelist=new ArrayList<String>();
	}
	
	public Vehicle(List<String> list)
	{
		this.vehiclelist=list;
	}
	
	public void insertdata()
	{
		vehiclelist.add("Honda");
		vehiclelist.add("Bugati");
		vehiclelist.add("Maruti");
		vehiclelist.add("Audi");
		vehiclelist.add("BMW");
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> templist=new ArrayList<String>();
		
		for(String s:this.vehiclelist)
		{
			templist.add(s);
		}
	//	OS ob1=new Android();
//		ob1.os();

		return new Vehicle(templist);
	}
	
}

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Vehicle ob=new Vehicle();
		ob.insertdata();
		
		Vehicle b=(Vehicle)ob.clone();
		
		List<String> list=b.getVehiclelist();
		
		list.add("TaTa");
		
		System.out.println(ob.getVehiclelist());
		
		System.out.println(list);
		
		System.out.println(ob.getVehiclelist());
		
		b.getVehiclelist().remove("BMW");
		
	//	System.out.println(list);
		
		//System.out.println(ob.getVehiclelist());
		
	}

}
