package org.tpanecki.homework.homework02;

public class Employee implements IEmployee {

    private String position;
    private Float salary;

    public Employee(String position, Float salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public Float getSalary() {
        return salary;
    }

    @Override
    public Float getPosition() {
        return salary;
    }

    @Override
    public void setPosition(String poistion) {
        this.position = poistion;
    }

    @Override
    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
