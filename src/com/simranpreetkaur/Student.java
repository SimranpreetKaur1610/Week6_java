package com.simranpreetkaur;

import java.util.Date;

public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private Date birth_date;
    private Gender gender;
    private String address;
    private String city;
    private String cell_phone;
    private String email;
    private String department;
    private float marks[];
    private float total_marks;
    private float percentage;
    private String grade;

    public Student(int id){
        this.id = id;
    }

    public Student(int id, String first_name, String last_name, Date birth_date, Gender gender, String address, String city, String cell_phone, String email, String department, float[] marks) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.cell_phone = cell_phone;
        this.email = email;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFullname() {
        return first_name+""+last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(float total_marks) {
        this.total_marks = total_marks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void calculateTotalmarks(){
        float total =0.0f;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        setTotal_marks(total);
    }
    public void calculatePercentage(){
        float percentage = 0.0f;
        percentage = (total_marks/500)*100;
    }

    public void calculateGrades(){
        String grade;
        if(percentage>=94 || percentage<=100)
            grade = "A+";
        else if((percentage>=87 || percentage<=93))
            grade = "A";
        else if((percentage>=80 || percentage<=86))
            grade = "A-";
        else if((percentage>=77 || percentage<=79))
            grade = "B+";
        else if((percentage>=73 || percentage<=76))
            grade = "B";
        else if((percentage>=70 || percentage<=72))
            grade = "B-";
        else if((percentage>=67 || percentage<=69))
            grade = "C+";
        else if((percentage>=63 || percentage<=66))
            grade = "C";
        else if((percentage>=62 || percentage<=60))
            grade = "C-";
        else if((percentage>=50 || percentage<=59))
            grade = "D";
        else if((percentage>=0 || percentage<=49))
            grade = "F";


    }
}
