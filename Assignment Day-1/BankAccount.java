
public class BankAccount{
    public static void main(String[] args){
        details d=new details();
        d.setName("Ashish");
        d.setPassword("1999");
        d.withdrawAmount(600,"1999");
        d.Deposit(1000);
        d.setRate(7);
        d.ratecalculate();
        System.out.println(d.getAccountNumber());
        System.out.println(d.getRate());
        System.out.println(d.getBalance());

    } 
}