package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Config.StudentConfig;
import se.lexicon.Dao.StudentDao;
import se.lexicon.Model.Student;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao dao = context.getBean("StudentDao", StudentDao.class);
        Student createdStudent = dao.save(new Student(1, "test"));
        System.out.println("createdStudent = " + createdStudent);
    }

}
