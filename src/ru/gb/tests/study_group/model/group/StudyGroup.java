package ru.gb.tests.study_group.model.group;


import ru.gb.tests.study_group.model.student.StudentComparatorByAge;
import ru.gb.tests.study_group.model.student.StudentComparatorByName;
import ru.gb.tests.study_group.model.student.StudentIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudyGroup<E extends GroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student) {
        studentList.add(student);
    }


    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<E>(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<E>());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge<E>());
    }
}
