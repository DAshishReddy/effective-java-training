class details {
    private int AccountNumber=1;
    private String name;
    private String password;
    private float Balance=5000;
    private float Rate;
    public details() {
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public float getBalance() {
        return Balance;
    }
   
    public float getRate() {
        return Rate;
    }
    public void setRate(float rate) {
        Rate = rate;
    }
    
    public void withdrawAmount(int n,String s){
        if(s==password){
        if(n<Balance && n>0 ){
            Balance-=n;
            System.out.println("withdrawn success of"+n+" balance is "+Balance );
        }
        else if(n==0 || n<0){
            System.out.println("wrong input");
        }
        else {
            System.out.println("withdrawn cannot be done due to insufficient balance");
        }
    }
    else{
        System.out.println("Incorrect password");
    }
    }
    public void Deposit(int a){
        if(a<=0){
            System.out.println("Amount to be deposited should be positive");
        }    
        else
        {
            Balance+=a;
            System.out.println("deposit the "+a+" balance after deposit is "+Balance);
        }
    }
    public void ratecalculate(){
        Balance+=(Balance*Rate/1200);
        System.out.println("after 1 month of rate "+Rate+" balance is "+Balance);
    }
    
}