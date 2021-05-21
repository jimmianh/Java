package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceStudent implements Service {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<>();

    @Override
    public boolean create(Student student) {
        Student student1 = new Student();
        System.out.println("Nhập StudentID:");
        student1.setStudentID(scanner.nextLine());
        System.out.println("Nhập Tên:");
        student1.setStudentName(scanner.nextLine());
        System.out.println("Nhập địa chỉ:");
        student1.setAddress(scanner.nextLine());
        System.out.println("Nhập số điện thoại:");
        student1.setPhone(scanner.nextLine());
        listStudent.add(student);
        return true;
    }

    @Override
    public ArrayList<Student> getList() {
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            student.toString();
        }
        return null;
    }
}
