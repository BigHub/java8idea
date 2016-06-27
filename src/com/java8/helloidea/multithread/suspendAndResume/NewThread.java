package com.java8.helloidea.multithread.suspendAndResume;
/**
 * suspending and resuming a thread the modern way
 * @author jianwei
 *
 */
public class NewThread implements Runnable {
	String name; //name of thread
	Thread t;
	boolean suspendFlag;
	
	NewThread(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		suspendFlag = false;
		t.start();//Start the thread
	}
	
	@Override
	public void run() {
		try{
			for(int i = 15; i > 0; i-- ){
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized(this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(InterruptedException e){
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
	
	synchronized void mysuspend(){
		suspendFlag = true;
	}
	
	synchronized void myresume(){
		suspendFlag = false;
		notify();
	}

}
