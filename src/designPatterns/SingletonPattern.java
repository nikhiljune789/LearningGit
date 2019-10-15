package designPatterns;

class SingleTon {
	static SingleTon ob = new SingleTon();

	private SingleTon() {

	}

	public static SingleTon getInstatnce() {
		return ob;
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTon ab = SingleTon.getInstatnce();

		SingleTon bc = SingleTon.getInstatnce();

	}

}
