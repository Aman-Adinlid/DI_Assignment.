package se.lexicon.Service;

import se.lexicon.Dao.StudentDao;
import se.lexicon.Model.Student;
import se.lexicon.Util.ScannerInputService;
import se.lexicon.Util.UserInputService;

import java.util.List;

public class StudentManagementCounselIml implements StudentManagement {

    private UserInputService scannerService;
    private StudentDao studentDao;
    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
