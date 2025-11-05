
package com.school.main;
import com.school.data.*; import com.school.util.*;
public class MainAnalyzer {
    public static void main(String[] args){
        Student s = new Student("Sonam", 85, 90, 80);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        System.out.println(s);
        System.out.println("Average: " + avg + " Grade: " + a.findGrade(avg));
    }
}
