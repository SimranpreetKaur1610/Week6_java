package com.simranpreetkaur;

import java.util.Date;

public class Week06Sample {
    public static void main(String [] args)    {
        float[] dalveerMarks = {80,80,80,80,80};
        Student dalveer = new Student(789821, "Dalveer", "Singh", new Date(), Gender.MALE, "String address", "String city", "String cellPhone", "String email", "String department", dalveerMarks);
        dalveer.calculateGrades();
        float[] dwarkeshMarks = {90,90,90,90,90};
        Student dwarkesh = new Student(789822, "Dwarkesh", "Singh", new Date(), Gender.MALE, "String address", "String city", "String pinCode", "String cellPhone", "String email", "String department", dwarkeshMarks);
        dalveer.calculateGrades();
        dwarkesh.calculateGrades();
        System.out.println("Dalveer Grades: "+dalveer.getGrade());
        System.out.println("Dwarkesh Grades: "+dwarkesh.getGrade());
    }
}
