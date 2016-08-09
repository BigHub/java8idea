package com.java8.helloidea.regex;

// Use replaceAll().
import java.util.regex.*;

class RegExpr8 {
    public static void main(String args[]) {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*? ");//?的作用是将find()默认的贪婪行为(只匹配适合模式的最大序列)改为胁迫行为(匹配适合模式的最小序列)
        Matcher mat = pat.matcher(str);

        System.out.println("Original sequence: " + str);

        str = mat.replaceAll("Eric ");

        System.out.println("Modified sequence: " + str);

    }
}