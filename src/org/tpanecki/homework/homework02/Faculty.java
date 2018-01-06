package org.tpanecki.homework.homework02;

public class Faculty {

    private String name;
    private String address;
    private String facultyType;

    public Faculty(String name, String address, String facultyType) {
        this.name = name;
        this.address = address;
        this.facultyType = facultyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacultyType() {
        return facultyType;
    }

    public void setFacultyType(String facultyType) {
        this.facultyType = facultyType;
    }
}
