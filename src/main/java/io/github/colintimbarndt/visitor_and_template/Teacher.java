package io.github.colintimbarndt.visitor_and_template;

public class Teacher extends Member {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public <T> T accept(SchoolVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
