package iyun6;

public class User {
    String name;
    String surname;
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String setName(String name) {
        return name;
    }
    public String getName() {
        return name;
    }
    public String setSurname(String surname) {
        return surname;
    }

    public String getSurname() {
        return surname;
    }
}
