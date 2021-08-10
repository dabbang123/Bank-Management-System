package bankAccountApp;

public abstract class Accounts implements IBaseRate {
    //List common properties for savings and checking account
    private String name;
    private String sSN;     //social security number
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int index = 10000;



    //Constructor to set base properties and initialize the account
    public Accounts(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    public void compoundInterest(){
        double compoundInterest = balance * (rate/100);
        balance = balance + compoundInterest;
        System.out.println("Compound Interest is " + compoundInterest + "rs");
        printBalance();
    }

    //Generate Account Number
    private String setAccountNumber(){
        String last2OfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return last2OfSSN + uniqueID + randomNumber;
    }

    //List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing rs " + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing rs " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring rs " + amount + "to" + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your Balance is " + balance);
    }

    public void showInfo(){
        System.out.println("Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance + "rs" + "\nRate: " + rate +"%");
    }



}
