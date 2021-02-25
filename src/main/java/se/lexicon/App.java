package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.Config.InputServiceConfig;
import se.lexicon.Config.StudentConfig;
import se.lexicon.Dao.StudentDao;
import se.lexicon.Model.Student;
import se.lexicon.Service.StudentManagement;
import se.lexicon.Util.ScannerInputService;
import se.lexicon.Util.UserInputService;

public class App {
    public static void main(String[] args) {
        //part1
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao dao = context.getBean("StudentDao", StudentDao.class);
        Student createdStudent = dao.save(new Student(1, "Aman"));
        // System.out.println("createdStudent = " + createdStudent);
        System.out.println("-------------------------");
        // Student findById = dao.find(1);
        // System.out.println("findById = " + findById);
        System.out.println("-------------------------");
        //dao.findAll().forEach(System.out::println);
        System.out.println("-------------------------");
        //boolean remove = dao.delete(1);
        //System.out.println("remove = " + remove);

        //part2
        System.out.println("_____________________________");
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(InputServiceConfig.class);
        UserInputService userInputService= context.getBean(UserInputService.class);

        //part3
        System.out.println("_________________________________");
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(InputServiceConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService scanner = context.getBean(UserInputService.class);
        StudentManagement management = context.getBean(StudentManagement.class);
        Student student = management.create();
        System.out.println(student);
        System.out.println("_______________________________");
        System.out.println(studentDao.find(1));
        System.out.println("________________________");
        Student st = studentDao.save(new Student("Adam"));
        System.out.println("st = " + st);
        System.out.println("________________________");
        boolean student1= studentDao.delete(1);
        System.out.println("student1");
        System.out.println("_______________________");
        studentDao.findAll().forEach(System.out::println);


    }

}
