package org.tpanecki.homework.homework02;

public interface IPerson {
    String getName();
    String getSurname();
    Long getPesel();

    void setName(String name);
    void setSurname(String surname);
    void setPesel(Long pesel);
}
