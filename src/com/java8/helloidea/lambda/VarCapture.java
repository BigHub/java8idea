package com.java8.helloidea.lambda;

interface MyFunc{
	int func(int n);
}

class VarCapture{
	public static void main(String[] args) {
		int num = 10;

		MyFuncT<Integer,Integer> mylambda = (n) -> {
			int v = num + n;
			// num ++; 
			System.out.println(v);
			return v;
		};

		mylambda.func(20);

	}
}