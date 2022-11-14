package src;

public interface Bank {
    public void addMoney(int money);
    public int withdrawMoney(int money);
    public int checkBalance();
    public void credit(int money, int accountNo, int name);
    public double calculateRateOdInterest(int year);
}
