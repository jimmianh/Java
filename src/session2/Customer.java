package session2;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;


    void changeCustomerAddress(String address){
        customerAddress = address;
    }

    void displayCustomerInformation(){
        System.out.println("customer Identification Number:"+ customerID);
        System.out.println("customer Name:" + customerName);
        System.out.println("customer Address" + customerAddress);
        System.out.println("customer age" +customerAge);
    }
}
