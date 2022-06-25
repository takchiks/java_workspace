package com.communicating.threads;

public class Consumer implements Runnable {
Q q;
	
	public Consumer(Q q) {
		super();
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		
		while(true) {
			q.get();
		}
		
		
		
	}

}
