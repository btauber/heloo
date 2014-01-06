package names;

public class Organization implements NameAndAddress {
     private HasName myName = new HasName();
    
    public void setName(String name)
    {
        myName.setName(name);
    }
    
    public String getName()
    {
        return myName.getName();
    }
    
    public void setAddress(String Address)
    {
       myName.setAddress(Address);
    } 
    
    public String getAddress()
    {
        return myName.getAddress();
    }
}
