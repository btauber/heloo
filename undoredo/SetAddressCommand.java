package undoredo;

public class SetAddressCommand implements Commandable {
    private Person person;
    private String address;
    
    public SetAddressCommand(Person person,String address) {
        this.person = person;
        this.address = address;
        
    }
    
    public void execute() {
        String oldAddress = person.getAddress();
        person.setAddress(address);
        address = oldAddress;
       
    }
}


