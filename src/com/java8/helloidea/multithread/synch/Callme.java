package com.java8.helloidea.multithread.synch;

public class Callme {
	//在多线程情况下，如果有一个或一组方法来操作对象的内部状态，那么每次都应当使用synchronized关键字，以
	//保证状态不会进入竞态条件（多个线程在同一时间调用同一个对象的同一个方法，多个线程相互竞争以完成方法。）；
	/*synchronized*/ void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted.");
		}
		System.out.println("]");
	}
}
