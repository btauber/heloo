
package bank;

public class Savings extends Account {
    
    protected Savings(String name, double balance){
        super(name,balance);
    }
    public double intrestRate;
    public void endOfMonth(){
        if(balance>1000)
        intrestRate = .025;
        else intrestRate = .015;
        double intrest = balance * intrestRate;
        addTransaction(intrest,"pos");
    }
    
    
}
