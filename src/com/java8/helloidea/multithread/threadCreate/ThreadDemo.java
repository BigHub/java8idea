package com.java8.helloidea.multithread.threadCreate;

public class ThreadDemo{
	public static void main(String[] args){
		new NewThreadRunnable(); //create a new thread
		
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Main thread: " + i);
				//在多线程程序中， 主线程通常必须在最后接结束运行。所以这里休眠一秒，而在NewThreadRunnable中休眠0.5秒。
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted. ");
		}
		System.out.println("Main thread exiting.");
	}
}
