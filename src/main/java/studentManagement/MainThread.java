package studentManagement;

import java.util.Scanner;

public class MainThread extends ServiceStudent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service= new ServiceStudent();
        System.out.println("Vui lòng nhập lựa chọn:" +"\n" + "1:Thêm sinh viên" +"\n" + "2:Show danh sách sinh viên" +"\n" + "3:Lưu sinh viên vào cơ sở dữ liệu");
        int num =scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("thêm sinh viên 1");
                Student student = new Student();
                service.create(student);
                break;
            case 2:
                service.getList();
                break;
        }
    }
}
