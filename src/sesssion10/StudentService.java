package sesssion10;

import java.util.ArrayList;

public interface StudentService {
    boolean create(Student student);
    boolean delete(int studentId);
    boolean update(Student student);
    ArrayList<Student> getList();
}