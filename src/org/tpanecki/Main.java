package org.tpanecki;

import org.tpanecki.homework.homework02.Faculty;
import org.tpanecki.homework.homework02.IPerson;
import org.tpanecki.homework.homework02.Student;
import org.tpanecki.homework.homework02.Person;

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
        Student s4 = new Student(new Person("Wojciech", "Wacławik", 824235L), new Faculty("IT", "Ulica 1", "IT1"), 1);

        Student[] students = {s1, s2, s3, s4};

        for (Student i : students) {
            System.out.println(i.getName() + " " + i.getSurname() + ", " + i.getFacultyName() + ", semester: " + i.getSemester());
        }

        s1.setName("Tomasz");
        s1.setSurname("Panecki");

        System.out.println("Student: " + s1.getName() + " " + s1.getSurname());
        System.out.println("Person: " + p1.getName() + " " + p1.getSurname());

        // System.out.println(s4.getPerson().getName()); // --> odwołowanie się do metody klasy Person
        System.out.println(s4.getName()); // --> tzw. delegacja

    }
}
