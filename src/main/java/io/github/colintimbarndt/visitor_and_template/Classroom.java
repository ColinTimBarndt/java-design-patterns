package io.github.colintimbarndt.visitor_and_template;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Classroom implements SchoolVisitable {
    private Teacher teacher = null;
    private final Set<Student> students = new HashSet<>();

    public Classroom() {}

    @Override
    public <T> T accept(SchoolVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }
}
