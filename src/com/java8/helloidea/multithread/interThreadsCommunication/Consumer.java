package com.java8.helloidea.multithread.interThreadsCommunication;

public class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q){
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		while(true)
		q.get();
	}

}
