package it.develhope.ifstatement;

import it.develhope.ifstatement.entities.Student;

public class Start {
    public static void main(String[] args) {
        Student student = new Student("Mirco",26);

        student.guessingAge();
    }
}
