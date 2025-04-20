package com.NIkhil;
import java.util.*;
public class StrBuilder {
    public static void main(String []args) {
        StringBuilder sb = new StringBuilder("NIkhil");
        sb.setCharAt(3,'j');
        sb.insert(3,"jj");
        System.out.println(sb.charAt((3)));
        System.out.println(sb);


    }
}
