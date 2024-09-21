package uz.pdp.springframeworkcore.advancedwiring;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
public class Person {
    private String fullName;
    private String age;
    private List<String> nickNames = new ArrayList<>();
    private Map<String, String> nickNamesWithMap = new HashMap<>();

    private Person() {
    }

    public static Person getInstance() {
        System.out.println("Inside Factory Method");
        return new Person();
    }

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println(this);
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public Map<String, String> getNickNamesWithMap() {
        return nickNamesWithMap;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }

    public void setNickNamesWithMap(Map<String, String> nickNamesWithMap) {
        this.nickNamesWithMap = nickNamesWithMap;
    }

    private void init() {
        System.out.println("(Person)....Bean initializing");
    }

    private void destroy() {
        System.out.println("(Person)....Bean destroyed");
    }
}
