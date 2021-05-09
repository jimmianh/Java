package session11;

import com.sun.glass.ui.Size;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("vui lòng nhập số phần tử trong mảng");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] mangSo = new int[num];
        int sum = 0;
        System.out.println("nhập các phần tử trong mảng");
        for (int i = 0; i < num; i++) {
            System.out.println("phần tử " + (i+1) + " giá trị bằng :");
            mangSo[i] = scan.nextInt();
            sum += mangSo[i];
            System.out.println("");
        }
        System.out.println("-----------");


        double average = (double) sum / num;
        System.out.println("trung bình là:" + average);
    }
}
