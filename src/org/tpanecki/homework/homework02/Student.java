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

    public String getFacultyName() {
      return faculty.getName();
    }

    public void setStudentName(String name) {
        person.setName(name);
    }

    public String getStudentName() {
        return person.getName();
    }

    public void setStudentSurname(String surname) {
        person.setSurname(surname);
    }

    public String getStudentSurname() {
        return person.getSurname();
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
