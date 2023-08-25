package ru.gb.study_group.group;

import ru.gb.study_group.student.StudentIterator;
import ru.gb.study_group.student.Student;
import ru.gb.study_group.student.StudentComparatorByAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        Collections.sort(studentList);
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge());
    }
}
