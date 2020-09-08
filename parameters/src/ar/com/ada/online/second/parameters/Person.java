package ar.com.ada.online.second.parameters;

public class Person {
    private String name;
    private Integer age;

    // constructores
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    // getters and setters


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
