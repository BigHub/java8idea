package com.java8.helloidea.javaLib;

class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("open .");
        } catch (Exception e) {
            System.out.println("Error executing MacVim. ");
        }
    }
}