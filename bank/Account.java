
package bank;

import java.text.NumberFormat;

 public abstract class Account implements Printable  {
    protected String name;
    protected double balance;
    
    protected Account(String name,Double balance){
        this.name = name;
        this.balance = balance;
    }
   abstract void endOfMonth();
        
    
    public String getBalance(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String prompt = name + " Balance is:  "+ currency.format(balance);
        return prompt ;
    }
    public void addTransaction(double amount,String plusOrMinus ){
        if(plusOrMinus.equals("pos"))
        balance += amount;
        else
        balance -= amount;
    }
    public void print(Printable acct){
        Class c = acct.getClass();
        
       System.out.println("Account   :"+ c.getSimpleName() + "\n My Name:    "+name+"\n My Balance is:    "+balance);
    }
    
}
