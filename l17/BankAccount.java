public class BankAccount { 
    private int balance = 0; 
    
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount();
        System.out.println("Opening Balance is: " + myAccount.getBalance());
        myAccount.deposit(100);
        System.out.println("Balance is: " + myAccount.getBalance());
        myAccount.retrieve(50);
        System.out.println("Balance is: " + myAccount.getBalance());
        myAccount.deposit(30);
        System.out.println("Balance is: " + myAccount.getBalance());
        myAccount.retrieve(10);
        System.out.println("Balance is: " + myAccount.getBalance());
        myAccount.deposit(17);
        System.out.println("Balance is: " + myAccount.getBalance());
        myAccount.retrieve(100);
        System.out.println("Balance is: " + myAccount.getBalance());
        
        
        
    }

    public int getBalance() {
            return balance;
        }

    public synchronized void deposit(int money) { 
        balance = balance + money;
    }

    public synchronized int retrieve(int money) {
    int result = 0;
        if (balance > money) {
                result = money;
        } else {
                result = balance;
        }
    balance = balance - result;
    return result;
    }
}