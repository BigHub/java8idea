package com.java8.helloidea.lambda;

import java.util.*;
class MyClassT{
	private int val;

	MyClassT(int v){ val = v; }

	int getVal(){ return val; }
}

class UseMethodRef{
	static int compareMC(MyClassT a, MyClassT b){
		return a.getVal() - b.getVal();
	}

	public static void main(String[] args) {
		ArrayList<MyClassT> al = new ArrayList<MyClassT>();

		al.add(new MyClassT(1));
		al.add(new MyClassT(4));
		al.add(new MyClassT(2));
		al.add(new MyClassT(9));
		al.add(new MyClassT(3));
		al.add(new MyClassT(7));

		MyClassT maxValObj = Collections.max(al, UseMethodRef::compareMC);

		System.out.println("Maximum value is: " + maxValObj.getVal());
	}
}