package org.tpanecki;

import org.tpanecki.homework.homework02.Faculty;
import org.tpanecki.homework.homework02.Student;
import org.tpanecki.homework.homework02.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Faculty f1 = new Faculty("geography", "Krakowskie Przedmiescie 30", "natural sciences");
        Faculty f2 = new Faculty("Arts and Literature", "Oxenfurt", "arts");

        Person p1 = new Person("Jan", "Kowalski", 81314L);
        Person p2 = new Person("Donek", "Tusk", 81314L);
        Person p3 = new Person("Adrian", "Duda", 823525L);

        Student s1 = new Student(p1, f2, 4);
        Student s2 = new Student(p2, f1, 24);
        Student s3 = new Student(p3, f2, 1);

        Student[] students = {s1, s2, s3};

        for (Student i : students) {
            System.out.println(i.getStudentName() + " " + i.getStudentSurname() + ", " + i.getFacultyName() + ", semester: " + i.getSemester());
        }

        s1.setStudentName("Tomasz");
        s1.setStudentSurname("Panecki");

        System.out.println("Student: " + s1.getStudentName() + " " + s1.getStudentSurname());
        System.out.println("Person: " + p1.getName() + " " + p1.getSurname());
    }
}
