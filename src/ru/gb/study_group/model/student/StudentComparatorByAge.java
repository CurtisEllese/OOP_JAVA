package ru.gb.study_group.model.student;


import ru.gb.study_group.model.group.GroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<E extends GroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
