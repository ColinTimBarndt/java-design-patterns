package io.github.colintimbarndt.visitor_and_template;

public class Student extends Member {
    public Student(String name) {
        super(name);
    }

    @Override
    public <T> T accept(SchoolVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
