package org.example;
public class Consultant {
    private String name;
    private String lastName;
    private Integer age;

    public Consultant(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Consultant{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
