package com.java8.helloidea.multithread.threadCreate;

/**
 * 创建线程有两种方法 1.实现runnable接口； 2.扩展Thread类
 * @author jianwei
 *
 */
public class NewThreadRunnable implements Runnable{
	
	Thread t;
	
	NewThreadRunnable(){
		//create a new, second thread
		t = new Thread(this, "Demo thread");
		System.out.println("Child thread: " + t);
		t.start();//start the thread
	}
	
	//this is the entry point for the second thread.
	public void run(){
		try{
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread. ");
	}
}

