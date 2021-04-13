package session3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("Sản phẩm có sẵn trong shop:");
        product.setId("A1001");
        product.setName("hoa hồng");
        product.setPrice(10000);
        product.setStatus("Còn hàng");
        product.setQuantity(1000);
        System.out.println(product.toString());

        System.out.println("Sản phẩm shop đã bán hết:");
        Product product1 = new Product("A1002", "hoa cúc",5000, "het hàng", 0);
        product1.getId();
        product1.getName();
        product1.getPrice();
        product1.getStatus();
        product1.getQuantity();
        System.out.println(product1.toString());


    }
}
