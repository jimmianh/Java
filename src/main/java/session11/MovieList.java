package session11;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        ArrayList<String> movieList = new ArrayList<>();
        movieList.add("phim a");
        movieList.add("phim b");
        movieList.add("phim c");
        movieList.add("phim d");
        movieList.add("phim e");

        Scanner scanner = new Scanner(System.in);
        //thêm phim mới
        System.out.println("thêm phim");
        System.out.println("Nhập tên phim");
        movieList.add(scanner.nextLine());
        System.out.println("Các phần tử trong mảng movieList sau khi thêm: " + movieList);
        // sửa tên phim
        System.out.println("Nhập số thứ tự phim");
        movieList.remove(scanner.nextInt());
         movieList.add(scanner.nextLine());
        System.out.println("xóa phim");
        String element = movieList.remove(scanner.nextInt());//gán phần tử đã xóa cho biến element
        System.out.println("Các phần tử trong mảng movieList sau khi xóa: " + movieList);
        System.out.println("Phần tử đã bị xóa là: " + element);
    }
}
