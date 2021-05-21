package studentManagement;

import java.util.ArrayList;

public interface Service {
    boolean create(Student student);

    ArrayList<Student> getList();
}
