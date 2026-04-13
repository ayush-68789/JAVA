public class Bank 
{
    private String acc_num  ;
    private int balance ;

    public Bank (String num , int bal)
    {
        this.acc_num = num ;
        this.balance = bal ;
    }

    public void display()
    {
        System.out.println("Account num : "+this.acc_num);
        System.out.println("Balance : "+this.balance);
    }

    public void withdraw(int amt)
    {
        if(this.balance >= amt)
        {
            this.balance -= amt ;   // setter 
        }
        else
        {
            System.out.println("Not enough Balance");
        }
    }
    public int getBalance()   // getter
    {
        return this.balance ;
    } 
    protected void getaccnum()
    {
        System.out.println(this.acc_num);
    }
}
