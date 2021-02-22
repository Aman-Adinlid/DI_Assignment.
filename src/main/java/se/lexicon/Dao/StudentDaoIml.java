package se.lexicon.Dao;

import org.springframework.stereotype.Component;
import se.lexicon.Model.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component("StudentDao")

public class StudentDaoIml implements StudentDao {

    private Set<Student> appUsers = new HashSet<>();

    @Override
    public Student save(Student student) {


        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {
        return;
    }
}
