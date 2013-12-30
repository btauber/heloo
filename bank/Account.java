
package bank;

public abstract class Account {
    protected String name;
    protected double balance;
    
    protected Account(String name,Double balance){
        this.name = name;
        this.balance = balance;
    }
    abstract void endOfMonth();
        
    
    public String getBalance(){
        String prompt = name + " Balance is:  "+balance;
        return prompt ;
    }
    public void addTransaction(double amount,String plusOrMinus ){
        if(plusOrMinus.equals("pos"))
        balance += amount;
        else
        balance -= amount;
    }
    
}
