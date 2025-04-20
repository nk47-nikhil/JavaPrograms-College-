package com.NIkhil;
import java.util.*;
public class RevString {
    public static void main(String[]args){
        StringBuilder name=new StringBuilder("Nikhil");

        int st=0,end=name.length()-1;

        while(st<end){
            char first= name.charAt(st);
            char sec= name.charAt(end);
            name.setCharAt(end,first);
            name.setCharAt(st, sec);
            st++;
            end--;
        }

        System.out.println(name);
    }
}
