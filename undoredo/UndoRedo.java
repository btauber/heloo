package undoredo;

public class UndoRedo {
    private static UndoRedoManager undoRedo = new UndoRedoManager();
    private static UndoRedoAddress undoRedoAdd = new UndoRedoAddress();
    
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName()+" "+person.getAddress());
        
        //p.setName("Bob");
        
        Commandable commandN = new SetNameCommand(person, "Bob");
        Commandable commandA = new SetAddressCommand(person, "123");
        commandN.execute();
        commandA.execute();
        undoRedo.addCommand(commandN);
        undoRedoAdd.addCommand(commandA);
        System.out.println(person.getName()+" "+person.getAddress());
        
        commandN = new SetNameCommand(person, "Charlei");
        commandA = new SetAddressCommand(person, "543");
        commandN.execute();
        commandA.execute();
        undoRedo.addCommand(commandN);
        undoRedoAdd.addCommand(commandA);
        System.out.println(person.getName()+" "+person.getAddress());
        
        commandN = new SetNameCommand(person, "Joe");
        commandA = new SetAddressCommand(person, "165");
        commandN.execute();
        commandA.execute();
        undoRedo.addCommand(commandN);
        undoRedoAdd.addCommand(commandA);
        System.out.println(person.getName()+" "+person.getAddress());
        
        while(undoRedoAdd.canUndo()) {
            undoRedoAdd.undo();
            System.out.println(person.getName()+" "+person.getAddress());
        }
        
        while(undoRedoAdd.canRedo()) {
            undoRedoAdd.redo();
            System.out.println(person.getName()+" "+person.getAddress());
        }
    }
}
