package io.github.colintimbarndt.visitor_and_template;

public interface SchoolVisitable {
    <T> T accept(SchoolVisitor<T> visitor);
}
