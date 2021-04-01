package session1;

import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        float diemToan;
        float diemLy;
        float diemHoa;

        Scanner scanner = new Scanner(System.in);
// nhập điểm toán
        System.out.println("Xin mời nhập điểm toán");
        diemToan = scanner.nextFloat();
// nhập điểm lý
        System.out.println("Xin mời nhập điểm lý");
        diemLy = scanner.nextFloat();

        System.out.println("Xin mời nhập điểm hóa");
        diemHoa = scanner.nextFloat();
// nhập điểm hóa
        float trungBinh;
        trungBinh = (diemToan + diemLy +diemHoa)/3;

        System.out.printf("Điểm trung bình:%f", trungBinh);

    }
}
