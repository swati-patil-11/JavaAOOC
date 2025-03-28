class BankAccount{
     protected double balance;

public BankAccount(double initialBalance){
this.balance=initialBalance;
}

public void deposit(double amount){
if(amount>0){
balance +=amount;
System.out.println("Deposited: $" + amount);
}

else{
System.out.println("Deposit amount must be positive");
}
}

public void withdraw(double amount){
if(amount>0 && balance >= amount){
balance-= amount;
System.out.println("Withdrawn: $" + amount);
}

else{
System.out.println("Insufficient balance or invalid amount.");
}
}

public void displayBalance(){
System.out.println("current balance: $" + balance);
}
}

class SavingsAccount extends BankAccount{
public SavingsAccount(double initialBalance){
super(initialBalance);
}

@Override
public void withdraw(double amount){
if(balance - amount >= 100){
super.withdraw(amount);
}

else{
System.out.println("Withdrawal denied!Balance cannot fall below $100.");
}
}
}

public class BankTest{
public static void main(String[]args){
SavingsAccount myAccount = new SavingsAccount(500);

     myAccount.displayBalance();
     myAccount.deposit(200);
     myAccount.withdraw(550);

     myAccount.withdraw(50);
     myAccount.displayBalance();
}
}