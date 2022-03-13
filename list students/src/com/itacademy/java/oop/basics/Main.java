package com.itacademy.java.oop.basics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student pirmas = new Student("Jonas", 20);
        Student antras = new Student("Petras", 26);
        Student trecias = new Student("Juozas", 30);
        Student ketvirtas = new Student("Pranas", 15);
        Student penktas = new Student("Algis", 25);
        List<Student> Students = new ArrayList<Student>();
        Students.add(pirmas);
        Students.add(antras);
        Students.add(trecias);
        Students.add(ketvirtas);
        Students.add(penktas);
        for(int i = 0; i < Students.size(); i++){
            if(Students.get(i).getAge() > 25) {Students.remove(i);
            i--;}
        }
        for(int i = 0; i < Students.size(); i++){
            System.out.println(Students.get(i).getName());
        }
    }
}
