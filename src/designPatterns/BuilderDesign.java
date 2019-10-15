package designPatterns;

class Phone{
	
	private int ram;
	private int battery;
	private String os;
	private float screensize;
	
	public Phone(int ram,int battery,String os,float screensize) {
		// TODO Auto-generated constructor stub
		this.ram=ram;
		this.battery=battery;
		this.os=os;
		this.screensize=screensize;
	}
	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", battery=" + battery + ", os=" + os + ", screensize=" + screensize + "]";
	}
	
	
}


class PhoneBuilder
{
	private int ram;
	private int battery;
	private String os;
	private float screensize;
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setScreensize(float screensize) {
		this.screensize = screensize;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(ram, battery, os, screensize);
	}
	
}



public class BuilderDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p=new PhoneBuilder().setBattery(4000).setOs("Android").setRam(4).getPhone();
		
		System.out.println(p);
	}

}
