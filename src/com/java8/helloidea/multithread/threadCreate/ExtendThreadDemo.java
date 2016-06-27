package com.java8.helloidea.multithread.threadCreate;

public class ExtendThreadDemo {
	public static void main(String[] args) {
		new NewThreadExtThread();//create a new thread
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
				
			}
		}catch(InterruptedException e){
			System.out.println("Main thread intterupted.");
		}
		System.out.println("Main thread exiting. ");
	}
}
