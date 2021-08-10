package bankAccountApp;

import java.util.*;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Accounts> accounts = new LinkedList<>();

        //Read  a csv file and create account based on that file
        String file = "C:\\Users\\abhis\\Downloads\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolders : newAccountHolders){
            String name = accountHolders[0];
            String sSN = accountHolders[1];
            String accountType = accountHolders[2];
            double initDeposit = Double.parseDouble(accountHolders[3]);

            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));

            }else if (accountType.equals("Current")){
                accounts.add(new Current(name, sSN, initDeposit));

            }else {
                System.out.println("Error Reading a Account");

            }
        }

        for (Accounts acc : accounts){
            System.out.println("***************************************\n");
            acc.showInfo();
        }


 //       Current currAcc1 = new Current("Abhishek Vishwakarma", "987654321", 10000);
//        Savings savAcc1 = new Savings("Bhavesh Yadav", "123456789", 2500);
//        currAcc1.showInfo();
//        System.out.println("*********************************************");
//        savAcc1.showInfo();
    }
}
