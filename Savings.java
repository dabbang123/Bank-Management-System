package bankAccountApp;

public class Savings extends Accounts{
    //List properties to specify  saving account
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor to initialize saving account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name , sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate(){
        rate = getBaseRate()-0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    //List methods to specify checking account

    public void showInfo(){
        super.showInfo();
        System.out.println("Savings Account features" + "\nSafety Deposit Box Id: " + safetyDepositBoxId + "\nSafety Deposit Box Key: " + safetyDepositBoxKey +"\n");
    }
}
