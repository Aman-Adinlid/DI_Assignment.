package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.dao.StudentDao;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

import java.util.List;
@Component
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
        System.out.println("Type student name: ");
        String newName = userInputService.getString();
        Student student = new Student();
        student.setName(newName);
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
        return studentDao.find(id);
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
        if (student == null) throw new IllegalArgumentException("Student is null");
        Student st = find(student.getId());
        if (st.getId() > 0) {
            System.out.println("The student is" + student);
            System.out.println("Type the new name of student: ");
            String name = userInputService.getString();
            Student edit = st;
            edit.setName(name);
            return edit;
        }
        return null;
    }
}
