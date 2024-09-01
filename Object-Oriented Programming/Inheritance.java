package inheritance;

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob); 
    }
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob); 
    }
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}



public class Inheritance {

    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount("SA123", "John Doe", "123 Elm Street", "555-1234", "01-01-1980");
        System.out.println("Savings Account Created:");
        System.out.println("Account No: " + savings.getAccNo());
        System.out.println("Name: " + savings.getName());
        System.out.println("Address: " + savings.getAddress());
        System.out.println("Phone: " + savings.getPhno());
        System.out.println("DOB: " + savings.getDOB());
        System.out.println("Balance: " + savings.getBalance());
        
        savings.deposit(5000);
        System.out.println("\nDeposited 5000 into Savings Account");
        System.out.println("Balance: " + savings.getBalance());
        
        savings.withdraw(2000);
        System.out.println("\nWithdrew 2000 from Savings Account");
        System.out.println("Balance: " + savings.getBalance());
        
        LoanAccount loan = new LoanAccount("LA123", "Jane Smith", "456 Oak Avenue", "555-5678", "02-02-1985");
        System.out.println("\nLoan Account Created:");
        System.out.println("Account No: " + loan.getAccNo());
        System.out.println("Name: " + loan.getName());
        System.out.println("Address: " + loan.getAddress());
        System.out.println("Phone: " + loan.getPhno());
        System.out.println("DOB: " + loan.getDOB());
        System.out.println("Balance: " + loan.getBalance());
        
        loan.balance = -10000; 
        System.out.println("\nLoan taken: 10000");
        System.out.println("Balance (Loan amount owed): " + loan.getBalance());
        
        loan.payEMI(2000);
        System.out.println("\nPaid EMI of 2000");
        System.out.println("Balance (Loan amount owed): " + loan.getBalance());
        
        loan.repay(8000);
        System.out.println("\nRepaid the remaining loan of 8000");
        System.out.println("Balance (Loan amount owed): " + loan.getBalance());
    }
}
