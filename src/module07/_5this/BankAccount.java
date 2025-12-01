package module07._5this;

public class BankAccount {
    private String holdersName;
    private int accountNum;
    private double accountBalance;
    
    // constructor w/o parameters
    public BankAccount(){
        this.holdersName = "unknown";
        this.accountNum = 000000;
        this.accountBalance = 0.0;
    }
    //constructor w/ parameters
    public BankAccount (String holdersName, int accountNum, double accountBalance){
        this.holdersName = holdersName;
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
    }

    //deposit method
    public double deposit(double depositAmount){
        this.accountBalance = this.accountBalance + depositAmount;
        return this.accountBalance;
    }

    //withdraw method
    public double withdraw(double withdrawAmount){
        if (this.accountBalance >= withdrawAmount){
            this.accountBalance = this.accountBalance - withdrawAmount;
        } else {
            System.out.println("Insufficient funds for this Withdrawal");
        }

        return this.accountBalance;

    }

     //toString method
    public String toString(){
        return this.holdersName + "'s Account: " + this.accountNum + "= $" + this.accountBalance;
    }

    //testing method
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        System.out.println(b1.toString());
        BankAccount b2 = new BankAccount("Jaqui", 123, 123.00);
        b2.withdraw(124.00);
        System.out.println(b2.toString());
        b2.deposit(120.00);
        System.out.println(b2.toString());
    }   

}
