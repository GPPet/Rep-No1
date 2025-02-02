package Problem_p49_1;

public class MyThread extends Thread {
	private int sleepTime;
	private String myName;
	
	public MyThread() {
	}

	public MyThread(int sleepTime) {
		setSleepTime(sleepTime);
	}
	
	public MyThread(int sleepTime, String myName) {
		setSleepTime(sleepTime);
		setMyName(myName);
	}

	public void run() {
		System.out.println("The thread started!");
		try {
			Thread.sleep(getSleepTime()*1000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		if (getMyName()!=null) System.out.println("My name is " + getMyName());
		System.out.println("The thread is complete!");
	}
	
	public int getSleepTime() {
		return sleepTime;
	}


	public void setSleepTime(int sleepTime) {
		if (sleepTime > 0 && sleepTime < 10) this.sleepTime = sleepTime;
		else this.sleepTime = 0;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	

}
