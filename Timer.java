//create Timer1 class which extends Thread class
class Timer1 extends Thread {
	// write run method to start thread
	public void run() {
		// exception handling
		try {
			for (int i = 0; i < 4; i++)

			{
				// delay to print output
				sleep(3000);
				System.out.println("New Thread Time Out");

			}
		} catch (Exception e) {
		}
	}
}

public class Timer {
	public static void main(String args[]) {
		// create object of above class
		Timer1 t = new Timer1();
		// invoke start method on the object
		t.start();
	}
}