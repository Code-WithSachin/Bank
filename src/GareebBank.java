package src;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GareebBank implements Bank{
    private String password="sachin";
    int accountNo;
    int balance;
    String name;
    double interestRate;
    static HashMap<Integer, Pair>map=new HashMap<Integer, Pair>();


    public void setName(String name) {
        this.name = name;
    }

//    public int getAccountNo() {
//        return accountNo;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public String getName() {
//        return name;
//    }

    public void setPassword(String oldpassword, String newPassword){
        if(oldpassword.equals(this.password)){
            this.password=newPassword;
            System.out.println("Password has updated succesfully!");
        }else{
            System.out.println("Wrong old Password");
        }
    }

    public GareebBank(int accountNo, int balance, String name, double interestRate) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.interestRate = interestRate;
        Pair value= new Pair(name, balance);
        map.put(accountNo, value);
    }


    @Override
    public void addMoney(int money, int accountNo) {
        Pair data = map.get(accountNo);
        data.balance+=money;
        map.put(accountNo, new Pair(data.name,data.balance));
        System.out.println(name+" Amount of "+money+" Rs has been added now your total balance is "+balance+" Rs");
    }

    @Override
    public int withdrawMoney(int money) {
            if(money<=balance){
                balance-=money;
                System.out.println(name+" Amount of "+money+" Rs has been withdrwan now you total balance is "+balance+" Rs");
            }else{
                System.out.println("You are Garib!");
            }
            return money;
    }


    @Override
    public int checkBalance(int accountNo) {
        Pair data = map.get(accountNo);
        return data.balance;
    }

    @Override
    public void credit(int money, int accountNo1, int accounNo2) {
        if(map.containsKey(accountNo1)){
            Pair secPersonInfo=map.get(accounNo2);
            if(secPersonInfo.balance>=money){
                Pair firstPersonInfo=map.get(accountNo1);
                int firsrtPersonbal=firstPersonInfo.balance+money;
                int secPersonbal=secPersonInfo.balance-money;
                map.put(accountNo1, new Pair(firstPersonInfo.name, firsrtPersonbal));
                map.put(accounNo2, new Pair(secPersonInfo.name, secPersonbal));
                System.out.println(firstPersonInfo.name+" "+money+" has been debited to your account and now your total balance is "+firsrtPersonbal);
                System.out.println(secPersonInfo.name+" "+money+" has been credited from your account and now your total balance is "+secPersonbal);
            }else{
                System.out.println(secPersonInfo.name+" has not required amount money");
            }
        }else{
            System.out.println("Invalid account Number!");
        }
    }


    @Override
    public double calculateRateOdInterest(int year) {
        return balance*interestRate*year/100;
    }
}
