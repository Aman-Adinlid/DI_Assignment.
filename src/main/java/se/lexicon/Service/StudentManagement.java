package se.lexicon.Service;

import se.lexicon.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentManagement {

    Student create();

    Student save(Student student);

    Student find(int id);

    boolean remove(int id);

    List<Student> findAll();

    Student edit(Student student);
}
