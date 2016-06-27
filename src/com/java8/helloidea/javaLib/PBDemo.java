package com.java8.helloidea.javaLib;

class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("open", ".");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing notepad. ");
        }
    }
}