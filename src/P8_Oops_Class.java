class Account{
    private long accountNumber;
    private long balance;

    public void deposit(long balance){
        this.balance= balance;
    }
    public void withdraw(long balance){
        long l = this.balance - balance;
        System.out.println(balance+" is withdraw, remained balance is "+l);
    }
}
public class P8_Oops_Class {

    public static void main(String[] args) {
        Account myAC= new Account();
        myAC.deposit(100);
        myAC.withdraw(30);
    }
}
