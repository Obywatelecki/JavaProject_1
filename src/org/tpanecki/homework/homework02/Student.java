package org.tpanecki.homework.homework02;

public class Student implements IStudent{

    private Integer semester;

    public Student(Integer semester) {
        this.semester = semester;
    }

    @Override
    public Integer getSemester() {
        return semester;
    }

    @Override
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

}
