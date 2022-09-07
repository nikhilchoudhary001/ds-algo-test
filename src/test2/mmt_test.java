package test2;

public class mmt_test {
	
	static Thread1 t1 = new Thread1();
	
	
	static Thread2 t2 = new Thread2();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t1.start();
		t2.start();
		
		//join();
		//System.out.println();
		
	}

}

class Thread1 extends Thread{
	
	public void run() {
		int i = 1; 
		while(i < 10) {
			System.out.println(i);
			i += 2;
			t2.notify();
			t1.wait();
		}
	}
	
}

class Thread2 extends Thread{
	
	public void run() {
		int i = 2;
		while(i <= 10) {
			t2.wait();
			System.out.println(i);
			t1.notify();
			i += 2;
		}
	}
	
}


interface CircuitBreaker{
	
	public abstract void invokeNextFallback();
}

class Hystrix implements CircuitBreaker{
	private int retryTime;
	private List<String> fallbackMethods;
	private List<Integer> noOfRequests;
	
	void invokeNextFallback() {
		
	}
}



