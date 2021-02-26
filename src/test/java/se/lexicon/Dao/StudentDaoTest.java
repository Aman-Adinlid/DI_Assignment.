package se.lexicon.Dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.lexicon.config.InputServiceConfig;
import se.lexicon.dao.StudentDao;
import se.lexicon.model.Student;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {InputServiceConfig.class})
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test

    public void test_save() {
        Student expected = new Student(1, "Aman");
        Student actual = studentDao.save(new Student(1, "Aman"));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_find() {
        Student student = studentDao.save(new Student(1, "Aman"));
        int actualId = student.getId();
        int expectedId = 1;
        Assert.assertEquals(actualId, expectedId);
    }

    @Test
    public void test_findAll() {
        List<Student> studentList = studentDao.findAll();
        boolean expected = studentList.add(new Student(1, "Aman"));
        boolean actual = studentList.add(new Student(2, "Adam"));
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test_delete() {
        boolean expected = studentDao.delete(1);
        boolean actual = studentDao.delete(2);
        Assert.assertEquals(expected, actual);

    }
}
