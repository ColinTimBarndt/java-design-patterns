package io.github.colintimbarndt.visitor_and_template;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SchoolBuilding implements SchoolVisitable {
    private final Map<Integer, Classroom> rooms = new HashMap<>();

    public SchoolBuilding() {}

    @Override
    public <T> T accept(SchoolVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Map<Integer, Classroom> getRooms(){
        return Collections.unmodifiableMap(rooms);
    }

    public void addRoom(Integer number, Classroom room) {
        rooms.put(number, room);
    }
}
