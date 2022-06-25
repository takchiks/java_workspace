package com.communicating.threads;

import java.util.ArrayList;

public class Producer implements Runnable {
	Q q;
	
	
	public Producer(Q q) {
		super();
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			q.put(i++);
		}
		
		
	}

}
