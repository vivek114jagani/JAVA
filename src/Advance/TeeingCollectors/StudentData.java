package Advance.TeeingCollectors;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StudentData {

    public static void main(String[] args) throws IOException {

        List<Student> students = Arrays.asList(
                new Student(1, "Robert", 390),
                new Student(2, "Julie", 410),
                new Student(3, "John", 440),
                new Student(4, "Michael", 420)
        );

        // Collect the result in hash map.
        HashMap<String, Student> result = students.stream().collect(
                // apply the teeing operator.
                Collectors.teeing(
                        // get the student having highest marks.
                        Collectors.maxBy(Comparator.comparing(Student::getMarks)),
                        // get the student having lowest marks.
                        Collectors.minBy(Comparator.comparing(Student::getMarks)),
                        // put both student entries in the map using merger.
                        (s1, s2) -> {
                            HashMap<String, Student> map = new HashMap<>();
                            map.put("Highest", s1.get());
                            map.put("Lowest", s2.get());
                            return map;
                        }
                )
        );

        System.out.println(result);
    }
}

class Student {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [RollNo = " + rollNo + ", Name = " + name + ", Marks = " + marks + "]";
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
