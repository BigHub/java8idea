package com.java8.helloidea.multithread;

public class MainThread {
	
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		//下面的语句输出：Current thread: Thread[main,5,main]  括号内一次为线程的名称、优先级、线程所属线程
		//租的名称(最好查看下Thread的源码中toString方法的写法)。
		//线程租（thread group）是将一类线程作为整体来控制状态的数据结构；
		System.out.println("Current thread: "+ t);
		
		
		//change the name of the thread 
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		
		try{
			for(int n = 5; n > 0; n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		
		
	}
}
