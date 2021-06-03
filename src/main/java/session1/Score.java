package session1;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
    int maths;
    int maths1;
    int science;
    int science1;
    int english;
    int english1;
    int total;
    int total1;
    int percent;
    int percent1;
    String name;


    Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập tên sinh viên 1");
        name = scanner.nextLine();
        System.out.println("vui lòng nhâp điểm toán");
        maths = scanner.nextInt();
        System.out.println("vui lòng nhập điểm lý");
        science= scanner.nextInt();
        System.out.println("vui lòng nhập điểm tiếng anh");
        english = scanner.nextInt();

        System.out.println("vui lòng nhập tên sinh viên 2");
        String name1 = scanner.nextLine();
        System.out.println("vui lòng nhâp điểm toán");
        maths1 = scanner.nextInt();
        System.out.println("vui lòng nhập điểm lý");
        science1= scanner.nextInt();
        System.out.println("vui lòng nhập điểm tiếng anh");
        english1 = scanner.nextInt();

        total = maths + science + english;
        System.out.printf("tổng điểm của %s là:%d \n", name,total);
        percent = total / 3;
        System.out.printf("phần trăm của %s là:%d \n", name, percent);


        total1 = maths1 + science1 + english1;
        System.out.printf("tổng điểm của %s là:%d \n", name1,total1);
        percent1 = total1 / 3;
        System.out.printf("phần trăm của %s là:%d\n", name1, percent1);

        if(percent > percent1){
            System.out.printf("phần trăm của %s nhiều hơn của %s\n", name, name1);
        }else {
            System.out.printf("phần trăm của %s nhiều hơn của %s\n", name1, name);
        }
        if(65 < percent & percent < 75){
            System.out.printf("%s nhận được học bổng 10000$ \n", name);
        } else if(percent > 75){
            System.out.printf("%s nhận được học bổng 20000$ \n", name);
        }

        if(65 < percent & percent < 75){
            System.out.printf("%s nhận được học bổng 10000$ \n", name1);
        } else if(percent1 > 75){
            System.out.printf("%s nhận được học bổng 20000$ \n", name1);
        }
    }
}
