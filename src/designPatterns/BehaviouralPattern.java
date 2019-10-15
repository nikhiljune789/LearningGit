package designPatterns;

import java.util.ArrayList;
import java.util.List;

class Channel {
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	public String title;

	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	
	
	

	public void notifySub() {
		for (Subscriber sub : subs) {
			sub.update();
		}
	}

	public void upload(String title) {
		this.title = title;
		notifySub();
	}
}

class Subscriber {
	private String name;
	private Channel channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hey " + name + " Video Uploaded: " + channel.title);
	}

	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}

public class BehaviouralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Channel nikhil = new Channel();

		Subscriber s1 = new Subscriber("Rooney");
		Subscriber s2 = new Subscriber("Wayne");
		Subscriber s3 = new Subscriber("Ronaldo");
		Subscriber s4 = new Subscriber("Messi");

		nikhil.subscribe(s1);
		nikhil.subscribe(s2);
		nikhil.subscribe(s3);
		nikhil.subscribe(s4);

		nikhil.unSubscribe(s2);

		s1.subscribeChannel(nikhil);
		s2.subscribeChannel(nikhil);
		s3.subscribeChannel(nikhil);
		s4.subscribeChannel(nikhil);

		nikhil.upload("How to learn programming");
	}

}
