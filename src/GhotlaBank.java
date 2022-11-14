//package src;
//
//import java.util.Scanner;
//
//public class GhotlaBank implements Bank{
//    private String password="sachin";
//    private int accountNo;
//    private int balance;
//    private String name;
//    private double interestRate;
//
//    public void setPassword(String oldpassword, String newPassword){
//        if(oldpassword.equals(this.password)){
//            this.password=newPassword;
//            System.out.println("Password has updated succesfully!");
//        }else{
//            System.out.println("Wrong old Password");
//        }
//    }
//
//    public GhotlaBank(int accountNo, int balance, String name, double interestRate) {
//        this.accountNo = accountNo;
//        this.balance = balance;
//        this.name = name;
//        this.interestRate = interestRate;
//    }
//
//
//    @Override
//    public void addMoney(int money) {
//        balance+=money;
//        System.out.println(name+" Amount of "+money+" Rs has been added now your total balance is "+balance+" Rs");
//    }
//
//    @Override
//    public int withdrawMoney(int money) {
//            if(money<=balance){
//                balance-=money;
//                System.out.println(name+" Amount of "+money+" Rs has been withdrwan now you total balance is "+balance+" Rs");
//            }else{
//                System.out.println("You are Garib!");
//            }
//            return money;
//    }
//
//    @Override
//    public int checkBalance() {
//        return balance;
//    }
//
//    @Override
//    public double calculateRateOdInterest(int year) {
//        return balance*interestRate*year/100;
//    }
//}
