
package com.access.one;
public class Base {
    private void privateMethod(){ System.out.println("Private method"); }
    void defaultMethod(){ System.out.println("Default method"); }
    protected void protectedMethod(){ System.out.println("Protected method"); }
    public void publicMethod(){ System.out.println("Public method"); }
    public void showAll(){ privateMethod(); defaultMethod(); protectedMethod(); publicMethod(); }
}
