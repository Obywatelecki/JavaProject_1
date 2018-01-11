package org.tpanecki.homework.homework02;

public class Human implements IHuman {

    private String name;
    private String surname;
    private Long pesel;

    public Human(String name, String surname, Long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Long getPesel() {
        return pesel;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

}
