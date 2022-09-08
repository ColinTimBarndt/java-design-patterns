package io.github.colintimbarndt.visitor_and_template;

public interface SchoolVisitor<T> {
    T visit(SchoolBuilding building);

    T visit(Classroom room);

    T visit(Student s);

    T visit(Teacher t);
}
