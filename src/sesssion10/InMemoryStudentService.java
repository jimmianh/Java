package sesssion10;

import java.util.ArrayList;
import java.util.Scanner;

public class InMemoryStudentService implements StudentService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<>();
    @Override
    public boolean create(Student student) {
        listStudent.add(student);
        return true;
    }

    @Override
    public boolean delete(int studentId) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (studentId == listStudent.get(i).getId()) {
                listStudent.remove(i);
                System.out.println("Sinh vien da duoc xoa");
            }
        }
        return true;
    }

    @Override
    public boolean update(Student student) {
        for (int i = 0; i < listStudent.size(); i++) {
            int th = student.getId();
            int th2 = listStudent.get(i).getId();
            if (th == th2) {
                System.out.println("Vui long nhap id moi: ");
                int newId = scanner.nextInt();scanner.nextLine();
                System.out.println("Vui long nhap name moi: ");
                String newName = scanner.nextLine();
                Student newStudent = new Student(newId, newName);
                listStudent.set(i, newStudent);
                System.out.printf("Thong tin duoc update co id la : %d, name: %s\n", newId, newName);
            }
        }
        return true;
    }

    @Override
    public ArrayList<Student> getList() {
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            student.showInFormation();
        }
        return null;
    }

//    @Override
//    public
}
