package com.java8.helloidea.exception.customexception;

class MyException extends Exception {
	private static final long serialVersionUID = 6092277832083141253L;
	private int detail;

	MyException(int a) {
		detail = a;
	}

	public String toString() {
		return "MyException[" + detail + "]";
	}
}
