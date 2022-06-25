package com.communicating.threads;

public class Q {
	private int n;
	private boolean valueset;

	public synchronized void put(int n) {
		if (valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("producer " + n);
		valueset = true;
		notify();

	}

	public synchronized int get() {
		if (!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("consumer " + n);
		valueset=false;
		notify();
		return this.n;

	}

}
