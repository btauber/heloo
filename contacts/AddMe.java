package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMe {
    private ArrayList <Contacts> myContacts = new ArrayList<Contacts>();
    String newLine = System.getProperty("line.separator");
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AddMe addme = new AddMe();
        for(;;){
            addme.myControler();
        }
    }
    public void startAdding(Contacts newContact,String lname,String address,String phone){
        myContacts.add(newContact);
        newContact.setLastName(lname);
        newContact.setAddress(address);
        newContact.setPhone(phone);
    }
    public void printContact(Contacts each){
        String getOutTheFirstName = each.getFirstName();
                    String getOutTheLastName = each.getLastName();
                    String getOutTheAddress = each.getAddress();
                    String getOutThePhone = each.getPhone();
                    System.out.println(getOutTheLastName +" " + getOutTheFirstName+newLine+getOutTheAddress+newLine+getOutThePhone);
                    
    }
    
    public void myControler(){
        System.out.println("Welcome to my Roledex"+newLine+"To add Contact type a"+newLine+"To look up Contact type b"+newLine+"To edit type c");
        String input = scanner.nextLine();
    switch (input){
        case "a":
            String more = "y";
            while(more.equalsIgnoreCase("y")){
            System.out.println("Enter first name of new contact");
        Contacts newContact = new Contacts(scanner.nextLine());
            System.out.println("Enter last name of new Contact");
            String lname = scanner.nextLine();
            System.out.println("Enter address of new Contact");
            String address = scanner.nextLine();
            System.out.println("Enter Phone number of new Contact");
            String phone = scanner.nextLine();
            startAdding(newContact,lname,address,phone);
            System.out.println("Do you like to add more Contacts? y/n");
            more = scanner.nextLine();
            }
             break;
        case "b": 
            System.out.println("Please enter the phone Number");
            String phoneSearch = scanner.nextLine();
            int i = 0;
            
            for(Contacts each:myContacts){
                if(each.getPhone().equalsIgnoreCase(phoneSearch)){
                    printContact(each);
                    i++;
                    break;
                }
            }
                          if(i!=1){
                              System.out.println("sorry please add his name to the contact list");
                          }
                     break;  
        case "c":
            int p = 0;
            System.out.println("Please enter the phone Number which you whould like to edit");
                     String thePhoneSearch = scanner.nextLine();
                        for(Contacts each:myContacts){
                            if(each.getPhone().equalsIgnoreCase(thePhoneSearch)){
                                printContact(each);
                                System.out.println("To edit address type a"+newLine+"To edit phone number type b");
                                String editItem = scanner.nextLine();
                                    switch (editItem){
                                        case "a":
                                            System.out.println("Enter new Address ");
                                            String editAddress = scanner.nextLine();
                                            each.setAddress(editAddress);
                                            break;
                                        case "b":
                                            System.out.println("Enter new Phone number ");
                                            String editPhone = scanner.nextLine();
                                            each.setPhone(editPhone);
                                            break;
                                    }
                                                printContact(each);
                    
                               p++;
                            }
                        }
                        if(p!=1){
                              System.out.println("sorry please add his name to the contact list");
                          }
                            break;
    }           
    }
}
