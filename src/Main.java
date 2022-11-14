package src;

public class Main {
    public static void main(String[] args) {
        GareebBank account1=new GareebBank(1234, 1000,"Sachin",4.5);
        GareebBank account2=new GareebBank(4567, 1000,"Teju",4.5);

//        account1.setPassword("sachin", "sachinteju");
        account1.addMoney(100);
//        account1.withdrawMoney(50);
        System.out.println("Your total balance "+account1.checkBalance()+" Rs");
//        System.out.println("The interest for the year is "+account1.calculateRateOdInterest(2)+" RS");
        account2.credit(500, 1234,4567);
//        account2.addMoney(account1.withdrawMoney(70));
//        account2.withdrawMoney(50);
        System.out.println(account1.checkBalance());
        System.out.println(account2.checkBalance());

//        GhotlaBank scam1=new GhotlaBank(1234, 999, "Vijay Malya", 10,"dontReturnMoney");
//        scam1.withdrawMoney(450);
    }
}
