package ru.gb.tests.study_group.model.group;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<E> implements Iterator<E> {
    private List<E> students;
    private int index;

    public StudentIterator (List<E> studentsList) {
        this.students = studentsList;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public E next() {
        return students.get(index++);
    }
}
