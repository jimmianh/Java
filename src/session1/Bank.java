package session1;

public class Bank {
    private double balance = 1000;
    private double rate = (balance/100)*10;


    public Bank() {}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}

    public double getRate() {return rate;}

    public void setRate(double rate) {this.rate = rate;}

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest(){
        double interest ;
        interest = balance * (rate / 1200);
        System.out.printf("lai xuat khi gui %f $ la: %f $", balance,interest);
        return interest;
    }
}
