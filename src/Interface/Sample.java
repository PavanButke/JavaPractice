package Interface;


interface Hunting {
	void Hunt();
}

interface Sleeps {
	void sleeps();
}


class Tiger implements Hunting, Sleeps {

	public void Hunt() {
		System.out.println("Tiger Hunting");
	}

	public void sleeps() {
		System.out.println("Tiger sleeps");
	}

}


public class Sample {

	public static void main(String[] args) {

		Tiger t = new Tiger();
		t.sleeps();
		t.Hunt();
	}

}
