package se.lexicon.Service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.lexicon.config.InputServiceConfig;
import se.lexicon.dao.StudentDao;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InputServiceConfig.class})
public class StudentManagementTest {

    @Autowired
    UserInputService userInputService;
    @Autowired
    StudentDao studentDao;

    @Test
    public void test_create(){

    }
    @Test
    public void test_save(){
            Student expected = new Student("Aman");
            Student actual = studentDao.save(new Student("Aman"));
            Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findById(){
        Student student = studentDao.save(new Student(1,"Aman"));
        int actual = student.getId();
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test_remove(){
        boolean expected = studentDao.delete(1);
        boolean actual = studentDao.delete(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test_findALL(){
        List<Student> studentList = studentDao.findAll();
          studentList.add(new Student(1, "Aman"));
          studentList.add(new Student(2, "Adam"));
    }

@Test
    public void test_edit(){

}
}
