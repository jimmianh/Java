package session8;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void diem(){
        Scanner scanner = new Scanner(System.in);
        Point a = new Point(x ,y);
        System.out.println("xin mời nhập tọa độ điểm A");
        System.out.printf("X=");
        x = scanner.nextInt();
    }

    public void perimeter(){

    }
}


