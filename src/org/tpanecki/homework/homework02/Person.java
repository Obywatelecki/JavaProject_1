package org.tpanecki.homework.homework02;

public class Person {

    private String name;
    private String surname;
    private Long pesel;

    public Person(String name, String surname, Long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
