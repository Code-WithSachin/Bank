package src;

public interface Bank {
    public void addMoney(int money, int accountno);
    public int withdrawMoney(int money);
    public int checkBalance(int accountNo);
    public void credit(int money, int accountNo, int name);
    public double calculateRateOdInterest(int year);
}
