
package com.example.generics;
import java.util.*;
public class Course<T extends CourseType> {
    private List<T> offerings = new ArrayList<>();
    public void add(T t){ offerings.add(t); }
    public void show(){ for(T t: offerings) System.out.println(t); }
    public static void showAnyCourse(java.util.List<? extends CourseType> list){
        for(CourseType c: list) System.out.println(c);
    }
}
