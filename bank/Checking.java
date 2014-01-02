
package bank;


public class Checking extends Account{
    
    protected Checking(String name, double balance){
        super(name,balance);
    }
    public void endOfMonth(){
        if(balance < 1500 ){
            double fee = 15;
            addTransaction(fee,"neg");
        }
    }
    
    
}
