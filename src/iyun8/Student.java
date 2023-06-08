package iyun8;

public class Student {
    private String name;
    private String surname;
    private int age;

    private String groupName;

    public Student(String name, String surname, int age, String groupName){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupName = groupName;
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

    public String getGroupName() {
        return groupName;
    }
}
