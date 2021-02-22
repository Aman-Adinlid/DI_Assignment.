package se.lexicon.Dao;

import org.springframework.stereotype.Component;
import se.lexicon.Model.Student;

import java.util.ArrayList;

import java.util.List;

@Component("StudentDao")

public class StudentDaoIml implements StudentDao {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public Student save(Student student) {

        if (student.getId() == 0) {
            student.setId(student.getId());
            studentList.add(student);
            Student original = find(student.getId());
            original.setName(student.getName());
            original.setName(student.getName());
        }

        return student;
    }

    @Override
    public Student find(int id) {

        return studentList.stream().filter(student -> student.getId() == id).findFirst().orElse(null);

    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public boolean delete(int id) {
        return studentList.removeIf(student -> student.getId() == id);
    }
}
