package aida.aida.model;

import java.util.Comparator;

/**
 * Created by fengdaqing on 2018/7/25.
 */
public class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    private String job;

    public Student(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public int compareTo(Student o) {
        Comparator<Student> naturalOrderComparator = Comparator.comparing(Student::getName);
        return naturalOrderComparator.compare(this, o);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (student.getName() == this.getName() && student.getAge() == this.getAge()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1000;
    }
}
