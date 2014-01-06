package names;

public class Names {
    public static void main(String[] args) {
        //Nameable n = new Nameable();
        
        NameAndAddress p = new Person();
        p.setName("Bob");
        p.setAddress("212 4th street");
        
        NameAndAddress o = new Organization();
        o.setName("PCS");
        o.setAddress("134 E9th street");
        
        System.out.println(p.getName()+ "\n" + p.getAddress());
        System.out.println(o.getName()+ "\n" + o.getAddress());
    }
}
