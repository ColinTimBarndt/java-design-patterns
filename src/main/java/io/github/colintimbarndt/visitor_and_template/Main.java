package io.github.colintimbarndt.visitor_and_template;

public class Main {
    public static void main(String[] args) {
        var school = createSchool();

        System.out.printf("The school has %d people inside", MemberCounter.INSTANCE.visit(school));
    }

    private static SchoolBuilding createSchool() {
        var school = new SchoolBuilding();

        var room0 = new Classroom();
        room0.addStudent(new Student("Dustin"));
        school.addRoom(0, room0);

        var room42 = new Classroom();
        room42.addStudent(new Student("Hans"));
        room42.addStudent(new Student("Jessica"));
        room42.setTeacher(new Teacher("Moe"));
        school.addRoom(42, room42);

        return school;
    }
}
