package se.lexicon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.Dao.StudentDao;
import se.lexicon.Model.Student;
import se.lexicon.Util.UserInputService;

import java.util.List;

public class StudentManagementConsoleIml implements StudentManagement {

    private UserInputService userInputService;
    private StudentDao studentDao;

    @Autowired
    public void setScannerService(UserInputService userInputService) {
        this.userInputService = userInputService;
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        String name = userInputService.getString();
        Student student = new Student();
        student.setName(name);

        return save(student);
    }

    @Override
    public Student save(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("NAME IS NOT VALID");
        }

        return studentDao.save(student);

    }

    @Override
    public Student find(int id) {
        if (id == 0) {
            throw new IllegalArgumentException("Id is not be null");
        }
        return studentDao.find(userInputService.getInt());
    }

    @Override
    public boolean remove(int id) {
        return studentDao.delete(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
