package it.develhope.ifstatement.entities;

import java.util.Random;

public class Student {
    private String name;
    private int age;
    Random randomNum = new Random();

    public Student(String studentName,int studentAge){
        this.setName(studentName);
        this.setAge(studentAge);
    }
    public void guessingAge(){
        int generatedNum = randomNum.nextInt(36);
        System.out.println("I generated the random number "+ generatedNum+ " for student " + name);

        if(generatedNum > age){
            System.out.println("The number generated is Greater of the student's age");
        } else if (generatedNum == age) {
            System.out.println("The number generated is Equal to the student's age");
        }else{
            System.out.println("The number generated is Lower of the student's age");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Random getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(Random randomNum) {
        this.randomNum = randomNum;
    }
}
