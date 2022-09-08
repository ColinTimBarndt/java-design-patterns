package io.github.colintimbarndt.visitor_and_template;

public abstract class Member implements SchoolVisitable {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
