
package com.example.generics;
public class Resume<T extends JobRole> {
    private T role;
    public Resume(T role){ this.role = role; }
    public void process(){ System.out.println("Processing resume for " + role); }
    public static void processAll(java.util.List<? extends JobRole> roles){
        for(JobRole r: roles) System.out.println("Pipeline: " + r);
    }
}
