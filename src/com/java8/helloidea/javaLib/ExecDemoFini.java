package com.java8.helloidea.javaLib;

class ExecDemoFini{
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p = null;

		try{
			p = r.exec("open .");
			p.waitFor();
		}catch(Exception e){
			System.out.println("Error executing ntoepad. ");
		}
		System.out.println("Notepad returned " + p.exitValue());
	}
}