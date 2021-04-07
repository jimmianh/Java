package session2;

import java.util.Scanner;

public class Student {
    String studName;
    int stuAge;


    void dis(){
        System.out.println("Student name:" + studName);
        System.out.println("Student age:" + stuAge);
    }

    void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sinh vien");
        studName = scanner.nextLine();
        System.out.println("nhap tuoi sinh vien");
        stuAge = scanner.nextInt();
        System.out.printf("ten sinh vien :%s",studName);
        System.out.printf("Student age:%d" , stuAge);
    }

}
