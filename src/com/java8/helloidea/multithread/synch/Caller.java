package com.java8.helloidea.multithread.synch;

public class Caller implements Runnable {
	
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ, String s){
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		//synchronized的另一种用法 当对象的方法没有用synchronized修饰的时候可以这样处理，该方式会确保
		//对target的成员方法的调用，只会在当前线程成功进入target的监视器之后发生。
		synchronized(target){
			target.call(msg);
		}
	}

}
