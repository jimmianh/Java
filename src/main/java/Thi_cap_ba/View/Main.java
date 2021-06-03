package Thi_cap_ba.View;

import Thi_cap_ba.Controllers.Login;

public class Main {
    public static void main(String[] args) {
        LoginAdmin view = new LoginAdmin();
        Login control = new Login(view);
        // goi ham login
        boolean isok = false;
        isok = control.signIn();

        if(isok = true){
            System.out.println("mời bạn nhập các lựa chọn sau đây");
        }
    }
}
