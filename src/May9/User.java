package May9;

public class User {
    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]{3,}")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must contain only letters and be at least 3 characters long.");
        }
    }

    public void setSurname(String surname) {
        if (surname.matches("[a-zA-Z]{3,}")) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Surname must contain only letters and be at least 3 characters long.");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 18 and 100.");
        }
    }
}
