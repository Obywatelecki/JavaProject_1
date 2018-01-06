package org.tpanecki.homework.homework02;

public class Student implements IStudent{

    private Integer semester;

    public Student(Integer semester) {
        this.semester = semester;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
