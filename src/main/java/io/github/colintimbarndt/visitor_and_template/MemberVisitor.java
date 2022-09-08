package io.github.colintimbarndt.visitor_and_template;

/**
 * This class visits every member of a {@link SchoolBuilding}.
 * @param <T> resulting type of the visitor
 */
public abstract class MemberVisitor<T> implements SchoolVisitor<T> {
    protected abstract T combine(T left, T right);
    protected abstract T visit(Member m);

    /**
     * @return Value to return when something contains no members.
     */
    protected abstract T getEmpty();

    @Override
    public T visit(SchoolBuilding building) {
        T result = getEmpty();
        for (var room : building.getRooms().values()) {
            result = combine(result, room.accept(this));
        }
        return result;
    }

    @Override
    public T visit(Classroom room) {
        T result;
        var teacher = room.getTeacher();
        if (teacher != null) result = teacher.accept(this);
        else result = getEmpty();

        for (var student : room.getStudents()) {
            result = combine(result, student.accept(this));
        }

        return result;
    }

    @Override
    public T visit(Student s) {
        return visit((Member) s);
    }

    @Override
    public T visit(Teacher t) {
        return visit((Member) t);
    }
}
