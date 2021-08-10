package bankAccountApp;

public class Current extends Accounts{
    //List properties to specify  checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties
    public Current(String name,String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
     }

    //List methods to specify checking account

    public void showInfo(){
        super.showInfo();
        System.out.println("Current Account Features" + "\nDebit Card Number: " + debitCardNumber + "\nDebit Card Pin: " + debitCardPin +"\n");
    }

}
