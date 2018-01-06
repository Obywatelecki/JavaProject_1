package org.tpanecki.homework.homework02;

public class Student {

    private Person person;
    private Faculty faculty;
    private Integer semester;

    public Student(Person person, Faculty faculty, Integer semester) {
        this.person = person;
        this.faculty = faculty;
        this.semester = semester;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        person.setSurname(surname);
    }

    @Override
    public String getSurname() {
        return person.getSurname();
    }

    @Override
    public Long getPesel(){
        return person.getPesel();
    }

    @Override
    public void setPesel(Long pesel) {
        person.setPesel(pesel);
    }

    public String getFacultyName() {
        return faculty.getName();
    }

    public String getFacultyAddress() {
        return faculty.getAddress();
    }

    public String getFacultyType() {
        return faculty.getFacultyType();
    }

    public Integer getSemester() {
        return semester;
    }
}
