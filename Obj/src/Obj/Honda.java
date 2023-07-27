package Obj;

public class Honda extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}
	

	public static void main(String args[]) {
		
		Honda h1=new Honda();
		h1.run();

	}

}
