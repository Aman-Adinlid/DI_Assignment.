package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Config.StudentConfig;
import se.lexicon.Dao.StudentDao;
import se.lexicon.Model.Student;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao dao = context.getBean("StudentDao", StudentDao.class);
        Student createdStudent = dao.save(new Student(1, "Aman"));
        System.out.println("createdStudent = " + createdStudent);
        System.out.println("-------------------------");
        Student findById = dao.find(1);
        System.out.println("findById = " + findById);
        System.out.println("-------------------------");
        dao.findAll().forEach(System.out::println);
        System.out.println("-------------------------");
        boolean remove = dao.delete(1);
        System.out.println("remove = " + remove);
    }

}
