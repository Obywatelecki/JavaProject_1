package org.tpanecki;

import org.tpanecki.homework.homework02.Employee;
import org.tpanecki.homework.homework02.Faculty;
import org.tpanecki.homework.homework02.Human;
import org.tpanecki.homework.homework02.Person;
import org.tpanecki.homework.homework02.Student;

public class Main {

    public static void main(String[] args) {

        //Faculty f1 = new Faculty("geography", "Krakowskie Przedmiescie 30", "natural sciences");
        //Faculty f2 = new Faculty("Arts and Literature", "Oxenfurt", "arts");

        
        Human h1 = new Human("Jan", "Kowalski", 81314L);
        Human h2 = new Human("Donek", "Tusk", 81314L);
        Human h3 = new Human("Adrian", "Duda", 823525L);

        Student s1 = new Student(1);
        Student s2 = new Student(3);

        Employee e1 = new Employee("Assistant", 3000F);
        Employee e2 = new Employee("Adjoint Proffesor", 4000F);

        Person p1 = new Person(h1, s1);
        Person p2 = new Person(h3, s2);
        Person p3 = new Person(new Human("Karol", "Marcinkowski", 35235l), new Student(2));
        Person studEmp = new Person(h2, s2, e1);
        Person emp = new Person(h1, e2);

        Person[] personArray = {p1, p2, p3, studEmp, emp};

        for (Person i : personArray) {
            System.out.println("Imie i nazwisko: " + i.getName() + " " + i.getSurname());
        }
    }
}
