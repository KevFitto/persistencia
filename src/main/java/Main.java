import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao daoStudent = new StudentDao();
        Student student = new Student();
        student.setName("Andrea Cuadra");
        student.setId(1234L);
        student.setMajor("Ingenieria en sistemas");
        daoStudent.save(student);
    }
}
