
package com.university.department.cse;
public class Course {
    private String name; private String code;
    public Course(String name, String code){ this.name=name; this.code=code; }
    public void display(){ System.out.println("Course: " + name + " (" + code + ")"); }
}
