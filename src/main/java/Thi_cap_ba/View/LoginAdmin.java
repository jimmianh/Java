package Thi_cap_ba.View;

import eBookShop.Controllers.RegisterController;
import Thi_cap_ba.Models.User;
import eBookShop.View.BookShop;

import java.sql.ResultSet;
import java.util.Scanner;

public class LoginAdmin {
        Scanner scanner = new Scanner(System.in);

        public void showMessage(String smg) {
            System.out.println(smg);
        }

        public User getUserInfo() {
            User user = new User();
            System.out.print("UserId: ");
            user.setUserID(scanner.nextInt());
            System.out.print("Username: ");
            user.setName(scanner.nextLine());
            System.out.print("Password: ");
            user.setPass(scanner.next());
            return user;
        }
    }
