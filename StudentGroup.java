package oop1232;

import java.util.List;


public record StudentGroup<T extends User>(String nameGroup, List<T> group) {

    public void addStudent(T user) {
        group.add(user);
    }

    public void removeStudent(T user) {
        group.remove(user);
    }
    // параметризованный класс для группы. Хранит имя и список студентов.
}
