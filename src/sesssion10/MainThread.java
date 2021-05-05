package sesssion10;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new InMemoryStudentService();
        Student student = new Student(1234, "anh");
        Student student1 = new Student(1235, "ngoc anh");
        Student student2 = new Student(1236, "Nhat");
        Student student3 = new Student(1237, "Thuan");

        studentService.create(student);
        studentService.create(student1);
        studentService.create(student2);
        studentService.create(student3);
        studentService.getList();


        System.out.println("Vui long nhap id sinh vien muon update: ");
        student.setId(scanner.nextInt());scanner.nextLine();
        studentService.update(student);
        studentService.getList();

        System.out.println("Vui long nhap id sinh vien muon delete: ");
        student.setId(scanner.nextInt());scanner.nextLine();
        studentService.delete(student.getId());
        studentService.getList();

    }
}
