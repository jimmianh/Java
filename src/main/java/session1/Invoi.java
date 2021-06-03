package session1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Invoi {
    public static void main(String[] args) {
        int quantityShirts ;
        int quantityTrousers;
        int priceShirts = 300;
        int priceTrouser = 700;
        int totalShirts;
        int totalTrousers;
        int netTotal;
        int pointsEarned;
        int total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap sp1");
        quantityShirts = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap so luong sp2");
        quantityTrousers = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Item         Quantity        Price         Total");
        System.out.println("------------------------------------------------");
        totalShirts = quantityShirts * priceShirts;
        System.out.printf("Shirts          %d             %d              %d\n", quantityShirts, priceShirts, totalShirts);
        totalTrousers = quantityTrousers * priceTrouser;
        System.out.printf("Trousers        %d             %d              %d\n", quantityTrousers, priceTrouser,totalTrousers);
        total = totalShirts + totalTrousers;
        int discount = total/10;
        if(total >3000){
                netTotal= total-discount;
        }else {
            discount=0;
            netTotal =total;
        }
        System.out.println("Discount                                  "+ discount);
        System.out.println("------------------------------------------------");
        System.out.println("Net Total                                   "+ netTotal);
        System.out.println("------------------------------------------------");
        pointsEarned = netTotal/100;
        System.out.println("Points Earned:"+ pointsEarned);
        System.out.println("Thank you!");
    }
}
