

package contacts;


public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    
    public Contacts(String fname){
        firstName = fname;
    }
    public void setLastName(String lname){
        lastName = lname;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
}
