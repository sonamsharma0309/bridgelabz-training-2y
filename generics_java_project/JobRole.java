
package com.example.generics;
public abstract class JobRole {
    private String title;
    public JobRole(String t){ this.title = t; }
    public String getTitle(){ return title; }
    public String toString(){ return getClass().getSimpleName()+"("+title+")"; }
}
