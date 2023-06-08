package iyun8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Harry", "Potter", 20, "A"));
        students.add(new Student("Jane", "Doe", 19, "B"));
        students.add(new Student("Jack", "Johnson", 18, "A"));
        students.add(new Student("Jill", "Smith", 17, "C"));
        students.add(new Student("Peter", "Pen", 20, "B"));
        students.add(new Student("Mark", "Artur", 20, "A"));

        Optional<Student> oldestStudent = students.stream()
                .max(Comparator.comparingInt(Student::getAge));
        if (oldestStudent.isPresent()) {
            int maxAge = oldestStudent.get().getAge();
            List<String> oldestStudents = students.stream()
                    .filter(student -> student.getAge() == maxAge)
                    .map(Student::getName)
                    .toList();
            System.out.println("Oldest students (age " + maxAge + "): " + oldestStudents);
        }


        Map<String, List<String>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getGroupName,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        groupedStudents.forEach((groupName, names) -> {
            System.out.println("Group: " + groupName);
            System.out.println("Names: " + names);
            System.out.println();
        });
    }
}
