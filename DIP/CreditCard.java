package DIP;

public class CreditCard implements BankCard {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    
    }
}