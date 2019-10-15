package designPatterns;

class TransportationDevice
{
	void getname()
	{
		
	}
	void getspeed()
	{
		
	}
	void startengine()
	{
		
	}
}



class Car extends TransportationDevice
{
	@Override
	void startengine()
	{
		
	}
}

class Bicycle extends TransportationDevice
{
	void startengine()
	{
		//Everything isn’t going as planned now! Yes, a bicycle is a transportation device, 
		//however, it does not have an engine and hence, the method startEngine() cannot be implemented. 
	}
}

//These are the kinds of problems that violation of Liskov Substitution Principle leads to, 
//and they can most usually be recognized by a method that does nothing, or even can’t be implemented.

//The solution to these problems is a correct inheritance hierarchy, 
//and in our case we would solve the problem by differentiating classes of transportation devices with and without engines.

class Deviceswithoutengine extends TransportationDevice
{
	void startmoving() {
		
	}
}
class Deviceswithengine extends TransportationDevice
{
	void startengine() {
		
	}
}

class Car2 extends Deviceswithengine
{
	@Override
	void startengine()
	{
		
	}
}

class Bicycle2 extends Deviceswithoutengine
{
	@Override
	void startmoving()
	{
		
	}
}



public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
