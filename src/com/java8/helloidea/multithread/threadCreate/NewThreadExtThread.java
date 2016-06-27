package com.java8.helloidea.multithread.threadCreate;

//create a second thread by extending Thread
class NewThreadExtThread extends Thread{
	
	NewThreadExtThread(){
		//create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); //start the thread
	}
	
	//this is the entry point for the second thread.
	public void run(){
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread");
	}
}


