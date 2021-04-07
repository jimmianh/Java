package session2;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        int choose;

        Student obj = new Student();
        obj.scan();

        System.out.println("ban co muon them sinh vien??");
        System.out.println("nhan phim 1 de them sinh vien , nhan phim 2 de thoat");
        Scanner scanner =new Scanner(System.in);
        choose = scanner.nextInt();
        if(choose == 1){
            Student obj1 = new Student();
            obj1.scan();
        }
        else{
            System.out.println("thank!!");
        }
    }
}
