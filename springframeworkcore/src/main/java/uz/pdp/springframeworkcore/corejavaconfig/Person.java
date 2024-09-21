package uz.pdp.springframeworkcore.corejavaconfig;

import lombok.Data;

@Data
public class Person {
    private String fullName;
    private String age;

    public Person() {
    }

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }
}
