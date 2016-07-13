package com.java8.helloidea.io.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * Created by jianwei on 16/7/13.
 */

class OnlyExt implements FilenameFilter {
    private String ext;

    OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String args[]) {
        String dirname = ".";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = f1.list(only);
        for (int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

