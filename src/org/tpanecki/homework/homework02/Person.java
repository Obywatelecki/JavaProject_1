package org.tpanecki.homework.homework02;

public class Person implements IHuman, IStudent, IEmployee {

    private Human human;
    private Student student;
    private Employee employee;

    public Person(Human human, Student student) {
        this.human = human;
        this.student = student;
    }

    public Person(Human human, Employee employee) {
        this.human = human;
        this.employee = employee;
    }

    public Person(Human human, Student student, Employee employee) {
        this.human = human;
        this.student = student;
        this.employee = employee;
    }

    @Override
    public String getName() {
        return human.getName();
    }

    @Override
    public String getSurname() {
        return human.getSurname();
    }

    @Override
    public Long getPesel() {
        return human.getPesel();
    }

    @Override
    public void setName(String name) {
        human.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        human.setSurname(surname);
    }

    @Override
    public void setPesel(Long pesel) {
        human.setPesel(pesel);
    }

    @Override
    public Integer getSemester() {
        return student.getSemester();
    }

    @Override
    public void setSemester(Integer semester) {
        student.setSemester(semester);
    }

    @Override
    public Float getSalary() {
        return employee.getSalary();
    }

    @Override
    public Float getPosition() {
        return employee.getPosition();
    }

    @Override
    public void setPosition(String poistion) {
        employee.setPosition(poistion);
    }

    @Override
    public void setSalary(Float salary) {
        employee.setSalary(salary);
    }
}
